package com.ashwani.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public void executeOldTryCatch(){
        {
            // Normal resource creation
            BufferedReader br = null;
            try {
                String sCurrentLine;
                br = new BufferedReader(new FileReader("C:/temp.txt"));
                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine + " is visiting java again after a long time.");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    if(br != null)
                        br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void executeTryCatchWithResources(){
        try(BufferedReader br = new BufferedReader(new FileReader("C:/temp.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine + " is visiting java again after a long time.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // JVM will automatically close bufferedReader and FileReader resource objects.
        // Java 7 introduced a new super interface java.lang.AutoCloseable
    }

    public static void main(String[] args) {
        TryWithResources classObject = new TryWithResources();
        classObject.executeOldTryCatch();
        classObject.executeTryCatchWithResources();
    }
}
