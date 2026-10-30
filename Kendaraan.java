public class Kendaraan {
    protected String platNomor;
    protected String merk;

    public Kendaraan(String platNomor, String merk) {
        this.platNomor = platNomor;
        this.merk = merk;
    }

    // TAMBAHKAN METHOD INI AGAR TIDAK ERROR
    public double hitungTarif(int jarak) {
        return 0;
    }

    public void cetakResi(int jarak) {
        System.out.println("Plat : " + platNomor);
        System.out.println("Merk : " + merk);
        System.out.println("Tarif : Rp " + hitungTarif(jarak));
        System.out.println("-----------------------");
    }
}