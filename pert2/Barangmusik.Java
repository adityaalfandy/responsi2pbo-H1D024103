class BarangMusik {
    // 1. Deklarasi variabel (State)
    String kode;
    String nama;
    double harga;
    int stok;

    // 2. Constructor

    // Cara Pertama: Hanya kode dan nama (Harga 0, Stok 0)
    public BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
        this.stok = 0;
    }

    // Cara Kedua: Kode, nama, dan harga (Stok 0)
    public BarangMusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Cara Ketiga: Data lengkap (Kode, nama, harga, stok)
    public BarangMusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // 3. Method Kemampuan Sistem

    // Mengubah harga barang
    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    // Menambah stok (stok lama + tambahan)
    void tambahStok(int jumlah) {
        this.stok = this.stok + jumlah;
    }

    // Menampilkan informasi lengkap sesuai format
    void tampilInfo() {
        System.out.println("Alat musik " + nama + " | Kode: " + kode + " | Harga: Rp " + harga + " | Stok: " + stok + " unit");
    }
}