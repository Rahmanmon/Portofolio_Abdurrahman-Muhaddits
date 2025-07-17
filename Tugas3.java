import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        // Array gaji pokok berdasarkan golongan
        int[] gajiPokok = {5000000, 6500000, 9500000};

        // Array persentase lembur
        int[] persenLembur = {30, 32, 34, 36, 38};

        Scanner input = new Scanner(System.in);

        // Input golongan karyawan
        System.out.print("Masukkan golongan karyawan (A, B, C): ");
        String golongan = input.nextLine().toUpperCase();

        // Input jam lembur
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = input.nextInt();

        int gaji = 0;
        int indexGolongan = -1;

        // Menentukan gaji berdasarkan golongan
        if (golongan.equals("A")) {
            indexGolongan = 0;
            gaji = gajiPokok[0];
        } else if (golongan.equals("B")) {
            indexGolongan = 1;
            gaji = gajiPokok[1];
        } else if (golongan.equals("C")) {
            indexGolongan = 2;
            gaji = gajiPokok[2];
        } else {
            System.out.println("Golongan tidak valid");
            System.exit(0);
        }

        // Menghitung gaji lembur berdasarkan jam lembur
        double gajiLembur = 0;
        if (jamLembur > 0) {
            int indexLembur = -1;

            if (jamLembur == 1) {
                indexLembur = 0;
            } else if (jamLembur == 2) {
                indexLembur = 1;
            } else if (jamLembur == 3) {
                indexLembur = 2;
            } else if (jamLembur == 4) {
                indexLembur = 3;
            } else if (jamLembur == 5) {
                indexLembur = 4;
            }

            //Hitung gaji lembur jika jam lembur valid
            if (indexLembur != -1) {
                double persen = persenLembur[indexLembur];
                gajiLembur = (persen / 100.0) * gaji;
            }
        }

        // Menghitung total penghasilan
        double totalPenghasilan = gaji + gajiLembur;

        //Menampilkan hasil
        System.out.println("\nGaji Pokok: Rp " + gaji);
        System.out.println("Gaji Lembur: Rp " + (int) gajiLembur);
        System.out.println("Total Penghasilan: Rp " + (int) totalPenghasilan);
    }
}