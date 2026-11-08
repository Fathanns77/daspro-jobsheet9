/**
 * ArrayNilai06
 */
import java.util.Scanner;

public class ArrayNilai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        int countLulus = 0, countTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                countLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
                countTidakLulus++;
            }
        }

        System.out.println("Jumlah mahasiswa LULUS: " + countLulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS: " + countTidakLulus);
    }
}