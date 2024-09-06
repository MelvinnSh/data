import java.util.Scanner;

public class seleksiPrakerin {
    public static void main(String[] args) {
        String nama,kelas,perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukan nama: ");
        nama = s.nextLine();
        System.out.println("Kelas: (X/XI/XII)");
        kelas = s.next();
        

        if (kelas.equalsIgnoreCase("XII")) {
            System.out.println("Perilaku siswa: (baik/cukup)");
            perilaku = s.next();
            if (perilaku.equalsIgnoreCase("baik")){
                System.out.println("Nilai siswa: ");
                nilai = s.nextInt();
                if(nilai >=85) {
                    System.out.println(nama + " Anda Dinyatakan Lulus Prakerin");
                }else {
                    System.out.println(" Maaf anda tidak lulus karena NILAI");
                }
            }else {
                System.out.println(" Maaf anda tidak lulus karena PERILAKU");
            }

        }else {
            System.out.println(" Maaf anda tidak lulus karena BUKAN KELAS XII");
        }
    }
    
}
