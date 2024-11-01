import java.util.Scanner;

// 1
// Menentukan konversi umur dalam tahun, bulan dan hari dengan inputan tanggal lahir dan tanggal sekarang. 
// dengan asumsi bahwa 1 bulan adalah 30 hari dan 1 tahun adalah 12 bulan.

// Psedocode
// Start

    //     int hariLahir, bulanLahir, tahunLahir
    //     int hariSekarang, bulanSekarang, tahunSekarang
    //     int hari, bulan, tahun

    //     Input hariLahir
    //     Input bulanLahir
    //     Input tahunLahir
    //     Input hariSekarang
    //     Input bulanSekarang
    //     Input tahunSekarang

    //     hari = hariSekarang - hariLahir
    //     bulan = bulanSekarang - bulanLahir
    //     tahun = tahunSekarang - tahunLahir

    //     If hari < 0 Then
    //         hari = hari + 30       // Tambahkan 30 hari
    //         bulan = bulan - 1      // Kurangi 1 bulan
    //     End If

    //     If bulan < 0 Then
    //         bulan = bulan + 12      // Tambahkan 12 bulan
    //         tahun = tahun - 1       // Kurangi 1 tahun
    //     End If

    //     Output "Umur: " + tahun + " tahun, " + bulan + " bulan, dan " + hari + " hari."

// End

public class KonversiUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi
        int hariLahir, bulanLahir, tahunLahir;
        int hariSekarang, bulanSekarang, tahunSekarang;
        
        // Input tanggal lahir
        System.out.print("Masukkan tanggal lahir (hari): ");
        hariLahir = input.nextInt();
        System.out.print("Masukkan bulan lahir: ");
        bulanLahir = input.nextInt();
        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = input.nextInt();
        
        // Input tanggal sekarang
        System.out.print("Masukkan tanggal sekarang (hari): ");
        hariSekarang = input.nextInt();
        System.out.print("Masukkan bulan sekarang: ");
        bulanSekarang = input.nextInt();
        System.out.print("Masukkan tahun sekarang: ");
        tahunSekarang = input.nextInt();
        
        // Hitung selisih hari, bulan, dan tahun
        int hari = hariSekarang - hariLahir;
        int bulan = bulanSekarang - bulanLahir;
        int tahun = tahunSekarang - tahunLahir;
        
        // Sesuaikan jika hari negatif
        if (hari < 0) {
            hari += 30;    // 1 bulan = 30 hari
            bulan--;
        }
        
        // Sesuaikan jika bulan negatif
        if (bulan < 0) {
            bulan += 12;   // 1 tahun = 12 bulan
            tahun--;
        }
        
        // Output hasil konversi umur
        System.out.println("Umur: " + tahun + " tahun, " + bulan + " bulan, dan " + hari + " hari.");
        
        input.close();
    }
}