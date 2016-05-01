package mainemployee;
public class Manager extends Employee{
    public Manager(String n, String id, String j, int a, boolean i, int tm) {
        super(n, id, j, a, i, tm);
    }
    public double getTunjanganJabatan(){
        return (long) (0.1*(super.getGaji()+super.getBonus()+super.getTunjanganKerja()));
    }
    public void display(){
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
        System.out.println("Tunjangan Jabatan : Rp "+getTunjanganJabatan());
        System.out.println("----------------------------------------------");
    }
}