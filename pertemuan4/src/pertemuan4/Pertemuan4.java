/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Yura
 * Sabtu, 12 Maret 2025
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        nama[0] = "Yinari Dewi";
        nama[1] = "Dewi";
        nama[2] = "Kartika";
        nama[3] = "Turendra";
        nama[4] = "Sastra Dewi";
        
        Scanner inp = new Scanner(System.in);
        
//        String NamaTeman = nama[2];
//        System.out.printf("Data Teman: %s",nama[2]);
        
        //Menampilkan data Array dengan Perulangan
        for(int idx=0; idx<5; idx++){
            System.out.println("Data Teman ke-"+String.valueOf(idx)+": "+nama[idx]);
        }
        
        //foreach
        for(String nm : nama){
            System.out.println(nm);
        }
    }
    
}
