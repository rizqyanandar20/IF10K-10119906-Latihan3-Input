/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama      : Rizqy Ananda Rusmana
 * NIM       : 10119906
 * Kelas     : IF-10K
 * Deskripsi : Memasukan nilai dari keyboard.
 */
public class IF10K10119906Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    }
    
}
