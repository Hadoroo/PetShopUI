package Hewan;

public class Hewan {
    private String noPelanggan;
    private String namaHewan;
    private String warnaHewan;
    private int tahunKelahiran;
    private String speciesHewan;

    public Hewan(){
    }

    public Hewan(String noPelanggan, String namaHewan, String warnaHewan, int tahunKelahiran, String speciesHewan){
        this.noPelanggan = noPelanggan;
        this.namaHewan = namaHewan;
        this.warnaHewan = warnaHewan;
        this.tahunKelahiran = tahunKelahiran;
        this.speciesHewan = speciesHewan;
    }

    public String getNoPelanggan() {
        return noPelanggan;
    }

    public void setNoPelanggan(String noPelanggan) {
        this.noPelanggan = noPelanggan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getWarnaHewan() {
        return warnaHewan;
    }

    public void setWarnaHewan(String warnaHewan) {
        this.warnaHewan = warnaHewan;
    }

    public int getTahunKelahiran() {
        return tahunKelahiran;
    }

    public void setTahunKelahiran(int tahunKelahiran) {
        this.tahunKelahiran = tahunKelahiran;
    }

    public String getSpeciesHewan() {
        return speciesHewan;
    }

    public void setSpeciesHewan(String speciesHewan) {
        this.speciesHewan = speciesHewan;
    }

    public String getRas(){
        return "";
    }
}
