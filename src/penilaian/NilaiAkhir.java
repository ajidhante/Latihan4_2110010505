package penilaian;

public class NilaiAkhir extends Mahasiswa{
    public int uts, uas, tugas;

    public NilaiAkhir(int uts, int uas, int tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    NilaiAkhir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    int hitungNilaiAkhir(){
        return  30/100*uts + 30/100*uas + 40/100*tugas;
    }
  
}
