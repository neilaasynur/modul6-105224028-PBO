package perusahaan;

public class Manajer extends Karyawan {
    //
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
        if (getRatingKinerja() >= 4.5){
            bonus = (gaji + tunjanganMaterial) * 0.15;
        }
        return gaji + tunjanganMaterial + bonus;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Divisi: " + divisi);
        System.out.println("Jumlah Anggota Tim: " + jumlahAnggotaTim);
    }
}
