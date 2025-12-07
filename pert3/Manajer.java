public class Manajer extends Karyawan {
    // State tambahan khusus Manajer
    double tunjangan;

    // Constructor Manajer
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        // 'super' memanggil constructor Karyawan untuk set nama & gaji
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Override method tampilInfo milik parent
    @Override
    public void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + tunjangan);

        double totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}