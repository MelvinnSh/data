//Object Class
public class Karyawan{
    int id;
    String nama, unit, alamat;
    
//Constructor Parameter
public Karyawan(int id, String nama ,String unit , String alamat) {
    //variabel = parameter
    this.id = id;
    this.nama = nama;
    this.unit = unit;
    this.alamat = alamat;
    }
    
//method print
public void print() {
    System.out.println("ID : " + id);
    System.out.println("NAMA : " + nama);
    System.out.println("UNIT : " + unit);
    System.out.println("ALAMAT : " + alamat);
}
}
