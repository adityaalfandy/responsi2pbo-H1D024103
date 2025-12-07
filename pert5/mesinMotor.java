class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipeMotor)
    String tipeMotor;

    // Constructor
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    void tampilInfo() {
        // Output: Mesin Motor [nama] | Tipe: [tipe] | Tenaga: [hp] HP
        System.out.print("Mesin Motor " + namaMesin + " | Tipe: " + tipeMotor + " | ");
        System.out.println("Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // performa = tenagaHP x 1,2
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        return "Mesin Motor";
    }

    void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}