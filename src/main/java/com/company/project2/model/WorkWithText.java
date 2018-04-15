package com.company.project2.model;

import com.company.project2.model.entities.Letter;
import com.company.project2.model.entities.Sentence;
import com.company.project2.model.entities.Text;
import com.company.project2.model.entities.Word;

import java.util.ArrayList;
import java.util.List;

public class WorkWithText {

   private Text text;

   public WorkWithText(){}

   //сортировка слов, начинающихся на гласную букву, по первой согласной букве
   public String sortVowelsWords(){
       List<Word> vowelsWords = getVowelsWords();
       for (int i = 0; i < vowelsWords.size(); ++i) {
           for (int j = i + 1; j < vowelsWords.size(); ++j) {
               if (findConsonants(vowelsWords.get(j)) < findConsonants(vowelsWords.get(i))) {
                   Word t = vowelsWords.get(i);
                   vowelsWords.set(i,vowelsWords.get(j));
                   vowelsWords.set(j,t);
               }
           }
       }
       StringBuilder stringBuilder = new StringBuilder();
       for (Word w:vowelsWords) {
           stringBuilder.append(w);
           stringBuilder.append(" ");
       }
       return stringBuilder.toString();
   }

   //поиск первой согласной буквы в слове
   private char findConsonants(Word word){
       for (int i=0;i<word.getLetters().size();i++){
           if(!isVowelLetter(word.getLetters().get(i))){
               return word.getLetters().get(i).getLetter();
           }
       }
       return ' ';
   }

   //поиск слов, начинающихся с гласной буквы
   private List<Word> getVowelsWords(){
       List<Word> listOfVowels = new ArrayList<>();
       for (int i=0;i<text.getSentences().size();i++){
           for (int j=0;j<text.getSentences().get(i).getWords().size();j++){
               if(isVowelWord(text.getSentences().get(i).getWords().get(j))){
                   listOfVowels.add(text.getSentences().get(i).getWords().get(j));
               }
           }
       }
       return listOfVowels;
   }

   //проверка на "гласность" слова
   private boolean isVowelWord(Word word){
       char[] vowels = new char[]{'a','i','o','e','u'};
       for (char c:vowels){
           if(word.getLetters().get(0).getLetter()==c){
               return true;
           }
       }
       return false;
   }

   //проверка на "гласность" буквы
    private boolean isVowelLetter(Letter letter){
        char[] vowels = new char[]{'a','i','o','e','u'};
        for (char c:vowels){
            if(letter.getLetter()==c){
                return true;
            }
        }
        return false;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
