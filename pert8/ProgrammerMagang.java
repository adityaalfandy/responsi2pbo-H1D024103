public class ProgrammerMagang implements KaryawanKontrak, AksesSistem { // [cite: 33]

    // ATRIBUT
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin; // [cite: 35, 36, 37, 38, 39]

    // CONSTRUCTOR
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false; // [cite: 41]
    }

    // IMPLEMENTASI KaryawanKontrak
    @Override
    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * this.gajiPerJam;
        System.out.println("Gaji " + this.nama + " (" + jamKerja + " jam) adalah: Rp " + totalGaji);
        return totalGaji; // [cite: 43]
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan."); // [cite: 46]
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari"; // [cite: 49]
    }

    // IMPLEMENTASI AksesSistem
    @Override
    public void login(String pin) {
        if (pin.equals(this.pinRahasia)) {
            this.sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + this.nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        } // [cite: 44, 45]
    }

    @Override
    public void logout() {
        this.sedangLogin = false;
        System.out.println(this.nama + " berhasil logout."); // [cite: 46]
    }

    @Override
    public String getRoleAkses() {
        return "Magang IT"; // [cite: 48]
    }
}