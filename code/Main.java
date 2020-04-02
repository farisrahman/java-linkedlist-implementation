import list.*;
import java.io.*;
import java.util.Scanner;

public class Main {

    private static LinkedList list;

    public static void main(String[] args) throws IOException {
        list = new LinkedList();
        BufferedReader br = new BufferedReader(new FileReader("./out.txt"));
        String str, title, name;
        int i;
        while ((str = br.readLine()) != null) {
            for (i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == ':') {
                    break;
                }
            }
            title = str.substring(i + 1, str.length());
            name = str.substring(0, i);
            list.add(new Data(name, title));
            i = 0;
        }
        list.SelectionSort();
        System.out.print("\n1.Tampilkan seluruh data Editor \n2.Cari berdasarkan Nama\n3.Cari Editor dan Judulnya\n");
        option();
        br.close();
    }

    public static void option() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukan pilihan : ");
            int val = sc.nextInt();
            // System.out.println("");

            switch (val) {
                case 1:
                    list.display();
                    break;
                case 2:
                    System.out.print("\nMasukan nama yang anda cari :");
                    String nama = sc.next();
                    list.searchByName(nama);
                    break;
                case 3:
                    System.out.print("\nMasukan nama yang anda cari :");
                    String name = sc.next();
                    list.newSearch(name);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input salah, silahkan coba lagi");
            option();
        }
        sc.close();
    }
}