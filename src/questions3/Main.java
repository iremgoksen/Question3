/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions3;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kullanıcı
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic6 here
        Questions3 q3=new Questions3();              
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");   //  The number of elements is requested from the user
        int number_of_elements=input.nextInt();               //  the number of elements entered in this variable is thrown
        
        String[] words=new String[number_of_elements];        //  This array is created for elements
        for(int i=0; i<words.length; i++) {                   //  insertion of elements into the array
            System.out.println(i+1+". element: ");
            words[i]=input.next();
        }
        System.out.print(q3.repeatingElement(words));         //  sending the array to the function
        
    }
}