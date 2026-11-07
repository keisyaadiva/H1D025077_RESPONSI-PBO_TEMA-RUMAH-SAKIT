public class PasienUmum extends Pasien {
    private double biayaPerHari;

    public PasienUmum(String idPasien, String nama, int hariRawat, double biayaPerHari) {
        super(idPasien, nama, hariRawat);
        this.biayaPerHari = biayaPerHari;
    }

    @Override
    public void infoPasien() {
        super.infoPasien();
        System.out.println("Tipe: Pasien Umum");
        System.out.println("Biaya/Hari: Rp" + biayaPerHari);
    }

    @Override
    public void prosesPembayaran() {
        if (getHariRawat() > 3) System.out.println("Status: Diskon 10% (Rawat > 3 hari)");
        else System.out.println("Status: Pembayaran Normal");
    }
}