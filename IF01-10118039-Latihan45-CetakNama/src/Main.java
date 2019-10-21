
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mencetaj berulang kali sesuai keinginan user  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Printer printer= new Printer();
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda: ");
        printer.setNama(masuk.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJumlahCetak(masuk.nextInt());
        printer.cetak(printer.getNama());
        System.out.println("\nHasil Cetak :");
        printer.cetak(printer.getJumlahCetak(), printer.getNama());
    }

}
