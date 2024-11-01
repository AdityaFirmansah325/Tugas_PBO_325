public class Perbaikan extends Servis {
    private String jenisPerbaikan;
    private int biaya;

    public Perbaikan(String tanggal, String jenisPerbaikan, int biaya) {
        super(tanggal, "Perbaikan");
        this.jenisPerbaikan = jenisPerbaikan;
        this.biaya = biaya;
    }

    @Override
    public String getDetail() {
        return "Tanggal: " + super.getDetail() + ", Perbaikan: " + jenisPerbaikan + ", Biaya: Rp " + biaya;
    }
}