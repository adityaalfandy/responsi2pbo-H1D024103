public class Member extends Customer {
    // Atribut tambahan
    private int poin;
    private String level;

    // Constructor dengan super
    public Member(String nama, String id, int totalBelanja, int poin, String level) {
        // Panggil constructor Customer menggunakan super(...)
        super(nama, id, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        // Panggil method tampilkanInfo milik parent dulu
        super.tampilkanInfo();
        // Lalu tampilkan data tambahan khusus Member
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}