package Persewaan; //nama folder tempat penyimpanan
//subclass
public class CD extends Product{

    private String artist;
    private int totalSong;
    private String label;

    public CD() {
        number = 0;
        name = "All to well";
        quantity = 0;
        price = 0.0;
        artist = "aveline";
        totalSong = 0;
        label = "pop";


        }
        public void CDprint() {
            System.out.println("number: "+number);
            System.out.println("name: "+name);
            System.out.println("quantity: "+quantity);
            System.out.println("price: "+price);
            System.out.println("price: "+price);
            System.out.println("total song: "+totalSong);
            System.out.println("label: "+label);
    }
    
}
