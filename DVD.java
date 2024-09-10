package Persewaan;

import java.util.Scanner;

//subbclas
public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        number = 0;
        name = "DVD Dilan 1945";
        quantity = 0;
        price = 0.0;
        length = 0;
        rating = "NC-13";
        studio = "PIDI BAIQ";

    
    }
        public void DVDprint() {
            System.out.println("number: "+number);
            System.out.println("name: "+name);
            System.out.println("quantity: "+quantity);
            System.out.println("price: "+price);
            System.out.println("length: "+length);
            System.out.println("rating: "+rating);
            System.out.println("studio: "+studio);
        }

    }

