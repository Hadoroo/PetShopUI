package Hewan;

public class Kelinci extends Hewan{
    private String rasKelinci;

    public Kelinci(){
    }

    public Kelinci(String noPelanggan, JenisPerawatan jenisPerawatan, String namaHewan, String warnaHewan, int tahunKelahiran, String speciesHewan, String rasKelinci){
        super(noPelanggan, jenisPerawatan, rasKelinci, namaHewan, warnaHewan, tahunKelahiran, speciesHewan);
        this.rasKelinci = rasKelinci;
    }

    public String getRas(){
        return rasKelinci;
    }
}
