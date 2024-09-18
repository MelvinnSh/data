import java.util.Scanner;

public class AlatTulis {
    public static void main(String[] args) {
        int pilihan, jumlah=0;
        double harga=0, total, temp=0;
        String tambahBeli;

        do{

        Scanner a = new Scanner(System.in);
        System.out.println("List alat tulis: ");
        System.out.println("1. Buku : 4000\n2. Pensil : 2500\n3. Penghapus : 1000\n4. Penggaris : 2500");
        System.out.println("Inputkan pembelian dengan angka :");
        
        pilihan = a.nextInt();

        System.out.println("jumlah beli: ");
        jumlah = a.nextInt();
        switch (pilihan) {
            case 1:
            harga=4000;
            break;

            case 2:
            harga=2500;
            break;

            case 3:
            harga=1000;
            break;

            case 4:
            harga=2500;
            break;

            default:
            break;

        }

        total=jumlah*harga;
        temp += total;

        System.out.println("apakah kamu ingin beli lagi? (Ya/Tidak)");
        tambahBeli = a.next();

    } while (tambahBeli.equalsIgnoreCase("Ya"));

    System.out.println("Total yang harus dibayar: "+temp);


    }
    
}
