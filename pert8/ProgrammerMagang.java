public class ProgrammerMagang implements KaryawanKontrak, AksesSistem { // [cite: 33]

    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }

    @Override
    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * this.gajiPerJam;
        System.out.println("Gaji " + this.nama + " (" + jamKerja + " jam) adalah: Rp " + totalGaji);
        return totalGaji;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    @Override
    public void login(String pin) {
        if (pin.equals(this.pinRahasia)) {
            this.sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + this.nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        this.sedangLogin = false;
        System.out.println(this.nama + " berhasil logout.");
    }

    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
}