public class Mobil extends Kendaraan {
    private String transmisi;

    public Mobil(String merk, String model, String transmisi) {
        super("Mobil", merk, model);
        this.transmisi = transmisi;
    }

    public String getTransmisi() {
        return transmisi;
    }
}