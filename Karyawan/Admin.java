package Karyawan;

public class Admin extends Karyawan{

    public Admin(){
    }

    public Admin(String nama, String alamat, String telepon, String jenisKelamin, String kategoriKaryawan, int gaji){
        super(nama,alamat,telepon,jenisKelamin,kategoriKaryawan, gaji);
    }
}
