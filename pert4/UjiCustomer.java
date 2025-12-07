public class UjiCustomer {
    public static void main(String[] args) {

        // Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // Buat object Customer (Budi Santoso)
        Customer customerBiasa = new Customer("Budi Santoso", "CST-001", 500000);

        // Tampilkan info untuk Customer biasa
        System.out.println("Status: Customer Biasa");
        customerBiasa.tampilkanInfo();

        System.out.println(); // Jarak baris kosong

        // Buat object Member (Siti Aminah)
        Member customerMember = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // Tampilkan info untuk pelanggan Member
        System.out.println("Status: Member");
        customerMember.tampilkanInfo();
    }
}