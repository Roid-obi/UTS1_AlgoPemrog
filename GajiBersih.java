import java.util.Scanner;

// 4
// Tentukan gaji bersih dari karyawan yang mempunyai pilihan 3 golongan dengan gaji pokok berikut :
// 1. gol 1 mempunyai gaji pokok 1.000.000
// 2. gol 2 mempunyai gaji pokok 2.000.000
// 3. gol 3 mempunyai gaji pokok 3.000.000
// Mendapatkan tunjangan 300.000 jika sudah berkeluarga dan mendapat tunjangan per-anak 100.000 dengan maksimal anak yang mendapat tunjangan 3 orang anak. Kemudian pajak hanya dikenakan oleh golongan 3 dengan pajak 2% dari gaji kotor (gaji pokok + semua tunjangan).
// (catatan : berikan konfirmasi dalam program anda dalam bentuk pertanyaan untuk menentukan tunjangan keluarga dan anak, jika tidak berkeluarga maka tidak perlu ditanyakan jumlah anak dan atomatis tunjangan anak=0).

public class GajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input golongan karyawan
        System.out.print("Masukkan golongan karyawan (1/2/3): ");
        int golongan = input.nextInt();
        
        // Menentukan gaji pokok berdasarkan golongan
        int gajiPokok;
        switch (golongan) {
            case 1:
                gajiPokok = 1000000;
                break;
            case 2:
                gajiPokok = 2000000;
                break;
            case 3:
                gajiPokok = 3000000;
                break;
            default:
                System.out.println("Golongan tidak valid.");
                input.close();
                return;
        }
        
        // Input status keluarga
        System.out.print("Apakah karyawan sudah berkeluarga? (y/n): ");
        char statusKeluarga = input.next().charAt(0);
        
        int tunjanganKeluarga = 0;
        int tunjanganAnak = 0;
        
        if (statusKeluarga == 'y' || statusKeluarga == 'Y') {
            // Tunjangan keluarga
            tunjanganKeluarga = 300000;
            
            // Input jumlah anak (maksimal 3)
            System.out.print("Masukkan jumlah anak (maksimal 3): ");
            int jumlahAnak = input.nextInt();
            if (jumlahAnak > 3) jumlahAnak = 3;
            
            // Tunjangan anak
            tunjanganAnak = jumlahAnak * 100000;
        }
        
        // Menghitung gaji kotor
        int gajiKotor = gajiPokok + tunjanganKeluarga + tunjanganAnak;
        
        // Menghitung pajak jika golongan 3
        double pajak = 0;
        if (golongan == 3) {
            pajak = 0.02 * gajiKotor;
        }
        
        // Menghitung gaji bersih
        double gajiBersih = gajiKotor - pajak;
        
        // Output hasil perhitungan
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan Keluarga: Rp" + tunjanganKeluarga);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("Pajak: Rp" + pajak);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
        
        input.close();
    }
}

