import java.util.Scanner;

// 2
// Menentukan sebuah segitiga apakah bukan segitiga, sebuah segitiga sama sisi, sama kaki, siku-siku atau sebarang dengan inputan 3 sisinya.

// Pseudocode
// Start

    // int a, b, c

    // Input a
    // Input b
    // Input c

    // If (a + b > c) AND (a + c > b) AND (b + c > a) Then
    //     // Mengecek jenis segitiga
    //     If (a == b) AND (b == c) Then
    //         Output "Segitiga ini adalah segitiga sama sisi."
    //     Else If (a == b) OR (a == c) OR (b == c) Then
    //         Output "Segitiga ini adalah segitiga sama kaki."
    //     Else If (a * a + b * b == c * c) OR (a * a + c * c == b * b) OR (b * b + c * c == a * a) Then
    //         Output "Segitiga ini adalah segitiga siku-siku."
    //     Else
    //         Output "Segitiga ini adalah segitiga sembarang."
    //     End If
    // Else
    //     Output "Ini bukan segitiga."
    // End If

// End


public class SegitigaDeteksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input tiga sisi segitiga
        System.out.print("Masukkan sisi a: ");
        int a = input.nextInt();
        System.out.print("Masukkan sisi b: ");
        int b = input.nextInt();
        System.out.print("Masukkan sisi c: ");
        int c = input.nextInt();
        
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