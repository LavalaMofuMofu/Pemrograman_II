package praktikum2.soal3;

public class Soal3Main {

    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // p1.nama = "Roi"
        // Pada baris ini tidak terdapat tanda (;) di akhir syntax
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        p1.umur = 17;
        // Tambahkan line (p1.umur = 17;) untuk menentukan umur

        System.out.println("Nama: " + p1.nama);
        System.out.println("Asal: " + p1.asal);
        System.out.println("Jabatan: " + p1.jabatan);

        // System.out.println("Umur: " + p1.umur);
        // Pada baris ini harusnya ditambahkan (+ " Tahun") agar output sesuai dengan soal nantinya
        System.out.println("Umur: " + p1.umur + " Tahun");
    }
}
