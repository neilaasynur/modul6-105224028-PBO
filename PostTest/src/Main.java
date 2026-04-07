import java.util.ArrayList;

import rental.Kendaraan;
import rental.Mobil;
import rental.Motor;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

        kendaraanList.add(new Mobil("Z 1173 NA", "Hyundai", 2006, 380000, 4));
        kendaraanList.add(new Mobil("D 8863 FN", "TOYOTA", 2020, 800000, 5));
        kendaraanList.add(new Motor("BM 9322 AC", "Vario", 2025, 120000, 260));
        kendaraanList.add(new Motor("B 3668 NE", "Scoopy", 2018, 100000, 220));

        for (Kendaraan kendaraan :kendaraanList){
            kendaraan.displayInfo();
            System.out.println("Total Biaya Sewa selama 5 hari: Rp" + kendaraan.hitungHargaSewa(5));
        }
    }
}
