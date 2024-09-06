import java.net.SocketTimeoutException;
import java.util.Scanner;

public class pembelianBarangg {
    public static void main(String[] args) {
        double total, diskon, potHar;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan total pembelian: ");
        total = input.nextDouble();
        System.out.println("");

        if(total > 100000) {
            potHar = 0;
            diskon = 0.1 * total;
            total -= diskon;
        }else {
            diskon = 0;
            potHar = 5000;
            total -= potHar;
        }

        System.out.println("diskon: " +diskon);
        System.out.println("potongan harga: " +potHar);
        System.out.println(" total yang harus dibayar: " +total);
    }
    
}
