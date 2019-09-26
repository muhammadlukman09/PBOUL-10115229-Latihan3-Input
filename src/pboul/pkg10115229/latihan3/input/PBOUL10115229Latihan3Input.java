/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan3.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lukman
 * NIM          : 10115229
 * NAMA         : MUHAMMAD LUKMAN HAKIM
 * HARITANGGAL  : JUM'AT, 20 SEPTEMBER 2019
 * LOG
 */
public class PBOUL10115229Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        // membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
                
        // membuat objek buffereader
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan nama anda: ");
        String nama = br.readLine();
        
        
        System.out.println("Nama anda adalah "+nama);
        
    }
    
}
