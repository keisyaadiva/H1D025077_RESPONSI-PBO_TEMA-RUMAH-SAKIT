public class MainRumahSakit {
    public static void main(String[] args) {
        System.out.println(Pasien.RUMAH_SAKIT);

        Fasilitas fas = new PasienVIP("VIP-01", "Budi", 5);
        fas.gunaFasilitas();

        System.out.println("-------------------------");

        Pasien p1 = new PasienUmum("UM-01", "Andi", 4, 150000);
        p1.infoPasien();
        p1.prosesPembayaran();

        System.out.println("-------------------------");

        PasienVIP p2 = new PasienVIP("VIP-01", "Budi", 5);
        p2.infoPasien();
        p2.prosesPembayaran();
        p2.rawat();
    }
}