package com.test.sumit3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

        public static void main(String[] args) {
                String sb = fileReader();
                boolean fileWrite = fileWrite(sb);
                System.out.println(fileWrite);
        }

        /**
         *
         */
        private static String fileReader() {
                String filePath = "D:\\test\\sumit\\learning.txt";
                BufferedReader br = null;
                String str = null;
                StringBuilder sb= new StringBuilder();
                try {
                        FileReader fr = new FileReader(filePath);
                        br = new BufferedReader(fr);
                        while ((str = br.readLine()) != null) {
                                sb.append(str);
                                sb.append(System.getProperty("line.separator"));
                        }

                } catch (IOException e) {
                        System.out.println(e.getMessage());
                }finally{
                        try {
                                br.close();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }

                return sb.toString();
        }

        /**
         * this method is to write in file
         */
        private static boolean fileWrite(String str) {
                String filePath = "D:\\test\\sumit\\learn.txt";
                try {
                        FileWriter fw = new FileWriter(filePath);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(str);
                        bw.newLine();
                        bw.flush();
                        bw.close();
                } catch (IOException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                }
                return true;
        }

}