/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author ekaterina
 */



public class Mavenproject9 {

    public static void main(String[] args) throws IOException {
    
        String result  =   new String (Files.readAllBytes ( Paths.get ("/Users/ekaterina/Desktop/aisd.txt")));
        int[] array  = new int[81];
        for (int i = 0; i < result.length(); ++i) { 
            if (result.charAt(i) != ' ' && result.charAt(i) != '\n') { 
                array[((int) result.charAt(i)) - 41]++;
            }
        }
        
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; ++i) {
            if (max < array[i]) {
                max = array[i];
            }
            if (array[i] != 0) {
                count++;
            }
        }
        
        for (int i = 0; i < max; ++i) {
            for (int j = 0; j < array.length; ++ j) {
                if (array[j] != 0) {
                    if (array[j] - max < 0) {
                        System.out.print(' ');
                        array[j]++;
                    }
                    else {
                        System.out.print('#');
                    }
                }
                if (j == array.length - 1) {
                    System.out.println();
                }
            }
        }
        
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != 0) {
                System.out.print((char) (i+41));
            }
        }
    
    }
}
