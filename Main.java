public class Main {
    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel();

        // Tambahkan Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Budi", "08123456789");
        Pelanggan pelanggan2 = new Pelanggan("Ani", "08987654321");

        // Tambahkan Kendaraan
        Mobil mobil1 = new Mobil("Toyota", "Avanza", "Otomatis");
        Motor motor1 = new Motor("Honda", "CBR", "Sport");

        // Tambahkan Servis dan Perbaikan
        Servis servis1 = new Servis("2024-10-20", "Penggantian Oli");
        Perbaikan perbaikan1 = new Perbaikan("2024-10-22", "Perbaikan Mesin", 500000);

        // Tambah servis ke kendaraan
        mobil1.tambahServis(servis1);
        motor1.tambahServis(perbaikan1);

        // Tambah pelanggan dan kendaraan ke bengkel
        bengkel.tambahPelanggan(pelanggan1);
        bengkel.tambahPelanggan(pelanggan2);
        bengkel.tambahKendaraan(mobil1);
        bengkel.tambahKendaraan(motor1);



        // Tampilkan Daftar Pelanggan
        System.out.println("Daftar Pelanggan:");
        for (Pelanggan pelanggan : bengkel.getPelangganList()) {
            System.out.println(pelanggan.getDetail());
        }

        // Tampilkan Riwayat Servis Kendaraan
        System.out.println("\nRiwayat Servis Kendaraan:");
        bengkel.tampilkanRiwayatServis();
    }
}
