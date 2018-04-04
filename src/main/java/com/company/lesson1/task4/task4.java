package com.company.lesson1.task4;

public class task4 {
   public void run(){
       int n=4;
       int[][] mas = new int[n][n];
       int[][] mas1 = new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               mas[i][j]=(int)(Math.random()*20);
           }
       }
       output(mas,n);
       System.out.println("");
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               mas1[j][i]=mas[i][n-1-j];
           }
       }
       output(mas1,n);
   }

   private void output(int[][] mas, int n){
       for (int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.printf("%3d ",mas[i][j]);
           }
           System.out.println("");
       }
   }

}
