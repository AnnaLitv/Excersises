package com.company.lesson1.task3;

public class task3 {
    public void run(){
        int n=6;
        if(n<10) {
            rotate(n);
        }
    }

    private void rotate(int n){
        String space =" ";
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(space);
            }
            int[] mas = genericMas(i+1);
            for(int k:mas){
                System.out.print(k);
            }
            System.out.println("");
        }
    }
    private int[] genericMas(int n){
        int[] mas = new int[n*2-1];
        for(int i=0;i<n;i++){
            mas[i]=i+1;
        }
        int ind=n-1;
        for(int i=n;i<n*2-1;i++){
            mas[i]=ind;
            ind--;
        }
        return mas;
    }
}
