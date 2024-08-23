//Driver Class
import java.util.Scanner;

public class KaryawanTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor

        Scanner input = new Scanner(System.in);
        System.out.println("inputkan nama siswa : ");
        String nama = input.nextLine();
        System.out.println("Masukan id siswa : ");
        int id = input.nextInt();
        System.out.println("Masukan ipk siswa : ");
        double ipk = input.nextDouble();

        
        Karyawan ibra = new Karyawan(29, "Ibra", "Tukang Parkir", "Lamongan");
        Karyawan ryuichi = new Karyawan(32, "ryuuichi", "ustad", "papua");
        Karyawan naufal = new Karyawan(23, "naufal", "penjaga kantin", "sidoarjo");
        Karyawan bima = new Karyawan(36, "ryuichi", "tukang las", "banyuwangi");
        Karyawan averil = new Karyawan(7, "averil", "satpam", "lumajang");


        Siswa melvin = new Siswa(id, nama, ipk);
        melvin.print();
        System.out.println("  ");

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

        input.close();


    }
}