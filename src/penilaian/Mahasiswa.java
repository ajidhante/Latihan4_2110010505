package penilaian;

public class Mahasiswa {
    String nama,npm;

    
    //getter
    public String getNama() {
        System.out.println("superclass");
        return nama;
    }

    public String getNpm() {
        return npm;
    }
    
    
    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
    
}
