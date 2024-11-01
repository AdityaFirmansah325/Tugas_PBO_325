import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    private String nama;
    private String nomorTelepon;

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getDetail() {
        return "Nama: " + nama + ", Nomor Telepon: " + nomorTelepon;
    }
}
