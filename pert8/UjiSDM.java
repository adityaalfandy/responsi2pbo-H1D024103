public class UjiSDM {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ==="); // [cite: 65]

        // 1. BUAT OBJEK ProgrammerMagang
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234"); // [cite: 52, 54, 56, 57]

        // 2. PENGUJIAN METODE BERURUTAN
        andi.hitungGaji(160); // [cite: 58]
        System.out.println("Status Cuti: " + andi.getStatusCuti()); // [cite: 59]
        andi.login("9999"); // [cite: 60]
        andi.login("1234"); // [cite: 61]
        System.out.println("Role Akses: " + andi.getRoleAkses()); // [cite: 62]
        andi.perpanjangKontrak(6); // [cite: 63]
        andi.logout(); // [cite: 63]
    }
}