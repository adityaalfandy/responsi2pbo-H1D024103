public class PaymentTest {

    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ==="); // Header

        EWalletPayment ovo = new EWalletPayment("OVO", 150000, 50000);

        System.out.println("Saldo awal: " + (int)ovo.getBalance());

        System.out.println("Memproses pembayaran sebesar 50000..."); //
        ovo.processPayment();
        System.out.println("Sisa saldo: " + (int)ovo.getBalance()); //
        System.out.println(ovo.getPaymentDetails()); //
    }
}