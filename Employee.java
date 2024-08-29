public class Employee {
    private String nama;
    private double gaji;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return this.gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public Employee (){ 
        nama = "";
        gaji = 0;
    }

    public Employee (String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
       
    }

    public void print() {
        System.out.println("Data dari siswa: ");
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}
