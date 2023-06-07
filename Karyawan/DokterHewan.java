package Karyawan;

public class DokterHewan extends Karyawan{
    private float biayaPeriksa;

    public DokterHewan(){
    }

    public DokterHewan(String nama, String alamat, String telepon, String jenisKelamin, String kategoriKaryawan, int gaji, float biayaPeriksa){
        super(nama,alamat,telepon,jenisKelamin,kategoriKaryawan,gaji);
        this.biayaPeriksa = biayaPeriksa;
    }
}
