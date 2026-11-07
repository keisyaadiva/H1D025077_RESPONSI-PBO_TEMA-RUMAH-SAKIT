public class PasienVIP extends Pasien implements Fasilitas, Perawatan {

    public PasienVIP(String idPasien, String nama, int hariRawat) {
        super(idPasien, nama, hariRawat);
    }

    @Override
    public void prosesPembayaran() {
        if (getHariRawat() >= 5) System.out.println("Status: Cashback Kamar VIP!");
        else System.out.println("Status: Biaya VIP Standar");
    }

    @Override
    public void gunaFasilitas() {
        System.out.println("Fasilitas: Akses Lounge VIP");
    }

    @Override
    public void rawat() {
        System.out.println("Tindakan: Perawatan Prioritas 24/7");
    }
}