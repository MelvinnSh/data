//Driver Class
import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inputkan nama siswa : ");
        String nama = input.nextLine();
        System.out.println("Masukan id siswa : ");
        int id = input.nextInt();
        System.out.println("Masukan ipk siswa : ");
        double ipk = input.nextDouble();

        Siswa dilla = new Siswa(id, nama, ipk);
        dilla.print();
        System.out.println("  ");
        
        //object
        //Class object = new Constructor
        Siswa averil = new Siswa();
        Siswa ryuichi = new Siswa();
        Siswa bima = new Siswa();
        Siswa naufal = new Siswa();
        Siswa rafli = new Siswa();
        Siswa marsha = new Siswa(23, "marsha", 100.0);

        averil.id = 5;
        averil.nama = "averil";
        averil.ipk = 7.0;

        System.out.println("absenn : " + averil.id);
        System.out.println("namaa : " + averil.nama);
        System.out.println("ipk nyaa : " + averil.ipk);
        System.out.println("   ");

        ryuichi.id = 32;
        ryuichi.nama = "ryuichi";
        ryuichi.ipk = 2.30;

        System.out.println("absenn : " + ryuichi.id);
        System.out.println("namaa : " + ryuichi.nama);
        System.out.println("ipk nyaa : " + ryuichi.ipk);
        System.out.println("   ");
        bima.id = 2;
        bima.nama = "bima";
        bima.ipk = 1.20;

        System.out.println("absenn : " + bima.id);
        System.out.println("namaa : " + bima.nama);
        System.out.println("ipk nyaa : " + bima.ipk);
        System.out.println("   ");

        naufal.id = 28;
        naufal.nama = "naufal";
        naufal.ipk = 4.78;

        System.out.println("absenn : " + naufal.id);
        System.out.println("namaa : " + naufal.nama);
        System.out.println("ipk nyaa : " + naufal.ipk);
        System.out.println("   ");

        rafli.id = 5;
        rafli.nama = "rafli";
        rafli.ipk = 3.90;

        System.out.println("absenn : " + rafli.id);
        System.out.println("namaa : " + rafli.nama);
        System.out.println("ipk nyaa : " + rafli.ipk);
        System.out.println("   ");

        averil.print();
        System.out.println("   ");
        ryuichi.print();
        System.out.println("   ");
        bima.print();
        System.out.println("   ");
        naufal.print();
        System.out.println("   ");
        rafli.print();
        System.out.println("   ");
        marsha.print();
        System.out.println("   ");

        input.close();


    }


}
