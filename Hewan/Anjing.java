package Hewan;



public class Anjing extends Hewan{
    private String rasAnjing;

    public Anjing(){
    }

    public Anjing(String noPelanggan, JenisPerawatan jenisPerawatan, String namaHewan, String warnaHewan, int tahunKelahiran, String speciesHewan, String rasAnjing){
        super(noPelanggan, jenisPerawatan, rasAnjing, namaHewan, warnaHewan, tahunKelahiran, speciesHewan);
        this.rasAnjing = rasAnjing;
    }

    public String getRas(){
        return rasAnjing;
    }
}