class mesinMotor extends defaultMesin {
    String tipeMotor;

    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    void tampilInfo() {
        System.out.print("Mesin Motor " + namaMesin + " | Tipe: " + tipeMotor + " | ");
        System.out.println("Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
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