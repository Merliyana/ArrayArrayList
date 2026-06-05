package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList1 {
    public static void main(String[]args){
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("minyak goreng");
        daftarBelanja.add("Sabun mandi");
        daftarBelanja.add("indomie");
        daftarBelanja.add("gula putih");
        System.out.println("Awal :" + daftarBelanja);
        
        daftarBelanja.remove(1);
        
        System.out.println("daftarBelanja:" + daftarBelanja);
        System.out.println("jumlah :" + daftarBelanja.size());
        
        
    }
    
    
}
