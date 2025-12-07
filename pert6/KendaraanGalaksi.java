public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private) [cite: 22]
    // ==========================================================
    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    // ==========================================================
    // CONSTRUCTOR [cite: 23]
    // ==========================================================
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // Default energi 100 [cite: 23]
    }

    // ==========================================================
    // GETTER & SETTER
    // ==========================================================
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    // Setter protected agar subclass bisa mengubah energi
    protected void setLevelEnergi(int energi) {
        if (energi > 100) this.levelEnergi = 100;
        else if (energi < 0) this.levelEnergi = 0;
        else this.levelEnergi = energi;
    }

    // ==========================================================
    // METHOD BIASA
    // ==========================================================
    public final void tampilStatus() {
        // Format: "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] awak" [cite: 24]
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    // ==========================================================
    // ABSTRACT METHOD [cite: 24]
    // ==========================================================
    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);
}