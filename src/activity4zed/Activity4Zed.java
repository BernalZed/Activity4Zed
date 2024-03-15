/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity4zed;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Activity4Zed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        
    int score;
        System.out.println("Your Entrance Exam Score:");
        score = scn.nextInt();
        
    if (score >= 70){
    double GPA = 3.5;
         System.out.println("Your GPA is above: " + GPA); 
         System.out.println("Congratulation!");
    }else if (score <= 70){
    double GPA = 3.0;
         System.out.println("Your GPA is below:" + GPA);
         System.out.println("Sorry,you are not eligible for admission");
        }
    scn.close();
    
    }
    }
    

