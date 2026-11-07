public class PasienUmum extends Pasien {

    public PasienUmum(String idPasien, String nama, int hariRawat) {
        super(idPasien, nama, hariRawat);
    }

    @Override
    public void infoPasien() {
        super.infoPasien();
        System.out.println("Tipe: Pasien Umum");
    }

    @Override
    public void prosesPembayaran() {
        if (getHariRawat() > 3) System.out.println("Status: Diskon 10% (Rawat > 3 hari)");
        else System.out.println("Status: Pembayaran Normal");
    }
}