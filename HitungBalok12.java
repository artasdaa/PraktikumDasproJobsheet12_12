import java.util.Scanner;

public class HitungBalok12 {
    static int hitungLuas(int pjg, int lb) {
        return pjg * lb;
    }
    static int hitungVolume(int tinggi, int panjang, int lebar) {
        return hitungLuas(panjang, lebar) * tinggi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("======================================");
        System.out.println("      PROGRAM MENGHITUNG BALOK        ");
        System.out.println("======================================");

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();

        System.out.print("Masukkan lebar   : ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi  : ");
        t = input.nextInt();

        System.out.println("--------------------------------------");

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang = " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok         = " + vol);

        System.out.println("======================================");

        input.close();
    }
}
