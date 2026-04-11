//inport java util untuk menggunakan ArrayList
import java.util.ArrayList;

//import seluruh kelas yang ada di package perusahaan
import perusahaan.Karyawan;
import perusahaan.Developer;
import perusahaan.Manajer;

public class Main {
    public static void main(String[] args) throws Exception {
        //variabel yang digunakan untuk meyimpan total anggara, gaji, gaji tertinggi, nama karyawan, total rating
        double anggaran = 0.0;
        double gaji = 0.0;
        double gajiTertinggi = 0.0;
        String namaKaryawan = " ";
        double TotalRating = 0.0;
        //membuat array menyimpan objek
        ArrayList<Karyawan> ListKaryawan = new ArrayList<>();
        //mengisi array dengan objek karyawan
        ListKaryawan.add(new Karyawan("00000001", "ShaoShang", 2020, 3000000, 2.0));
        ListKaryawan.add(new Developer("00000002", "Sang Zhi", 2018, 5000000, 4.0, "Senior", 20));
        ListKaryawan.add(new Developer("00000003", "Xi Guang", 2024, 4000000, 2.8, "Mid", 15));
        ListKaryawan.add(new Manajer("00000004", "Zheng Suyi", 2015, 8500000, 4.8, "IT", 10));
        ListKaryawan.add(new Manajer("00000005", "Wen Yifan", 2025, 5000000, 3.5, "HR", 3));

        //perulangan yang berguna untuk menghitung informasi dari setiap karyawan
        for (Karyawan karyawan : ListKaryawan) {
            karyawan.displayInfo();
            //memaggil fungsi hitungGajiTotal yang disimpan ke variabel gaji
            gaji = karyawan.hitungGajiTotal();
            //lalu menampilkan gaji dari karyawan tersebut
            System.out.println("Total Gaji Bulan Ini: Rp" + gaji);
            //perbandingan untuk mencari gaji tertinggi pada karyawan
            if (gaji > gajiTertinggi) {
                gajiTertinggi = gaji;
                namaKaryawan = karyawan.getNama();
            }
            //menghitung total anggaran dengan gaji karyawan di setiap iterasi
            anggaran += gaji;
            //menghitung total rating dengan menjumlahkan rating setiap karyawan
            TotalRating += karyawan.getRatingKinerja();
        }
        //menmapilkan total anggaran yang dibutuhkan, karyawan dengn agaji tertinggi, dan rataan dari rating kinerja karyawan
        System.out.println("\nTotal Anggaran Gaji yang mesti disiapkan: Rp" + anggaran);
        System.out.println("Karyawan dengan gaji bersih paling tinggi: " + namaKaryawan);
        System.out.println("Rata-rata Rating Kinerja Karyawan: " + (TotalRating / ListKaryawan.size()));
    }
}
