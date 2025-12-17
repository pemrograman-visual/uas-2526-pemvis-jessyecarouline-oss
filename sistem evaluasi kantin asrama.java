import java.util.*;
import java.lang.Math;

public class SOAL1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, tertinggi, terendah, count, n, rating;
        double ratarata, total;
        String status;
        double[] data = new double[6];

        total = 0;
        count = 0;
        tertinggi = 999;
        terendah = -999;
        for (i = 0; i <= 5; i++) {
            rating = input.nextInt();
            data[i] = rating;
            total = total + rating;
            if (tertinggi >= rating) {
                tertinggi = rating;
                count = count + 1;
            } else {
                if (terendah <= rating) {
                    terendah = rating;
                }
            }
        }
        ratarata = total / 6;
        if (ratarata >= 4) {
            status = "kantin dalam kondisi baik";
        } else {
            if (ratarata >= 3) {
                status = "kondisi cukup masih perlu peningkatan";
            } else {
                status = "kantin perlu evaluasi manajemen";
            }
        }
        System.out.println(" daftar rating= " + data[0] + data[1] + data[2] + data[3] + data[4] + data[5]);
        System.out.println("ratarata=" + ratarata);
        System.out.println("tertinggi=" + tertinggi);
        System.out.println("terendah=" + terendah);
        System.out.println("status" + status);
    }
    
    public static void func_input(int[] data) {
        int[] data = new int[6];
        double rating, i;
        int total;

        for (i = 0; i <= 5; i++) {
            data = input.nextInt();
            data[i] = rating;
            total = total + rating;
        }
    }
}
