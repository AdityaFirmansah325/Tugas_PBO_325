import java.util.ArrayList;
import java.util.List;

public class Kendaraan {
    private String jenis;
    private String merk;
    private String model;
    private List<Servis> servisList;

    public Kendaraan(String jenis, String merk, String model) {
        this.jenis = jenis;
        this.merk = merk;
        this.model = model;
        this.servisList = new ArrayList<>();
    }

    public String getJenis() {
        return jenis;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public List<Servis> getServisList() {
        return servisList;
    }

    public void tambahServis(Servis servis) {
        this.servisList.add(servis);
    }
}