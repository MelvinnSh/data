import java.util.Scanner;

public class TugasBuAul {

    public static void main(String[] args) {
        int jumlahSiswa;
        double nilai, rata, totalNilai = 0;
        Scanner a = new Scanner(System.in);
        

        System.out.println("masukan jumlah siswa: ");
        jumlahSiswa = a.nextInt();

        
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Nilai siswa"+i +":");
            nilai = a.nextDouble();
            totalNilai = totalNilai + nilai;

        }
        

            rata = totalNilai/jumlahSiswa;
            System.out.println("total nilai: "+totalNilai);
            System.out.println("rata rata siswa: "+rata);


            a.close();
            
    }
}
    

