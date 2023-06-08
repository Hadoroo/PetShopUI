package Hewan;

import java.text.DecimalFormat;
import java.util.ArrayList;
import Karyawan.*;

public class Hewan {
    DecimalFormat decimalFormat = new DecimalFormat("###,###.00");
    private String noPelanggan;
    private String namaHewan;
    private String warnaHewan;
    private int tahunKelahiran;
    private String speciesHewan;
    private JenisPerawatan jenisPerawatan;
    private String karyawan;
    public static ArrayList <Hewan> daftarHewan = new ArrayList<Hewan>();
    public Integer hargaPerawatan;
    public String namaPerawatan;

    public int getHargaPerawatan(JenisPerawatan jenisPerawatan){
        switch (jenisPerawatan){
            case SUNTIK_VAKSIN: return 100000;
            case SUNTIK_ANTI_KUTU: return 150000;
            case SUNTIK_SCABIES: return 200000;
            case SUNTIK_ANTI_JAMUR_KULIT: return 250000;
            case PEMERIKSAAN_RAWAT_INAP: return 1000000;
            case PEMERIKSAAN_RAWAT_JALAN: return 500000;
            case POTONG_RAMBUT: return 200000;
            case POTONG_KUKU: return 100000;
            case PAKET_MANDI: return 150000;
            case JASA_PENITIPAN: return 500000;
            
        }
        return 0;
    }
    public String getPerawatan(JenisPerawatan jenisPerawatan){
        switch (jenisPerawatan){
            case SUNTIK_VAKSIN: return "Suntik Vaksin";
            case SUNTIK_ANTI_KUTU: return "Suntik Anti Kutu";
            case SUNTIK_SCABIES: return "Suntik Scabies";
            case SUNTIK_ANTI_JAMUR_KULIT: return "Suntik Anti Jamur Kulit";
            case PEMERIKSAAN_RAWAT_INAP: return "Pemeriksaan Rawat Inap";
            case PEMERIKSAAN_RAWAT_JALAN: return "Pemeriksaan Rawat Jalan";
            case POTONG_RAMBUT: return "Potong Rambut";
            case POTONG_KUKU: return "Potong Kuku";
            case PAKET_MANDI: return "Paket Mandi";
            case JASA_PENITIPAN: return "Jasa Penitipan";
        }
        return "";
    }

    public Hewan(){
    }

    public Hewan(String namaPerawatan, Integer hargaPerawatan){
        this.namaPerawatan = namaPerawatan;
        this.hargaPerawatan = hargaPerawatan;
    }

    public Hewan(String noPelanggan, JenisPerawatan jenisPerawatan, String karyawan,String namaHewan, String warnaHewan, int tahunKelahiran, String speciesHewan){
        this.noPelanggan = noPelanggan;
        this.jenisPerawatan = jenisPerawatan;
        this.karyawan = karyawan;
        this.namaHewan = namaHewan;
        this.warnaHewan = warnaHewan;
        this.tahunKelahiran = tahunKelahiran;
        this.speciesHewan = speciesHewan;
    }
    
    public String getNoPelanggan(){
        return noPelanggan;
    }

    public String getKaryawan(){
        return karyawan;
    }

    public String getNamaHewan(){
        return namaHewan;
    }

    public String getWarnaHewan(){
        return warnaHewan;
    }
    
    public int getTahunKelahiran(){
        return tahunKelahiran;
    }

    public String getSpeciesHewan(){
        return speciesHewan;
    }

    public String getRasAnjing() {
        return speciesHewan;
    }

    public String getRasKelinci() {
        return speciesHewan;
    }

    public String getRasKucing() {
        return speciesHewan;
    }
}
