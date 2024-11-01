import java.util.ArrayList;
import java.util.List;

public class Bengkel {
    private List<Pelanggan> pelangganList;
    private List<Kendaraan> kendaraanList; // Assuming you have this class too

    public Bengkel() {
        pelangganList = new ArrayList<>();
        kendaraanList = new ArrayList<>();
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
    }

    public List<Pelanggan> getPelangganList() {
        return pelangganList;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void tampilkanRiwayatServis() {
        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println("Riwayat Servis untuk " + kendaraan.getJenis() + ": " + kendaraan.getMerk() + " - " + kendaraan.getModel());
            for (Servis servis : kendaraan.getServisList()) {
                System.out.println(servis.getDetail());
            }
        }
    }
}
