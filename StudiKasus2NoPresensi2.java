import java.util.Scanner;

public class StudiKasus2NoPresensi2{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String nama,jeniskegiatan;
    int jumlahDokumen,peringkatJuara,status;
    System.out.println("Masukkan nama mahasiswa : ");
    nama=sc.nextLine();
    System.out.println("Masukkan jenis kegiatan : (BELMAWA,BAKORMA,MANDIRI,PKM,atau lainnya) : ");
    jeniskegiatan=sc.nextLine();
    System.out.println("===Hasil Penilaian Kelayakan Dokumen===");
    System.out.println("Nama Mahasiswa : "+nama);
    if (jeniskegiatan.equalsIgnoreCase("belmawa") || jeniskegiatan.equalsIgnoreCase("bakorma") || jeniskegiatan.equalsIgnoreCase("mandiri")) {
        System.out.println("Masukkan peringkat juara : (1-4(4 untuk tidak juara)) : ");
        peringkatJuara=sc.nextInt();
        if (peringkatJuara>=1 && peringkatJuara<=3) {
            status=1;
            jumlahDokumen=sc.nextInt();
            if (jumlahDokumen>=3) {
                System.out.println("Selamat, dokumen anda dinyatakan memenuhi");
                System.out.println("Status : MENDAPAT dana penghargaan");
                System.out.println("Alasan : Juara " + peringkatJuara + " dan 4 dokumen lengkap");
            } else {
                System.out.println("Maaf, dokumen anda dinyatakan tidak memenuhi");
                System.out.println("Status : TIDAK mendapat dana penghargaan");
                System.out.println("Alasan : Dokumen tidak lengkap");
                System.out.println("Dokumen yang masih kurang : " + (4 - jumlahDokumen));
            }
        } else {
            System.out.println("Status : TIDAK mendapat dana penghargaan");
            System.out.println("Alasan : Bukan juara 1, 2, atau 3 (Juara Harapan/peserta)");
        }
    
   

sc.close();
    }
}
}