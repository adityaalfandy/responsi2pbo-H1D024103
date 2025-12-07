public class analisisMesin {
    public static void main(String[] args) {

        // 1. Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] inventaris = new defaultMesin[5];

        // 2. Isi array sesuai data soal
        // Data 1: Motor
        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        // Data 2: Traktor
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        // Data 3: Traktor Listrik (extends Traktor)
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        // Data 4: Motor
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        // Data 5: Traktor Listrik
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info, kategori, dan performa
        for (defaultMesin m : inventaris) {
            m.tampilInfo(); // Polimorfisme: memanggil method sesuai tipe objek aslinya
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println(); // spasi
        }

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (Downcasting dengan instanceof)
        for (defaultMesin m : inventaris) {
            // Cek Traktor Listrik DULUAN karena dia turunan dari Traktor
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            }
            else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
            else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin terkuat = inventaris[0];
        for (int i = 1; i < inventaris.length; i++) {
            if (inventaris[i].nilaiPerforma() > terkuat.nilaiPerforma()) {
                terkuat = inventaris[i];
            }
        }
        System.out.println(terkuat.namaMesin + " -> " + terkuat.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting (Bubble Sort Descending) berdasarkan performa
        for (int i = 0; i < inventaris.length - 1; i++) {
            for (int j = 0; j < inventaris.length - i - 1; j++) {
                if (inventaris[j].nilaiPerforma() < inventaris[j + 1].nilaiPerforma()) {
                    // Swap
                    defaultMesin temp = inventaris[j];
                    inventaris[j] = inventaris[j + 1];
                    inventaris[j + 1] = temp;
                }
            }
        }

        // Tampilkan 3 terbaik
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + inventaris[i].namaMesin + " -> " + inventaris[i].nilaiPerforma());
        }
    }
}