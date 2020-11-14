/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan43.gajipegawai;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class GajiPegawai {
    private String nama;
    private String Alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji; 
    
 
    /**
     * @return String return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return String return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * @return int return the uangTransport
     */
    public int getUangTransport() {
        return uangTransport;
    }

    /**
     * @param uangTransport the uangTransport to set
     */
    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    /**
     * @return int return the uangTunjangan
     */
    public int getUangTunjangan() {
        return uangTunjangan;
    }

    /**
     * @param uangTunjangan the uangTunjangan to set
     */
    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    /**
     * @return int return the gajiPokok
     */
    public int getGajiPokok() {
        return gajiPokok;
    }

    /**
     * @param gajiPokok the gajiPokok to set
     */
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /**
     * @return int return the totalGaji
     */
    public int getTotalGaji() {
        return totalGaji;
    }

    /**
     * @param totalGaji the totalGaji to set
     */
    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        this.totalGaji = uangTransport+uangTunjangan+gajiPokok;
        return this.totalGaji;
    }
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-----------------------------------" );
        System.out.println("Nama Karyawan\t : "+ nama );
        System.out.println("Alamat\t\t : "+ alamat );
        System.out.println("Uang Transport\t : Rp."+ uangTransport );
        System.out.println("Uang Tunjangan\t : Rp."+ uangTunjangan );
        System.out.println("Gaji Pokok\t : Rp."+ gajiPokok );
        System.out.println("Total Gaji\t : Rp."+ totalGaji(uangTunjangan, uangTransport, gajiPokok) );
    }
    
}
