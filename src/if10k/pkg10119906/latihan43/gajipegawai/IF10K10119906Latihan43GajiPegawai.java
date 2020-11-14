/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan43.gajipegawai;
import java.util.Scanner;
/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Rizky Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.setUangTunjangan(250000);
        gaji.setUangTransport(300000);
        gaji.setGajiPokok(4500000);
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok(), gaji.getGajiPokok());
        
    }
}