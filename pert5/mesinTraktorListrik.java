class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    double kapasitasBaterai;

    // Constructor
    // Karena extends Traktor, kita harus passing 'tarik' ke super constructor
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        // Output: Mesin Traktor Listrik [nama] | Tarik: [tarik] ton | Baterai: [baterai] kWh | Tenaga: [hp] HP
        System.out.print("Mesin Traktor Listrik " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | ");
        System.out.print("Baterai: " + kapasitasBaterai + " kWh | ");
        System.out.println("Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // performa = (tenagaHP x 1.1) + (kapasitasBaterai x 5)
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}