/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprogram.one.two;

import java.util.Scanner;

/**
 *
 * @author pate1823
 */
public class StingReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=input.nextLine();
        
        //char[] revStr=name.toCharArray();
        char[] revString=new char[name.length()];
        //store string into a character array
        for(int i=0;i<name.length();i++)
        {
                revString[i]=name.charAt(i);
        }
        //print the character array
         for(int i=0;i<name.length();i++)
        {
                System.out.print(revString[i]);
        }
         System.out.println("");
         //print the character array in reverse
         for(int i=name.length()-1; i>=0;i--)
        {
                System.out.print(revString[i]);
        }
         System.out.println("");
    }
    
}
