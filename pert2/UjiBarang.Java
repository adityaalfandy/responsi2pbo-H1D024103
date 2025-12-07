class UjiBarang {
    public static void main(String[] args) {
        // Buat objek barang pertama (Gitar) menggunakan Constructor Cara Pertama
        // Hanya memasukkan Kode dan Nama
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga gitar (update dari 0 menjadi 1.500.000)
        gitar.ubahHarga(1500000);

        // Tambah stok gitar (tambah 5 unit)
        gitar.tambahStok(5);

        // Buat objek drum menggunakan Constructor Cara Ketiga (Data Lengkap)
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000, 3);

        // Tampilkan informasi kedua barang
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}