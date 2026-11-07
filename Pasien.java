public abstract class Pasien {
    public static final String RUMAH_SAKIT = "RS Sehat";
    private final String idPasien;
    private String nama;
    private int hariRawat;

    public Pasien(String idPasien, String nama) {
        this(idPasien, nama, 1);
    }

    public Pasien(String idPasien, String nama, int hariRawat) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.hariRawat = hariRawat;
    }

    public void infoPasien() {
        System.out.println("ID: " + idPasien);
        System.out.println("Nama: " + nama);
        System.out.println("Hari: " + hariRawat);
    }

    public abstract void prosesPembayaran();

    public String getIdPasien() { return idPasien; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getHariRawat() { return hariRawat; }
    public void setHariRawat(int hariRawat) { this.hariRawat = hariRawat; }
}