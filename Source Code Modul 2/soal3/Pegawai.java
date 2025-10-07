package praktikum2.soal3;

// public class Employee {}
// Pada baris ini nama class tidak sama dengan nama file, yang mengakibatkan error
public class Pegawai {
    public String nama;

    // public char asal;
    // Pada baris ini tipe data (char) tidak sesuai dengan nilai dari Soal3Main yaitu (String)
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // public void setJabatan() {}
    // Method setter ini error karena tidak ada paremeter didalamnya
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}