package JavaCollectionTask;

public class Buku implements Comparable<Buku> {
    private String ISSN;
    private String namaPengarang;
    private String judul;
    private String tahunTerbit;
    private String penerbit;
    private int harga;

    public Buku(String ISSN, String namaPengarang, String judul, String tahunTerbit, String penerbit, int harga) {
        this.ISSN = ISSN;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.namaPengarang = namaPengarang;
        this.penerbit = penerbit;
        this.harga = harga;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public int compareTo(Buku bukuLain) {
        return this.namaPengarang.compareTo(bukuLain.namaPengarang); // Mengurutkan berdasarkan judul
    }

    @Override
    public String toString() {
        return "ISSN: " + ISSN + ", Pengarang: " + namaPengarang + ", Judul: " + judul + ", Tahun Terbit: " + tahunTerbit + ", Penerbit: " + penerbit + ", Harga: " + harga;
    }
}