class Pengguna {
    int umur;
    double beratBadan;
    double tinggiBadan;

    final double faktorAktivitas = 1.2;

    public Pengguna(int umur, double beratBadan, double tinggiBadan) {
        this.umur = umur;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100;
        return beratBadan / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        double bmi = hitungBMI();
        System.out.print("Kategori: ");

        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Obesitas");
        }
    }

    double hitungKalori() {
        return beratBadan * faktorAktivitas * 10;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + beratBadan + " kg");
        System.out.println("Tinggi: " + tinggiBadan + " cm");

        System.out.printf("BMI: %.2f\n", hitungBMI());

        tampilKategori();

        System.out.println("Kebutuhan Kalori: " + (int) hitungKalori() + " kal/hari");
        System.out.println("====================================");
    }
}
