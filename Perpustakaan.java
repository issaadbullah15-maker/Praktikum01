import java.util.ArrayList;

public class Perpustakaan {
    String namaPerpustakaan;
    ArrayList<Kategori> daftarKategori;

    public Perpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
        daftarKategori = new ArrayList<>();
    }

    public void tambahKategori(Kategori kategori) {
        daftarKategori.add(kategori);
    }

    public void tampilkanPerpustakaan() {
        System.out.println("Perpustakaan : " + namaPerpustakaan);
        for (Kategori k : daftarKategori) {
            k.tampilkanKategori();
        }
    }
}