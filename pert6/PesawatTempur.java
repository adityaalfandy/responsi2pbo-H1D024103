public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS [cite: 29]
    // ==========================================================
    private int jumlahRudal;

    // ==========================================================
    // CONSTRUCTOR [cite: 29]
    // ==========================================================
    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    public void aktifkanMesin() {
        // Jika energi < 20 → tampilkan pesan gagal [cite: 14, 30]
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan."); // [cite: 31]
        }
    }

    @Override
    public void jelajah(int jarak) {
        // Konsumsi energi: 3% per 1 km [cite: 14, 31]
        int energiDibutuhkan = jarak * 3;

        if (getLevelEnergi() >= energiDibutuhkan) {
            setLevelEnergi(getLevelEnergi() - energiDibutuhkan);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km."); // [cite: 32]
        } else {
            // [cite: 32] Pesan gagal jika energi tidak cukup
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        // Tambah energi max 100% [cite: 33]
        int energiBaru = getLevelEnergi() + jumlah;
        setLevelEnergi(energiBaru);
        System.out.println("Energi pesawat telah diisi. Level saat ini: " + getLevelEnergi() + "%");
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================
    public void tembakRudal(int jumlah) {
        // Jika rudal cukup, kurangi dan tampilkan pesan [cite: 14, 34]
        if (this.jumlahRudal >= jumlah) {
            this.jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak! Sisa rudal hanya " + this.jumlahRudal); // [cite: 35]
        }
    }
}