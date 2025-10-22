package TugasJobsheet7;
import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahTiket, totalTiketTerjual = 0;
        double totalPenjualan = 0;
   
            while (true) {
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.\n");
                    continue;
                }

                if (jumlahTiket == 0) {
                    break; 
                }
    
            // Pengecekan diskon
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            double totalHarga = jumlahTiket * hargaTiket * (1 - diskon);

            System.out.println("\n--- Detail Pembelian: ");
            System.out.println("Jumlah tiket           : " + jumlahTiket);
            System.out.println("Harga per tiket        : Rp" + hargaTiket);
            System.out.println("Total sebelum diskon   : Rp" + totalHarga);
            System.out.println("Diskon                 : " + (diskon * 100) + "%");
            System.out.println("Total yang harus dibayar: Rp" + totalHarga + "\n");

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHarga;
        }

        System.out.println("=== LAPORAN PENJUALAN HARIAN BIOSKOP ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total penjualan     : Rp" + totalPenjualan);

        sc.close();
    }
}
