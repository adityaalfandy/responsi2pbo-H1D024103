public class EWalletPayment implements PaymentMethod {

    // Atribut sesuai spesifikasi
    private String namaLayanan;
    private double saldo;
    private double nominalTransaksi;

    // Constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, double saldo, double nominalTransaksi) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }

    // Implementasi method getTransactionFee
    // Mengacu pada contoh di PDF, fee adalah 2000 (150.000 - 50.000 - 98.000 = 2.000)
    @Override
    public double getTransactionFee() {
        return 2000.0;
    }

    // Implementasi method processPayment
    // Melakukan pengecekan saldo dan pengurangan saldo
    @Override
    public void processPayment() {
        double totalBiaya = nominalTransaksi + getTransactionFee();

        if (saldo >= totalBiaya) {
            saldo -= totalBiaya; // Kurangi saldo
            // Tampilkan pesan berhasil
            System.out.println("Pembayaran berhasil!");
        } else {
            // Tampilkan pesan gagal
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    // Implementasi method getPaymentDetails
    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + namaLayanan;
    }

    // Implementasi method getBalance
    @Override
    public double getBalance() {
        return saldo;
    }
}