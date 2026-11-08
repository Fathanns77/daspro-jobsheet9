/**
 * Tugas206
 */
import java.util.Scanner;

public class Tugas206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar Menu Kafe
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }
        System.out.println("=============================================\n");

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananHarga = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean menuValid = false;
            while (!menuValid) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                String namaInput = sc.nextLine();

                // Linear search pencarian menu
                int idxDitemukan = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaInput)) {
                        idxDitemukan = j;
                        break;
                    }
                }

                if (idxDitemukan != -1) {
                    pesananNama[i] = menu[idxDitemukan];
                    pesananHarga[i] = harga[idxDitemukan];
                    totalBiaya += harga[idxDitemukan];
                    System.out.println("-> Menu ditemukan: " + menu[idxDitemukan] + " (Rp" + harga[idxDitemukan] + ")");
                    menuValid = true;
                } else {
                    System.out.println("-> Maaf, menu '" + namaInput + "' tidak tersedia. Silakan masukkan ulang!");
                }
            }
        }

        // Menampilkan Ringkasan Pesanan
        System.out.println("\n========== STRUK PEMESANAN KAFE ==========");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + pesananNama[i] + " : Rp" + pesananHarga[i]);
        }
        System.out.println("-------------------------------------------");
        System.out.println("TOTAL BIAYA : Rp" + totalBiaya);
        System.out.println("===========================================");
    }
}