/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;


import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;

        
        
/**
 *
 * @author ktina
 */
public class MysteryDoor {

    public static Object scanner;

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    Random r = new Random();
    
    int doorSelection;
    
  
    // print out the options of which number to choose
    System.out.println("Are you feeling lucky?");
    System.out.println("11111      2222222     33333333");
    System.out.println("    1      2     2            3");
    System.out.println("    1            2            3");
    System.out.println("    1            2         3333");
    System.out.println("    1          2              3");
    System.out.println("    1        2                3");
    System.out.println(" 11111111  2222222     33333333");
   
    System.out.println("Pick 1, 2 or 3 to win big!");
    
    doorSelection = scan.nextInt();
    
    //create output for each selection. Make sure to use breaks
    switch(doorSelection){
        case 1:
            //System.out.println("You just won a shiney car!");
            System.out.println("You just won a " + firstDoor());
         
            break;
        case 2: 
            System.out.println("Ribbit! Hope you love your new " + randomPrize());
            break;
        case 3:
            //Random number of odd items
            BigInteger bigInt = new BigInteger(100, r);
            System.out.println(bigInt +"QTips");
                   
            
            
            
            
      }
    
    
    
    
                        
            
            
    }

    public static String firstDoor(){
        // connecting  together prize 1
        return "Tesla signed by Elon <usk";
    }
    
    public static String randomPrize(){
        Random random = new Random();
        // INVOKE GENERATOR
       
        int randomNumber = 0;
        
        if (randomNumber == 0){
            return "a frog";
        } else if (randomNumber == 1){
            return "Dog";
        }// close
       
        
   
  
   
  
		


   
			

        
 

        
     

    
            
    
    
    

