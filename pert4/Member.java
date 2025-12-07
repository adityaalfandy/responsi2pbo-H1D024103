public class Member extends Customer {
    // Atribut tambahan
    private int poin;
    private String level;

    public Member(String nama, String id, int totalBelanja, int poin, String level) {
        // Panggil constructor Customer menggunakan super(...)
        super(nama, id, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}