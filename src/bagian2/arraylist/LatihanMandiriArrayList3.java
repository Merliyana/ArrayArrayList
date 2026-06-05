package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList3 {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Merli");
        nama.add("Yana");
        nama.add("Agustin");
        nama.add("Zake");
        nama.add("Aya");
        nama.add("Lila");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
