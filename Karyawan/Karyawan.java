package Karyawan;

public class Karyawan {
    private String nama;
    private String alamat;
    private String telepon;
    private String jenisKelamin;
    private String kategoriKaryawan;
    private int gaji;

    public Karyawan(){
    }
    
    public Karyawan(String nama, String alamat, String telepon, String jenisKelamin, String kategoriKaryawan, int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jenisKelamin = jenisKelamin;
        this.kategoriKaryawan = kategoriKaryawan;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getKategoriKaryawan() {
        return kategoriKaryawan;
    }

    public void setKategoriKaryawan(String kategoriKaryawan) {
        this.kategoriKaryawan = kategoriKaryawan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }                              
}