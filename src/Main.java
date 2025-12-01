import java.io.*;

public class Main {
    public static void main(String[] args) {

        // 1. Membuat file data.txt dan menulis teks ke dalamnya
        try (FileWriter writer = new FileWriter("data.txt")) {
            writer.write("Ini adalah contoh teks yang ditulis ke dalam file.\n");
            writer.write("Nama : M Khoiru Umam \n");
            writer.write("NPM  : 24313042 \n");
            writer.write("Prodi: Teknologi Informasi \n");
            System.out.println("File berhasil dibuat dan ditulis.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }

        // 2. Membaca isi file data.txt dan menampilkannya di console
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            System.out.println("\nIsi dari data.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
