public class PaymentTest {

    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ==="); // Header

        // 1. Buat objek dari EWalletPayment dengan data awal sesuai contoh
        // Nama: OVO, Saldo: 150000, Nominal: 50000
        EWalletPayment ovo = new EWalletPayment("OVO", 150000, 50000);

        // 2. Menampilkan saldo awal
        System.out.println("Saldo awal: " + (int)ovo.getBalance());

        // 3. Memproses pembayaran
        System.out.println("Memproses pembayaran sebesar 50000..."); //
        ovo.processPayment(); // Output: Pembayaran berhasil!

        // 4. Menampilkan data setelah transaksi
        System.out.println("Sisa saldo: " + (int)ovo.getBalance()); //
        System.out.println(ovo.getPaymentDetails()); //
    }
}