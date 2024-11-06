import java.util.Scanner;

public class SiAkad18{
    public static void main(String [] args ) {
        Scanner sc = new Scanner (System.in);
        int mahsiswa,matkul;
        System.out.print("MASUKKAN JUMLAH MAHASISWA ");
        mahsiswa = sc.nextInt();
        System.out.print("MASUKKAN JUMLAH MATKUL");
        matkul = sc.nextInt();

        int [][] nilaitotal = new int [mahsiswa][matkul];
        for(int i=0; i < nilaitotal.length ;i++){
            System.out.println("input nilai mahasiswa ke - " + (i+1));
            double totalPersiswa = 0;

            for (int j=0; j < nilaitotal[i].length;j++){
                System.out.print("input nilai mata mata kuliah - " + (j+1) + ": ");
                nilaitotal [i][j] = sc.nextInt();
                totalPersiswa += nilaitotal[i][j];
            }
            System.out.println("nilai rata rata :" + totalPersiswa/matkul);
            
        }
        System.out.println("\n================================");
            System.out.println("rata rata tiap mata kuliah : ");

            for (int j = 0; j < matkul; j++) {
                double totalPerMatkul = 0;
                for (int i = 0; i < mahsiswa; i++) {
                    totalPerMatkul += nilaitotal[i][j];
                }
                System.out.println("Mata kuliah " + (j + 1) + ": " + (totalPerMatkul / mahsiswa));
            }
    }
}
   