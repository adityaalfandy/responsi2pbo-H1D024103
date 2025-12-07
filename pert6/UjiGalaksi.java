public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===\n");

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // 1. Pesawat Tempur - "Astra-Fury", Kapasitas 2, Rudal 8 [cite: 17, 25]
        PesawatTempur astraFury = new PesawatTempur("Astra-Fury", 2, 8);

        // 2. Kapal Eksplorasi - "Voyager X", Kapasitas 10, Modul Scan 4 [cite: 17, 26]
        KapalEksplorasi voyagerX = new KapalEksplorasi("Voyager X", 10, 4);


        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        // --- SKENARIO PESAWAT TEMPUR --- [cite: 17, 27]
        System.out.println("--- PESAWAT TEMPUR ---");
        astraFury.aktifkanMesin();          // Aktifkan mesin
        astraFury.jelajah(10);              // Menjelajah 10 km (biaya: 30%)
        astraFury.jelajah(30);              // Menjelajah 30 km (biaya: 90% -> harusnya gagal karena sisa 70%)
        astraFury.tembakRudal(3);           // Tembak 3 rudal
        astraFury.tampilStatus();           // Tampilkan status akhir

        System.out.println(); // Spasi

        // --- SKENARIO KAPAL EKSPLORASI --- [cite: 17, 27]
        System.out.println("--- KAPAL EKSPLORASI ---");
        voyagerX.aktifkanMesin();           // Aktifkan mesin
        voyagerX.jelajah(15);               // Menjelajah 15 km (biaya: 30%)
        voyagerX.scanPlanet("Kepler-442b"); // Scan planet
        voyagerX.tampilStatus();            // Tampilkan status akhir
    }
}