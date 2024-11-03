import java.util.Scanner;

// 2
// Menentukan sebuah segitiga apakah bukan segitiga, sebuah segitiga sama sisi, sama kaki, siku-siku atau sebarang dengan inputan 3 sisinya.

public class KlasifikasiSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //inisialisasi
        int a,b,c;
        
        // Input tiga sisi segitiga
        System.out.print("Masukkan sisi a: ");
        a = input.nextInt();
        System.out.print("Masukkan sisi b: ");
        b = input.nextInt();
        System.out.print("Masukkan sisi c: ");
        c = input.nextInt();
        
        // Mengecek apakah membentuk segitiga
        if (a + b > c && a + c > b && b + c > a) {
            // Mengecek jenis segitiga
            if (a == b && b == c) {
                System.out.println("Segitiga ini adalah segitiga sama sisi.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Segitiga ini adalah segitiga sama kaki.");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Segitiga ini adalah segitiga siku-siku.");
            } else {
                System.out.println("Segitiga ini adalah segitiga sembarang.");
            }
        } else {
            System.out.println("Ini bukan segitiga.");
        }
        
        input.close();
    }
}