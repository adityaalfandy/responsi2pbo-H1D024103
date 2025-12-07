public interface KaryawanKontrak {
    // METHOD ABSTRAK
    double hitungGaji(int jamKerja); // [cite: 28]
    void perpanjangKontrak(int durasiBulan); // [cite: 28]

    // DEFAULT METHOD
    default String getStatusCuti() {
        return "Tersedia 12 hari"; // [cite: 28]
    }
}