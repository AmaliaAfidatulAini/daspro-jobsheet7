import java.util.Scanner;

public class SiakadNoAbsen03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            // Mengecek kelulusan
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // Menampilkan hasil setelah semua input selesai
        System.out.println("\n=== Hasil Akhir ===");
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Jumlah mahasiswa lulus      : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}
