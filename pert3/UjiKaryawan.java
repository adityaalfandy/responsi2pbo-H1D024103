public class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        Karyawan karyawan1 = new Karyawan("Budi Santoso", 4000000);
        System.out.println("Status: Karyawan Biasa");
        karyawan1.tampilInfo();

        System.out.println();

        Manajer manajer1 = new Manajer("Siti Aminah", 6000000, 2500000);
        System.out.println("Status: Manajer");
        manajer1.tampilInfo();
    }
}