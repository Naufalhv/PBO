/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author computer 20
 */
import java.io.BufferedReader;
     import java.io.InputStreamReader;
     import java.io.IOException;

     
public class Latihan2_3 {

  public static void main(String[] args ){
   BufferedReader dataIn = new  BufferedReader (new InputStreamReader ( System.in));
   String name = "";
   System.out.print("Silahkan Masukan Nama Anda:");
   try{
       name = dataIn.readLine();
   }catch(IOException e){
   System.out.println("Error:");
   }
   System.out.println("Hello " + name +"Anda Berhasil Membuatnya!!");
    
  }} 
