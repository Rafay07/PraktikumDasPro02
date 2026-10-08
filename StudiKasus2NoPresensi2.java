import java.util.Scanner;

public class StudiKasus2NoPresensi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, status;
        System.out.print("Masukkan nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA, BAKORMA, MANDIRI, PKM, atau LAINNYA) : ");
        jenisKegiatan = sc.nextLine().trim();
        System.out.println("\n=== Hasil Penilaian Kelayakan Dokumen ===");
        System.out.println("Nama Mahasiswa : " + nama);
        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma") || jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Masukkan peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            peringkatJuara = sc.nextInt();
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                System.out.print("Masukkan jumlah dokumen yang diupload (0-4) : ");
                jumlahDokumen = sc.nextInt();
                if (jumlahDokumen == 4) {
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
        } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
            System.out.print("Masukkan status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            status = sc.nextInt();
            if (status == 1) {
                System.out.print("Masukkan jumlah dokumen yang diupload (0-4) : ");
                jumlahDokumen = sc.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Selamat, dokumen anda dinyatakan memenuhi");
                    System.out.println("Status : MENDAPAT dana penghargaan");
                    System.out.println("Alasan : Tim lolos pendanaan PKM dan 4 dokumen lengkap");
                } else {
                    System.out.println("Maaf, dokumen anda dinyatakan tidak memenuhi");
                    System.out.println("Status : TIDAK mendapat dana penghargaan");
                    System.out.println("Alasan : Dokumen tidak lengkap");
                    System.out.println("Dokumen yang masih kurang : " + (4 - jumlahDokumen));
                }
            } else {
                System.out.println("Status : TIDAK mendapat dana penghargaan");
                System.out.println("Alasan : Tim tidak lolos pendanaan PKM");
            }
        } else {
            System.out.println("Status : TIDAK mendapat dana penghargaan");
            System.out.println("Alasan : Kegiatan di luar perlombaan dan PKM (Lainnya) tidak memperoleh dana");
        }
        sc.close();
    }
}