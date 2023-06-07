package Hewan;

public class Kucing extends Hewan{
    private String rasKucing;
    
    public Kucing(){
    }

    public Kucing(String noPelanggan, String namaHewan, String warnaHewan, int tahunKelahiran, String speciesHewan, String rasKucing){
        super(noPelanggan,namaHewan,warnaHewan,tahunKelahiran,speciesHewan);
        this.rasKucing = rasKucing;
    }

    @Override
    public String getRas(){
        return rasKucing;
    }
}
