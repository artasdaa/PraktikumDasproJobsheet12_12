import java.util.Scanner;

public class KafePercobaan3_12 {

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = totalHarga / 2;
            System.out.println("Promo DISKON50! Anda mendapat potongan: Rp " + diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = (int)(totalHarga * 0.3);
            System.out.println("Promo DISKON30! Anda mendapat potongan: Rp " + diskon);
        } else if (!kodePromo.equalsIgnoreCase("NONE")) {
            System.out.println("Kode promo tidak valid! Tidak ada diskon.");
        }

        return totalHarga - diskon;
    }

    public static void menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15.000");
        System.out.println("2. Cappuccino   - Rp 20.000");
        System.out.println("3. Latte        - Rp 22.000");
        System.out.println("4. Teh Tarik    - Rp 12.000");
        System.out.println("5. Roti Bakar   - Rp 10.000");
        System.out.println("6. Mie Goreng   - Rp 18.000");
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu();

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        System.out.print("Masukkan kode promo (DISKON50 / DISKON30 / NONE): ");
        String kodePromo = sc.nextLine();

        int totalBayar = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalBayar);
    }
}