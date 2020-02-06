/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  /**
   * 
   * @author 16-12s18036 Sandraulina Siregar
   * @author 16-12s18048 Rifka Uli Siregar
   */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    /* program emtry point */
        public static void main(String[] args) {
        System.out.println("Hello,world!");
     
     // declaring and manipulating primitive variables
        int gear = 1;
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        
        System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
        
        gear++;
        result = !result;
        capitalC += 4;
        
        System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
        
        //26 in hexadecimal and binary
        int hexVal = 0x1a;
        int binVal = 0b11010;
        
        System.out.println(hexVal + ", " + binVal);
        
        //intatiating and manipulating objects
        String name = "Wiro Sableng";
        Short gearObject = 1;
        Boolean resultObj = true;
        
        System.out.println(name + ", " + gearObject + ", " + resultObj);
        
        name = name.toUpperCase();
        gearObject++;
        resultObj = (result == false) || !resultObj;
        
        System.out.println(name + ", " + gearObject + ", " + resultObj);
        
        //array, collections, and loop
        int[][] numbers = new int[10][10];
        
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                numbers[i][j] = i + j;
            }
        }
        
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j< numbers[i].length; ++j) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
            }
        //Challenge
           
    ArrayList <ArrayList<Integer>> numbers =new ArrayList<ArrayList<Integer>>();
    System.out.println("Input Jumlah Data:");
    int jlh_data = new Scanner (System.in).nextInt();
    
    for (int i = 0; i < jlh_data; ++i) {
             numbers.add(new ArrayList<Integer>());
        for(int j =0;j<jlh_data;++j){
            numbers.get(i).add(i+j);
           } 
        }
    for (int i = 0; i < jlh_data; ++i) {
        for (int j = 0 ; j < jlh_data; ++j) { 
            System.out.print(numbers.get(i).get(j) + " ");
            }
            System.out.println();
        }
        }
}

 

