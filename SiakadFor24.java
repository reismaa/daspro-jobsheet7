import java.util.Scanner;

public class SiakadFor24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double  nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidaklulus = 0; // tambahan variabel hitung

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai <  terendah) {
                terendah = nilai;
            }

            // Menghitung jumlah mahasiswa lulus dan tidak lulus
            if (nilai >= 60) {
                lulus++;
            } else {
                tidaklulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidaklulus);

        sc.close();
    }
}