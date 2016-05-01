package mainemployee;
import java.util.Scanner;
public class MainEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        PegawaiTetap pt[] = new PegawaiTetap[10];
        PegawaiTidakTetap ptt[] = new PegawaiTidakTetap[5];
        int pilihan,a,tmk;
        String n,id,j;
        boolean i;
        do{
            System.out.print("Masukkan Jabatan : ");
            j = input.nextLine();
            if(j.equalsIgnoreCase("manager")){
                System.out.print("Masukkan Nama              : ");
                n = input.nextLine();
                System.out.print("Masukkan ID                : ");
                id = input.nextLine();
                System.out.print("Masukkan Tahun Masuk Kerja : ");
                tmk = in.nextInt();
                System.out.println("Apakah Anda Mempunyai Istri?");
                System.out.println("1.Ya");
                System.out.println("2.Tidak");
                System.out.print("Pilihan : ");
                pilihan = in.nextInt();
                if(pilihan ==1){
                    System.out.print("Masukkan Jumlah anak : ");
                    a = in.nextInt();
                    i = true;
                }
                else{
                    a = 0;
                    i = false;
                }
                Manager m = new Manager(n,id,j,a,i,tmk);
                m.setGaji(5000000);
                m.display();
            }
            else if(j.equalsIgnoreCase("pegawai tetap")){
                for(int x=0; x<pt.length; x++){
                    System.out.print("Masukkan Nama              : ");
                    n = input.nextLine();
                    System.out.print("Masukkan ID                : ");
                    id = input.nextLine();
                    System.out.print("Masukkan Tahun Masuk Kerja : ");
                    tmk = in.nextInt();
                    System.out.println("Apakah Anda Mempunyai Istri?");
                    System.out.println("1.Ya");
                    System.out.println("2.Tidak");
                    System.out.print("Pilihan : ");
                    pilihan = in.nextInt();
                    if(pilihan ==1){
                        System.out.print("Masukkan Jumlah anak : ");
                        a = in.nextInt();
                        i = true;
                    }
                    else{
                        a = 0;
                        i = false;
                    }
                    pt[x]= new PegawaiTetap(n,id,j,a,i,tmk);
                    pt[x].setGaji(2500000);
                    pt[x].display();
                }
            }
            else if(j.equalsIgnoreCase("pegawai tidak tetap")){
                for(int y=0; y<ptt.length; y++){
                    System.out.print("Masukkan Nama              : ");
                    n = input.nextLine();
                    System.out.print("Masukkan ID                : ");
                    id = input.nextLine();
                    System.out.print("Masukkan Tahun Masuk Kerja : ");
                    tmk = in.nextInt();
                    System.out.println("Apakah Anda Mempunyai Istri?");
                    System.out.println("1.Ya");
                    System.out.println("2.Tidak");
                    System.out.print("Pilihan : ");
                    pilihan = in.nextInt();
                    if(pilihan ==1){
                        System.out.print("Masukkan Jumlah anak : ");
                        a = in.nextInt();
                        i = true;
                    }
                    else{
                        a = 0;
                        i = false;
                    }
                    System.out.print("Masukkan Jam Lembur : ");
                    int jl = in.nextInt();
                    ptt[y] = new PegawaiTidakTetap(n,id,j,a,i,tmk);
                    ptt[y].setGaji(2500000);
                    ptt[y].display(jl);
                }
            }
            System.out.println("Apakah Anda Ingin Keluar Program?");
            System.out.println("1.Ya");
            System.out.println("2.Tidak");
            System.out.print("Pilihan :");
            pilihan = in.nextInt();
        }while(pilihan==2);
    }
}