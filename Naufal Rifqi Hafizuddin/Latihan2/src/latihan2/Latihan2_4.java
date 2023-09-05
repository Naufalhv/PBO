/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author computer 20
 */
public class Latihan2_4 {
    
   
 public static void main(String args[]){
 String str = "Hello World";
 String anotherString = "hello world";
 Object objStr = str;
 System.out.println( str.compareTo(anotherString) );
 System.out.println( str.compareToIgnoreCase(anotherString) );
 System.out.println( str.compareTo(objStr.toString()));
 }
}
    
    

