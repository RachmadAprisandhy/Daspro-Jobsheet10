import java.util.Scanner;

public class BioskopWithScanner18{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama,next;

        String [][] penonton = new String [4] [2];


        while(true){
            System.out.print("menu 1= input data penonton,menu 2 = tampilkan daftar penonton , 3 exit : ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("3")){
                break;

            }else if (next.equalsIgnoreCase("2")){
                for (int i = 0; i <penonton.length; i++){
                    System.out.print("penonton pada  baris ke : " + (i + 1) + "adalah :" );
                    for (int j = 0; j < penonton[i].length; j++) {
                       if (penonton[i][j] == null){
                        System.out.print("***");
                       }else{
                        System.out.print(penonton [i][j] + " ");
                       }
                    }
                    System.out.println();
                }
            }
             else if(next.equalsIgnoreCase("1")){
                System.out.print(" masukkan Nama : ");
                nama = sc.nextLine();
                System.out.print(" masukkan Baris : ");
                baris = sc.nextInt();
                System.out.print(" masukkan kolom : ");
                kolom = sc.nextInt();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println(" Baris atau kolom tidak tersedia. Silakan coba lagi.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println(" Kursi pada baris " + baris + " dan kolom " + kolom + " sudah terisi. Silakan pilih kursi lain.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");
                }
            }
            }
            }
        }
    
