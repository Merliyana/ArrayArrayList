package bagian1.array;

public class LatihanMandiriArray1{
    public static void main(String[]args) {
        
        double[] suhu = {30.5, 28.7, 32.1, 29.8, 31.4, 27.9};
      
        double tertinggi = suhu[0];
        double terendah = suhu[0];
        
        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }
            
            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }
        
        System.out.println("Data Suhu Harian:");
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + " : " + suhu[i] + "°C");
        }
        
        System.out.println("\nSuhu Tertinggi = " + tertinggi + "°C");
        System.out.println("Suhu Terendah = " + terendah + "°C");
    }
}