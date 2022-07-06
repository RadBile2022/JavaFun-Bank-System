package B1_Model;

public class Nasabah {
    private String nama;
    private String id;

    public Nasabah(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nasabah{" + "nama=" + nama + ", id=" + id + '}';
    }
}


