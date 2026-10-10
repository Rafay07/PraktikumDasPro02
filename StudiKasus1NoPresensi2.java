import java.util.Scanner;

public class StudiKasus1NoPresensi2{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int hargaPercup=18000;
    int jumlahPerCup,uangBayar,totalHarga,diskon,totalBayar,kembalian,kurang;
    System.out.println("Selamat datang di Kedai Kopi Senja");
    System.out.println("Kami menjual Kopi Susu Gula Aren seharga Rp18.000 per cup dan memberikan\r\n" + //
                "diskon 10% untuk pembelian minimal Rp100.000.");
    System.out.print("Masukkan jumlah cup yang anda pesan : ");
    jumlahPerCup=sc.nextInt();
    System.out.print("Masukkan jumlah uang anda : ");
    uangBayar=sc.nextInt();
    totalHarga=jumlahPerCup*hargaPercup;
    diskon=0;
    if (totalHarga >=100000) {
        diskon=totalHarga*10/100;
        
    } else {
        diskon=0;
    }
    totalBayar=totalHarga-diskon;
    System.out.println("Anda mendapatkan Diskon sebesar Rp."+ diskon+ ",Total pesanan yang harus anda bayarkan sebesar Rp."+totalBayar);
    if (uangBayar>=totalBayar) {
        kembalian=uangBayar-totalBayar;
        System.out.println("Kembalian anda sebesar Rp."+ kembalian);
    } else {
        kurang=totalBayar-uangBayar;
        System.out.println("Maaf,Uang anda kurang sebesar Rp."+ kurang+",silahkan ganti mode pembayaran");
    }

    sc.close();
}

}
