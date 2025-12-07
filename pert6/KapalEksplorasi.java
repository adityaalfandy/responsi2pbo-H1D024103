public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS [cite: 1]
    // ==========================================================
    private int modulScan; // level 1-5

    // ==========================================================
    // CONSTRUCTOR [cite: 1]
    // ==========================================================
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    public void aktifkanMesin() {
        // Jika energi < 15 → gagal [cite: 2, 16]
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!"); // [cite: 3]
        }
    }

    @Override
    public void jelajah(int jarak) {
        // Konsumsi energi: 2% per 1 km [cite: 3, 16]
        int energiDibutuhkan = jarak * 2;

        if (getLevelEnergi() >= energiDibutuhkan) {
            setLevelEnergi(getLevelEnergi() - energiDibutuhkan);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km."); // [cite: 4]
        } else {
            System.out.println("Energi tidak cukup untuk perjalanan ini.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        // Tambah energi max 100% [cite: 5]
        int energiBaru = getLevelEnergi() + jumlah;
        setLevelEnergi(energiBaru);
        System.out.println("Energi kapal telah diisi ulang.");
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================
    public void scanPlanet(String namaPlanet) {
        // Tampilkan pesan scan [cite: 6]
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}