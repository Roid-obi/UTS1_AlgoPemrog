import java.util.Scanner;

// 5
// Dari persamaan kuadrat a x^2 + b x + c tentukan a. tentukan apakah akarnya sama, nyata atau khayal b. tentukan nilai akarnya jika tidak khayal c. 
// Tentukan apakah definit negatif, definit positif jika akarnya khayal.

public class PersamaanKuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi
        double a, b, c, diskriminan;
        double akar1, akar2, akar;
        
        // Input nilai a, b, dan c
        System.out.println("a x^2 + b x + c");
        System.out.print("Masukkan nilai a: ");
        a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        c = input.nextDouble();
        
        // Menghitung diskriminan
        diskriminan = b * b - 4 * a * c;
        
        // Menentukan jenis akar berdasarkan diskriminan
        if (diskriminan > 0) {
            System.out.println("Akar-akar berbeda dan nyata.");
            akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Akar-akar persamaan: " + akar1 + " dan " + akar2);
        } else if (diskriminan == 0) {
            System.out.println("Akar-akar sama dan nyata.");
            akar = -b / (2 * a);
            System.out.println("Akar persamaan: " + akar);
        } else {
            System.out.println("Akar-akar khayal.");
            
            // Menentukan definit positif atau negatif
            if (a > 0) {
                System.out.println("Persamaan ini definit positif.");
            } else {
                System.out.println("Persamaan ini definit negatif.");
            }
        }
        
        input.close();
    }
}
