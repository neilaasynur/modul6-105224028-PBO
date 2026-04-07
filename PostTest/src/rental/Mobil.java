package rental;

public class Mobil extends Kendaraan {
    int kapasitasPenumpang;
    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    @Override
    public double hitungHargaSewa(int hari) {
        super.hitungHargaSewa(hari);
        double assurance = 50000;
        if ( kapasitasPenumpang > 5) {
            double flat = 50000;
            total += flat * hari;
            return total;
        }
        total += assurance * hari;
        return total;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }
}
