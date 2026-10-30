public class Mobil extends Kendaraan {
    public Mobil(String platNomor, String merk) {
        super(platNomor, merk);
    }

    @Override
    public double hitungTarif(int jarak) {
        System.out.println("Mobil dipanggil");
        return jarak * 5000;
    }
}