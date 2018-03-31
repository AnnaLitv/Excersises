package com.company.lesson6;

import java.io.*;

public class Serialization {

    public  void serIn(Object obj, String file_name, String format){
        try {
            FileOutputStream fileOut = new FileOutputStream(file_name + "." + format);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            fileOut.close();
            out.close();
            System.out.println("Success!");
        } catch (FileNotFoundException var5) {
            System.out.println("File not found!");
        } catch (IOException var6) {
            System.out.println("Errors input/output!");

        }

    }
    public static Object deserIn(String file_name, String format) {
        Object retObj = null;

        try {
            FileInputStream fileIn = new FileInputStream(file_name + "." + format);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            retObj = in.readObject();
            fileIn.close();
            in.close();
        } catch (FileNotFoundException var5) {
            System.out.println("File not found!");
        } catch (IOException var6) {
            System.out.println("Errors input/output!");

        } catch (ClassNotFoundException var7) {
            System.out.println("Class not found!");
        }

        return retObj;
    }
}
