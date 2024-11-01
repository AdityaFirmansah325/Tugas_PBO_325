public class Motor extends Kendaraan {
    private String tipe;

    public Motor(String merk, String model, String tipe) {
        super("Motor", merk, model);
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }
}

