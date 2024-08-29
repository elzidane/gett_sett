public class guru2 {
    private int id;
    private String nama;
    private String mapel;
    private String alamat;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public guru2() {
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    }
    //constructor parameter
    public guru2 (int id, String nama, String mapel, String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }

    public void print() {
        System.out.println("Data diri guru: ");
        System.out.println("id: " + id);
        System.out.println("nama: " + nama);
        System.out.println("mapel: " + mapel);
        System.out.println("alamat: " + alamat);
    }
}
