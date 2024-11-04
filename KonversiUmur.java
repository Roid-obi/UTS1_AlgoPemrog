import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

// 1
// Menentukan konversi umur dalam tahun, bulan dan hari dengan inputan tanggal lahir dan tanggal sekarang. 
// dengan asumsi bahwa 1 bulan adalah 30 hari dan 1 tahun adalah 12 bulan.

public class KonversiUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi
        int hariLahir, bulanLahir, tahunLahir;
        int hariSekarang, bulanSekarang, tahunSekarang;
        
        // Input tanggal lahir dalam format hari/bulan/tahun
        System.out.print("Masukkan tanggal lahir (format: hari/bulan/tahun): ");
        String[] tanggalLahirInput = input.nextLine().split("/");
        hariLahir = Integer.parseInt(tanggalLahirInput[0]);
        bulanLahir = Integer.parseInt(tanggalLahirInput[1]);
        tahunLahir = Integer.parseInt(tanggalLahirInput[2]);
        
        // Input tanggal sekarang dalam format hari/bulan/tahun
        System.out.print("Masukkan tanggal sekarang (format: hari/bulan/tahun): ");
        String[] tanggalSekarangInput = input.nextLine().split("/");
        hariSekarang = Integer.parseInt(tanggalSekarangInput[0]);
        bulanSekarang = Integer.parseInt(tanggalSekarangInput[1]);
        tahunSekarang = Integer.parseInt(tanggalSekarangInput[2]);
        
        // Buat objek LocalDate untuk tanggal lahir dan tanggal sekarang
        LocalDate tanggalLahir = LocalDate.of(tahunLahir, bulanLahir, hariLahir);
        LocalDate tanggalSekarang = LocalDate.of(tahunSekarang, bulanSekarang, hariSekarang);
        
        // Hitung selisih umur menggunakan Period
        Period umur = Period.between(tanggalLahir, tanggalSekarang);
        
        // Output hasil konversi umur
        System.out.println("Umur: " + umur.getYears() + " tahun, " 
                + umur.getMonths() + " bulan, dan " + umur.getDays() + " hari.");
        
        input.close();
    }
}
