package perusahaan;

public class Developer extends Karyawan {
    //menambahkan atribut khusus untuk kelas developer
    private String level;
    private int jumlahBugFix;
    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }
    //getter untuk kelas developer
    public String getLevel() {
        return level;
    }   
    public int getJumlahBugFix() {
        return jumlahBugFix;
    }
    //setter untuk validasi level developer
    public void setLevel(String level) {
        if (level.equalsIgnoreCase("junior") || level.equalsIgnoreCase("mid") || level.equalsIgnoreCase("senior")) {
            this.level = level;
        } else { //jika level tidak valid, akan diubah secara paksa ke junior (asumsi)
            this.level = "junior";
        }
    }
    @Override
    public double hitungGajiTotal() {
        double gaji = super.hitungGajiTotal();
        double tunjanganLevel = 0.0;
        //menambahkan tunjangan level berdasarkan level dari developer
        switch (level.toLowerCase()) {
            case "junior":
                tunjanganLevel = 0.0;
                break;
            case "mid":
                tunjanganLevel = 1500000;
                break;
            case "senior":
                tunjanganLevel = 3000000;
                break;
        }
        double bonusBug = 0;
        // validasi bonus hanya untuk developer dengan rating di atas 3.0
        if (getRatingKinerja() >= 3.0){
            bonusBug = 50000 * jumlahBugFix;
            System.out.println(">> Mendapatkan bonus berdasarkan jumlah bug karena rating di atas Syarat!");
        }
        return gaji + tunjanganLevel + bonusBug;
    }
    // fungsi untuk menampilkan seluruh informasi termasuk atribut yang ada di developer
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: " + level);
        System.out.println("Jumlah Bug Fix: " + jumlahBugFix);
    }
}
