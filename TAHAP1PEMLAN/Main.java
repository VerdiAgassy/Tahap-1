package TAHAP1PEMLAN;

public class Main {
    public static void main(String[] args) {
        Perusahaan prshn = new Perusahaan();
        Karyawan Verdi = new Karyawan("Verdi", 10000000, prshn);
        
        Verdi.info();
        
        
    }
    
}
