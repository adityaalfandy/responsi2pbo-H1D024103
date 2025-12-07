class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor (kapasitasTarik)
    double kapasitasTarik;

    // Constructor
    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        // Output: Mesin Traktor [nama] | Tarik: [tarik] ton | Tenaga: [hp] HP
        System.out.print("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | ");
        System.out.println("Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // performa = (tenagaHP x 0.9) + (kapasitasTarik x 10)
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}