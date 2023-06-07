package Karyawan;

public class Groomer extends Karyawan {
    private float biayaPerawatan;
    private float tagihanPerawatan;

    public Groomer(){
    } 

    public Groomer(String nama, String alamat, String telepon, String jenisKelamin, String kategoriKaryawan, int gaji, float biayaPerawatan){
        super(nama,alamat,telepon,jenisKelamin,kategoriKaryawan,gaji);
        this.biayaPerawatan = biayaPerawatan;
    }

    @Override
    public float getBiaya() {
        return biayaPerawatan;
    }

    public void setBiaya(float biayaPerawatan) {
        this.biayaPerawatan = biayaPerawatan;
    }

    public float getTagihanPerawatan() {
        return tagihanPerawatan;
    }

    public void setTagihanPerawatan(float tagihanPerawatan) {
        this.tagihanPerawatan = tagihanPerawatan;
    }
}
