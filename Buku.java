import java.util.ArrayList;

public class Buku {
    String judul;
    ArrayList<String> penulis;

    public Buku(String judul) {
        this.judul = judul;
        penulis = new ArrayList<>();
    }

    public void tambahPenulis(String namaPenulis) {
        penulis.add(namaPenulis);
    }

    public void tampilkanBuku() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Penulis : " + penulis);
    }
}