package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList2 {
    public static void main(String[]args){
        ArrayList<Integer> angka =  new ArrayList<>();
        angka.add(23);
        angka.add(12);
        angka.add(21);
        angka.add(15);
        angka.add(42);
        
        int terbesar = angka.get(0);
        
        for (int n : angka){ 
            if(n > terbesar){
                terbesar = n;
            }
        } 
       System.out.println("Data angka : " + angka);
       System.out.println("Nilai terbesar : " + terbesar);
      
    }
}
