//Seorang siswa RPL SMK Telkom Malang ingin menghitung faktorial dari suatu bilangan bulat positif yang dimasukkan. 
//Buatlah sebuah program dalam bahasa Java untuk menghitung faktorial dari bilangan tersebut

import java.util.Scanner;

public class LatihanUKL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat positif:");
        int n = input.nextInt();
        int faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        //Output
        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
    }
}
