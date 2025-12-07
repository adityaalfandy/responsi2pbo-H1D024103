public class EWalletPayment implements PaymentMethod {

    private String namaLayanan;
    private double saldo;
    private double nominalTransaksi;

    public EWalletPayment(String namaLayanan, double saldo, double nominalTransaksi) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }


    @Override
    public double getTransactionFee() {
        return 2000.0;
    }


    @Override
    public void processPayment() {
        double totalBiaya = nominalTransaksi + getTransactionFee();

        if (saldo >= totalBiaya) {
            saldo -= totalBiaya;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}