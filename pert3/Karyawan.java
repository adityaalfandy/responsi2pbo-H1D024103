class Karyawan {
    // 1. Deklarasikan variabel/state dasar (nama, gajiPokok) [cite: 3]
    // Menggunakan 'protected' agar bisa diakses langsung oleh subclass Manajer
    protected String nama;
    protected double gajiPokok;

    // 2. Constructor untuk inisialisasi nama dan gajiPokok
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // 3. Method untuk menampilkan informasi dasar karyawan [cite: 3]
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}