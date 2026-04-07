package rental;

public class Motor extends Kendaraan {
    int kapasitasMesin;

    public Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasMesin) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }
    @Override
    public double hitungHargaSewa(int hari) {
        super.hitungHargaSewa(hari);
        if (kapasitasMesin >= 250) {
            double pajak = 25000;
            total += pajak* hari;
            return total;
        }
        return total;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }

}
