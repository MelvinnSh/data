package Persewaan;
import java.util.Scanner;

public class DVDTester {
    public static void main(String[] args) {
        String Choise = "";
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner a = new Scanner(System.in); 

        System.out.println("kamu ingin membeli CD/DVD?");
        Choise = a.nextLine();

        if (Choise.equalsIgnoreCase("CD")) {
            cd.CDprint();
        } else if (Choise.equalsIgnoreCase("DVD")) {
            dvd.DVDprint();
        }
        a.close();
    }
    
}
