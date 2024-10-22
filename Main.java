package JavaCollectionTask;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Buku> daftarBuku = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\PemrogramanMahir\\src\\JavaCollectionTask\\dataBuku.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                daftarBuku.add(new Buku(data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim(), data[4].trim(), Integer.parseInt(data[5].trim())));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        tampilkanData(daftarBuku, "Data Buku Sebelum Diurutkan");
        Collections.sort(daftarBuku);
        tampilkanData(daftarBuku, "Data Buku Setelah Diurutkan Berdasarkan Nama Pengarang");

        if (!daftarBuku.isEmpty()) {
            daftarBuku.get(0).setHarga(277000);
            daftarBuku.get(0).setPenerbit("Zanafa Media");
            tampilkanData(daftarBuku, "Data Setelah Mengubah Harga dan Penerbit Buku Pertama");
        }

        if (daftarBuku.size() > 2) {
            daftarBuku.remove(2);
            tampilkanData(daftarBuku, "Data Setelah Menghapus Buku Index ke-2");
        }

        daftarBuku.add(0, new Buku("4321-0987", "Citra Afrilianti", "Artificial Intelligence", "2023-07-01", "AI Express", 280000));
        tampilkanData(daftarBuku, "Data Setelah Menambah Buku di Index 0");

        if (daftarBuku.size() >= 6) {
            daftarBuku.add(6, new Buku("7654-8765", "Najah Karimah Muklis", "Self Development", "2004-11-07", "Nakamu Press", 300000));
            tampilkanData(daftarBuku, "Data Setelah Menambah Buku di Index 7");
        }

        daftarBuku.add(new Buku("1235-7890", "Fillar", "Teori Bahasa dan Otomata", "2009-12-01", "Mobile Press", 260000));
        tampilkanData(daftarBuku, "Data Setelah Menambah Buku di Akhir");
    }

    public static void tampilkanData(List<Buku> daftarBuku, String judul) {
        System.out.println("\n" + judul + "\n" + "=".repeat(judul.length()));
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBuku.get(i));
        }
    }
}