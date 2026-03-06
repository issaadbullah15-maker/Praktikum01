public class MainPerpustakaan {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan("Perpustakaan SaMec");

        String[] kategori = {"Teknologi","Filsafat","Sejarah","Agama","Psikologi","Politik","Fiksi"};

        for(String namaKategori : kategori){

            Kategori k = new Kategori(namaKategori);

            for(int i=1;i<=5;i++){
                Buku b = new Buku(namaKategori + " Buku " + i);
                b.tambahPenulis("Penulis " + i);
                k.tambahBuku(b);
            }

            perpus.tambahKategori(k);
        }

        perpus.tampilkanPerpustakaan();
    }
}