import java.util.ArrayList;

public class Kategori {
    String namaKategori;
    ArrayList<Buku> daftarBuku;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanKategori() {
        System.out.println("\nKategori : " + namaKategori);
        for (Buku b : daftarBuku) {
            b.tampilkanBuku();
            System.out.println();
        }
    }
}