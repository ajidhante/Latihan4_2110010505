package penilaian;
public class Main {
    public static void main (String []args){
        
        NilaiAkhir fadli = new NilaiAkhir("Fadli","2110010505",85,80,90);
        
        System.out.println("Nama        : "+ fadli.getNama());
        System.out.println("NPM         : "+ fadli.getNpm());
        System.out.println("Nilai Akhir : "+ fadli.hitungNilaiAkhir());
        
        
    }
    
}