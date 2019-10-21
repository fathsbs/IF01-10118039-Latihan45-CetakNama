/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mencetaj berulang kali sesuai keinginan user  
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Printer {

    private int jumlahCetak;
    private String nama;

    public int getJumlahCetak() {
        return jumlahCetak;
    }

    public void setJumlahCetak(int jumlahCetak) {
        this.jumlahCetak = jumlahCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        System.out.printf("Nama anda : %s", nama);
    }

    public void cetak(int jumlahCetak, String nama) {
        for (int i = 0; i < (jumlahCetak); i++) {
            System.out.println((i + 1) + ". " + nama);
        }
    }
}
