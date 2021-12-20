/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderdemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author CheeZee
 */
public class FileReaderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("writing.txt"));
            String content = br.readLine();

            while (content != null) {
                System.out.println(content + "\n");
                content = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error encountered: " + e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                System.out.println("Error Encountered: " + e);
            }
        }

    }

}
