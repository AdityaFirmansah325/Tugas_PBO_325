public class Servis {
    private String tanggal;
    private String jenisServis;

    public Servis(String tanggal, String jenisServis) {
        this.tanggal = tanggal;
        this.jenisServis = jenisServis;
    }

    public String getDetail() {
        return "Tanggal: " + tanggal + ", Jenis Kendaraan: " + jenisServis;
    }
}
