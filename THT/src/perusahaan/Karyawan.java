package perusahaan;

public class Karyawan {
    //atribut kelas karyawan
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    //consturctor kelas karyawan
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        setRatingKinerja(ratingKinerja);
    }
    //getter untuk seluruh atribut
    public String getIsKaryawan() {
        return idKaryawan;
    }
    public String getNama() {
        return nama;
    }
    public int getTahunMasuk() {
        return tahunMasuk;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }   
    public double getRatingKinerja() {
        return ratingKinerja;
    }
    // setter untuk validasi rating dari karyawan
    public void setRatingKinerja(double ratingKinerja) {
        //melakukan validasi rating. rating harus dalam range 1.0-5.0
        if (ratingKinerja >= 1.0 && ratingKinerja <= 5.0){
            this.ratingKinerja = ratingKinerja;
        } else { //jika diluar range, rating akan diatur paksa ke 3.0
            this.ratingKinerja = 3.0;
        }
    }
    // fungsi yang berguna untuk menghitung total gaji karyawan
    public double hitungGajiTotal (){
        int masaKerja = 2026 - tahunMasuk;
        double bonus  = gajiPokok * 0.05 * masaKerja;
        double pinalti = 0.0;
        //melakukan validasi rating dibawah 2.5
        if (this.ratingKinerja < 2.5){
            //jika dibawah syarat, maka akan dikenakan pinalti
            pinalti = (gajiPokok + bonus) * 0.1;
            System.out.println(">> Mendapatkan pinalti karena rating berada dibawah Syarat!");
        }
        double gajiTotal = gajiPokok + bonus - pinalti;
        return gajiTotal;
    }
    //fungsi untuk menampilkan seluruh informasi karyawan
    public void displayInfo(){
        System.out.println("\nID: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Rating: " + ratingKinerja);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}