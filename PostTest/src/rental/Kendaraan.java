package rental;

public class Kendaraan {
    String nomorPolisi;
    String merk;
    int tahunProduksi;
    double hargaSewaDasar;

    double total = 0;

    public Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }
    public void displayInfo() {
        System.out.println("\nNomor Polisi: " + nomorPolisi);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga Sewa Dasar: " + hargaSewaDasar);
    }
    public double hitungHargaSewa (int hari){
        total =hargaSewaDasar * hari;
        if (tahunProduksi < 2015){
            total = total - (total * 0.1);
            System.out.println(">> Diskon 10% untuk kendaraan tahun produksi di bawah 2015");
        }
        return total;
    }
}
