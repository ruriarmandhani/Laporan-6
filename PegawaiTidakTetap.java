package mainemployee;
public class PegawaiTidakTetap extends Employee{
   
    public PegawaiTidakTetap(String n, String id, String j, int a, boolean i, int tm) {
        super(n, id, j, a, i, tm);
    }
    public double getUpahLembur(int jam){
        if(jam>10){
            return (jam-10)*10000;
        }
        else{
            return 0;
        }
    }
    public void display(int jam){
        System.out.println("----------------------------------------------");
        System.out.println("Nama              : "+super.getNama());
        System.out.println("ID                : "+super.getIdKerja());
        System.out.println("Jabatan           : "+super.getJabatan());
        System.out.println("Tahun Masuk Kerja : "+super.getTahunMasukKerja());
        System.out.println("Gaji Pokok        : Rp "+super.getGaji());
        System.out.println("Bonus             : Rp "+super.getBonus());
        System.out.println("Tunjangan Kerja   : Rp "+super.getTunjanganKerja());
        System.out.println("Tunjangan Istri   : Rp "+super.getTunjanganIstri());
        System.out.println("Tunjangan Anak    : Rp "+super.getTunjanganAnak());
        System.out.println("Upah Lembur       : Rp "+getUpahLembur(jam));
        System.out.println("----------------------------------------------");
    }
}