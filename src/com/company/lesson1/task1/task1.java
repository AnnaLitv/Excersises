package com.company.lesson1.task1;

public class task1 {

    public int[] toBinary(int numb){
        int ost = numb;
        int i=0;
        int[] mas = new int[32];
        mas[i]=ost%2;
        i++;
        while(ost>1){
            ost=ost/2;
            mas[i]=ost%2;
            i++;
        }
        return mas;
    }
    public int[] toOct(int numb){
        int ost = numb;
        int i=0;
        int[] mas = new int[32];
        mas[i]=ost%8;
        i++;
        while(ost>7){
            ost=ost/8;
            mas[i]=ost%8;
            i++;
        }
        return mas;
    }

    private char sw(int numb){
        switch (numb) {
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';

            case 14:
                return 'E';

            case 15:
                return 'F';

            default:
                return (char) numb;
        }
    }
    public char[] shestSys(int numb){
        int ost = numb;
        int i=0;
        char[] mas = new char[32];
        mas[i]=sw(ost%16);
        i++;
        while (ost>15){
            ost=ost/16;
            mas[i]=sw(ost%16);
            i++;
        }
        return mas;
    }
}
