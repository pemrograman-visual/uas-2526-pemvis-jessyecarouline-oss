import java.util.*;
import java.lang.Math;

public class SOAL2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int i;
        String namabarang;
        int terjual;
        int sisa;
        String status;
        int stokAwal;

        n = 4;
        for (i = 0; i <= 3; i++) {
            namabarang = input.nextLine();
            stokAwal = input.nextInt();
            terjual = input.nextInt();
            sisa = stokAwal - terjual;
            if (sisa == 0) {
                status = "Habis,segera restock!";
            } else {
                if (sisa < 5) {
                    status = "Stok menipis";
                } else {
                    status = "Stok aman";
                }
            }
        }
        System.out.println(namabarang + (char) 9 + stokAwal + (char) 9 + terjual + (char) 9 + sisa + (char) 9 + status + (char) 9);
    }
}
