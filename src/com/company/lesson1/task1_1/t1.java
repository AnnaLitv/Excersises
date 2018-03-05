package com.company.lesson1.task1_1;

public class t1 {

    public String dvoichSys(int numb){
        int ost = numb;
        int i=0;
        StringBuffer sb = new StringBuffer();
        sb.append(ost%2);
        while(ost>1){
            ost=ost/2;
            sb.append(ost%2);
        }
        sb.reverse();
        return sb.toString();
    }

    public String vosmSys(int numb){
        int ost = numb;
        int i=0;
        StringBuffer sb = new StringBuffer();
        sb.append(ost%8);
        while (ost>7){
            ost=ost/8;
            sb.append(ost%8);
        }
        sb.reverse();
        return sb.toString();
    }

    private String sw(int numb){
        StringBuffer sb = new StringBuffer();
        switch (numb) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";

            case 14:
                return "E";

            case 15:
               return "F";

            default:
                return sb.append(numb).toString();
        }
    }

    public String shestSys(int numb){
        int ost = numb;
        int i=0;
        StringBuffer sb = new StringBuffer();
        int nm = ost%16;
        sb.append(sw(ost%16));
        while (ost>15){
            ost=ost/16;
            int n = ost%16;
            sb.append(sw(ost%16));
        }
        sb.reverse();
        return sb.toString();
    }
}
