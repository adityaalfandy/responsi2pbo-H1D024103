public class PesawatTempur extends KendaraanGalaksi {

    private int jumlahRudal;


    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }


    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int energiDibutuhkan = jarak * 3;

        if (getLevelEnergi() >= energiDibutuhkan) {
            setLevelEnergi(getLevelEnergi() - energiDibutuhkan);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km."); // [cite: 32]
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        setLevelEnergi(energiBaru);
        System.out.println("Energi pesawat telah diisi. Level saat ini: " + getLevelEnergi() + "%");
    }


    public void tembakRudal(int jumlah) {
        if (this.jumlahRudal >= jumlah) {
            this.jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak! Sisa rudal hanya " + this.jumlahRudal);
        }
    }
}