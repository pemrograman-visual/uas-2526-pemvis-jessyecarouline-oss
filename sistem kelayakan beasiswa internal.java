import java.util.*;
import java.lang.Math;

public class SOAL5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String status;
        String[] nama = new String[5];
        double ipk;
        int pendapatankeluarga;
        int tanggungankeluarga, i;
        String[] nama = new String[5];

        for (i = 0; i <= 4; i++) {
            nama[i] = input.nextLine();
            ipk = input.nextDouble();
            if (ipk >= 3.0) {
                status = lolos;
            } else {
                pendapatan = input.nextLine();
                if (pendapatan <= 3000000) {
                    status = lolos;
                } else {
                    tanggungan = input.nextLine();
                    if (tanggungan >= 3) {
                        status = lolos;
                    }
                }
            }
        }
        System.out.println("namapendaftar=" + nama[0] + nama[1] + nama[2] + nama[3] + nama[4] + nama[5]);
    }
}
