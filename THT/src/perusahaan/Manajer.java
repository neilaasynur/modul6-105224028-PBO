package perusahaan;

public class Manajer extends Karyawan {
    //atribut yang dibutuhkan untuk kelas manajer
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    public double hitungGajiTotal() {
        double gaji  = super.hitungGajiTotal();
        double tunjanganMaterial = 300000 * jumlahAnggotaTim;
        double bonus = 0.0;
        // validasi bonus hanya untuk manajer dengan rating di atas 4.5
        if (getRatingKinerja() >= 4.5){
            bonus = (gaji + tunjanganMaterial) * 0.15;
            System.out.println(">> Mendapatkan bonus tunjangan material karena rating di atas Syarat!");
        }
        return gaji + tunjanganMaterial + bonus;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Divisi: " + divisi);
        System.out.println("Jumlah Anggota Tim: " + jumlahAnggotaTim);
    }
}
