import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Validasi input jenis kelamin
        while (jenisKelamin != 'P' && jenisKelamin != 'L') {
            System.out.println("Jenis kelamin yang Anda masukkan tidak valid.");
            System.out.print("Masukkan jenis kelamin (P/L): ");
            jenisKelamin = scanner.next().charAt(0);
        }

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        // Parsing tanggal lahir menjadi objek LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Menghitung umur
        int umur = hitungUmur(tanggalLahir);

        // Menampilkan data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'P' ? "Perempuan" : "Laki-laki"));
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }

    // Method untuk menghitung umur berdasarkan tanggal lahir
    public static int hitungUmur(LocalDate tanggalLahir) {
        LocalDate hariIni = LocalDate.now();
        return Period.between(tanggalLahir, hariIni).getYears();
    }
}