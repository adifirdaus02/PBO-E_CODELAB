import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        // Parsing tanggal lahir menjadi objek LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Menghitung umur
        LocalDate today = LocalDate.now();
        Period period = Period.between(tanggalLahir, today);
        int umur = period.getYears();

        // Menampilkan data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'P' ? "Perempuan" : "Laki-laki"));
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}