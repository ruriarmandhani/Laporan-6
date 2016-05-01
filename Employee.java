package mainemployee;
public class Employee {
    private String nama,idKerja,jabatan;
    private double gaji;
    private int anak, tmKerja;
    private boolean istri;
    public Employee(String n, String id, String j, int a, boolean i, int tm){
        nama = n;
        idKerja = id;
        jabatan = j;
        anak = a;
        istri = i;
        tmKerja = tm;
    }
    public void setGaji(double g){
        gaji = g;
    }
    public double getGaji(){
        return gaji;
    }
    public String getNama(){
        return nama;
    }
    public String getIdKerja(){
        return idKerja;
    }
    public String getJabatan(){
        return jabatan;
    }
    public int getTahunMasukKerja(){
        return tmKerja;
    }
    public int getLamaKerja(){
        return 2016-tmKerja;
    }
    public double getBonus(){
        if(getLamaKerja()>=6 && getLamaKerja()<=10){
            return 0.05*getLamaKerja()*gaji;
        }
        else if(getLamaKerja()>10){
            return 0.1*getLamaKerja()*gaji;
        }
        else{
            return 0;
        }
    }
    public double getTunjanganKerja(){
        if(getLamaKerja()>10){
            return 0.1*getLamaKerja()*gaji;
        }
        else{
            return 0;
        }
    }
    
    public double getTunjanganIstri(){
        if(istri == true){
            return (long) (0.1*(gaji+getBonus()+getTunjanganKerja()));
        }
        else{
            return 0;
        }
    }
    public double getTunjanganAnak(){
        if(anak<=3){
            return (long) (0.15*(gaji+getBonus()+getTunjanganKerja()));
        }
        else{
            return 0;
        }
    }
}