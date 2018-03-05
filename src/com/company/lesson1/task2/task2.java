package com.company.lesson1.task2;

import java.util.Arrays;

public class task2 {

    public void run(){
        int n=9000;
        int[] mas = new int[10];
        int j=0;
        for(int i=1;i<n;i++){
            if(checkSimple(i)){
                mas[j]=i;
                j++;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
    private boolean checkSimple(int numb){
        int[] mas = new int[100];
        int j=0;
        for(int i=1;i<numb;i++){
            if((numb%i)==0){
                mas[j]=i;
                j++;
            }
        }
        int sum=0;
        for(int i=0;i<mas.length;i++){
            sum=sum+mas[i];
        }
        if(sum==numb){
            return true;
        }else
        return false;
    }
}
