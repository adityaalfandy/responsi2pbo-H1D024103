public class Manajer extends Karyawan {
    double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + tunjangan);

        double totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}