package Karyawan;

public class DokterHewan extends Karyawan{
    private float biayaPeriksa;

    @Override
    public float getBiaya() {
        return biayaPeriksa;
    }

    public void setBiayaPeriksa(float biayaPeriksa) {
        this.biayaPeriksa = biayaPeriksa;
    }

    public DokterHewan(){
    }

    public DokterHewan(String nama, String alamat, String telepon, String jenisKelamin, String kategoriKaryawan, int gaji, float biayaPeriksa){
        super(nama,alamat,telepon,jenisKelamin,kategoriKaryawan,gaji);
        this.biayaPeriksa = biayaPeriksa;
    }
}
