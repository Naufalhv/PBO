/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author computer 20
 */
public class Latihan2_2 {
    
    
    public static void main (String[] args){
        //Makhir=50juta Mawal=10 juta dalam 2 tahun cicilan per bulan
        int Makhir = 50000000;
        int Mawal = 10000000;
        int tahun = 2;
        int bulan;
        int tgng;
        int cicilan;
        tgng = Makhir - Mawal;
        bulan = tahun * 12;
        cicilan = tgng / bulan;
        System.out.println(+ cicilan);
    }
    
}
    

