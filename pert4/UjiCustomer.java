public class UjiCustomer {
    public static void main(String[] args) {

        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        Customer customerBiasa = new Customer("Budi Santoso", "CST-001", 500000);

        System.out.println("Status: Customer Biasa");
        customerBiasa.tampilkanInfo();

        System.out.println();

        Member customerMember = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        System.out.println("Status: Member");
        customerMember.tampilkanInfo();
    }
}