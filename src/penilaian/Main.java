package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir na = new NilaiAkhir();
        
        na.setNama("Muhammad Fadli Ajidhansyah");
        na.setNpm("2110010505");
        
        System.out.println("Nama    : "+na.getNama());
        System.out.println("Npm     : "+na.getNpm());
    }
    
}
