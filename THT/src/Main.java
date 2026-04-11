import java.util.ArrayList;

import perusahaan.Karyawan;
import perusahaan.Developer;
import perusahaan.Manajer;

public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan [] ListKaryawan = new Karyawan[5];
        ListKaryawan[0] = new Karyawan("00000001", "ShaoShang", 2020, 3000000, 2.0);
        ListKaryawan[1] = new Developer("00000002", "Sang Zhi", 2018, 5000000, 4.0, "Senior", 20);
        ListKaryawan[2] = new Developer("00000003", "Xi Guang", 2024, 4000000, 2.8, "Mid", 15);
        ListKaryawan[3] = new Manajer("00000004", "Zheng Suyi", 2015, 8500000, 4.8, "IT", 10);
        ListKaryawan[4] = new Manajer("00000005", "Wen Yifan", 2025, 500000, 3.5, "HR", 3);

        
    }
}
