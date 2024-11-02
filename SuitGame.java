import java.util.Random;
import java.util.Scanner;

// 3
// Dengan menggunakan fungsi random di java buatlah permainan suit (semut, orang, dan gajah) yang menentukan kita menang, seri atau kalah jika di adu dengan komputer. 
// misal kita memilih semut maka komputer akan merandom tiga kemungkinan jika komputer keluar gajah maka kita menang, jika komputer keluar semut maka seri dan jika komputer keluar orang maka kita kalah.

public class SuitGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Inisialisasi
        int pilihanPemain, pilihanKomputer;
        
        // Menampilkan pilihan untuk pemain
        System.out.println("Pilih salah satu:");
        System.out.println("1. Semut");
        System.out.println("2. Orang");
        System.out.println("3. Gajah");
        System.out.print("Masukkan pilihanmu (1-3): ");
        
        pilihanPemain = input.nextInt();
        
        // Validasi input pemain
        if (pilihanPemain < 1 || pilihanPemain > 3) {
            System.out.println("Pilihan tidak valid.");
            input.close();
            return;
        }
        
        // Mendapatkan pilihan komputer secara acak
        pilihanKomputer = rand.nextInt(3) + 1;
        
        // Menampilkan pilihan pemain dan komputer
        System.out.println("Pilihanmu: " + getNamaPilihan(pilihanPemain));
        System.out.println("Pilihan komputer: " + getNamaPilihan(pilihanKomputer));
        
        // Menentukan hasil permainan
        if (pilihanPemain == pilihanKomputer) {
            System.out.println("Hasil: Seri!");
        } else if ((pilihanPemain == 1 && pilihanKomputer == 3) ||  // Semut menang lawan Gajah
                   (pilihanPemain == 2 && pilihanKomputer == 1) ||  // Orang menang lawan Semut
                   (pilihanPemain == 3 && pilihanKomputer == 2)) {  // Gajah menang lawan Orang
            System.out.println("Hasil: Kamu menang!");
        } else {
            System.out.println("Hasil: Kamu kalah.");
        }
        
        input.close();
    }
    
    // Fungsi untuk mengembalikan nama pilihan
    public static String getNamaPilihan(int pilihan) {
        switch (pilihan) {
            case 1: return "Semut";
            case 2: return "Orang";
            case 3: return "Gajah";
            default: return "Tidak Diketahui";
        }
    }
}
