import java.util.Scanner;

public class PenjualanTiket10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        double hargaTiket = 50000;
        double subtotal, diskon, totalBayar;
        double totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                continue;
            }
            subtotal = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = subtotal * 0.15;
            } else if (jumlahTiket > 4 ) {
                diskon = subtotal * 0.10;
            }

            totalBayar = subtotal - diskon;
            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Subtotal: Rp " + subtotal);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total pembayaran: Rp " + totalBayar);
        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: " + totalPenjualan);
    }
}