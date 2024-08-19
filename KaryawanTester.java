//Object Class
public class KaryawanTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        Karyawan ibra = new Karyawan(29, "Ibra", "Tukang Parkir", "Lamongan");
        Karyawan ryuichi = new Karyawan(32, "ryuuichi", "ustad", "papua");
        Karyawan naufal = new Karyawan(23, "naufal", "penjaga kantin", "sidoarjo");
        Karyawan bima = new Karyawan(36, "ryuichi", "tukang las", "banyuwangi");
        Karyawan averil = new Karyawan(7, "averil", "satpam", "lumajang");

        ibra.print();
        System.out.println("  ");
        ryuichi.print();
        System.out.println("  ");
        naufal.print();
        System.out.println("  ");
        bima.print();
        System.out.println("  ");
        averil.print();
        System.out.println("  ");


    }
}