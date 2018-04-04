package com.company.lesson6;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import java.io.*;

public class Serialization {
    static Logger logger = Logger.getLogger(Serialization.class);

    public  void serIn(Object obj, String file_name, String format){
        try {

            FileOutputStream fileOut = new FileOutputStream(file_name + "." + format);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            fileOut.close();
            out.close();
           // System.out.println("Success!");
            logger.info("Success");
        } catch (FileNotFoundException var5) {
            //System.out.println("File not found!");
            logger.error("File not found!");
        } catch (IOException var6) {
            //System.out.println("Errors input/output!");
            logger.error("Error input/output!");
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
            logger.info("Success");
        } catch (FileNotFoundException var5) {
            //System.out.println("File not found!");
            logger.error("File not found!");
        } catch (IOException var6) {
            //System.out.println("Errors input/output!");
            logger.error("Error input/output!");
        } catch (ClassNotFoundException var7) {
            //System.out.println("Class not found!");
            logger.error("Class not found!");
        }

        return retObj;
    }
}
