/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author computer 20
 */

import java.util.Scanner;
public class Latihan2_1 {
    
    
     public static void main (String[] args){
        Scanner a = new Scanner(System.in);
        int gajikotor;
        double potongan  , pajak;
        double gajibersih;
        System.out.println("Masukan gaji Kotor: ");
        gajikotor = a.nextInt();
        pajak = 0.1;
        potongan = gajikotor*pajak;
        gajibersih = gajikotor - potongan ;
        System.out.println(+gajibersih);
        a.close();

    
     }
}
