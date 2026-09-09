import java.util.Scanner;
public class GajiKaryawan31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajipokok;
        double bonus, totgaji;
        double tunjTrans = 600000;
        double tunjMkn = 400000;

        System.out.println("Masukkan Gaji :");
        gajipokok = sc.nextInt();

        bonus = 0.05 * gajipokok;
        totgaji = gajipokok + tunjTrans + tunjMkn + bonus - (0.1 * gajipokok);

        System.out.println("Bonus Bulanan anda adalah Rp." + bonus);
        System.out.println("Gaji yang diterima adalah Rp." + totgaji);
        
        sc.close();
    }
}