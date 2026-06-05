package bagian1.array;
    
public class LatihanMandiriArray3 {
    public static void main(String[]args){
        int[] angka = new int[6];
        angka[0] = 4;
        angka[1] = 8;
        angka[2] = 15;
        angka[3] = 16;
        angka[4] = 23;
        angka[5] = 42;  
       
        int jumlahGenap = 0;
        
        System.out.println("==Menggunakan for-each==");
        
        for(int n : angka){
            if (n % 2 == 0)
            jumlahGenap++;
        }
        System.out.println("jumlahGenap : " +jumlahGenap);
    }
}
