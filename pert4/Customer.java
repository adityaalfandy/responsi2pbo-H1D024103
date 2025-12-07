public class Customer {
    // Atribut (menggunakan protected agar bisa diakses oleh subclass Member)
    protected String nama;
    protected String id;
    protected int totalBelanja;

    // Constructor
    public Customer(String nama, String id, int totalBelanja) {
        this.nama = nama;
        this.id = id;
        this.totalBelanja = totalBelanja;
    }

    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + id + " | Total Belanja: Rp " + totalBelanja);
    }
}