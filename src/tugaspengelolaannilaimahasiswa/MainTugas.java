package tugaspengelolaannilaimahasiswa;

public class MainTugas {
    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();
        
        kelas.tambahMahasiswa(
                new Mahasiswa("Andi", "231001", 85));
        kelas.tambahMahasiswa(
                new Mahasiswa("Budi", "231002", 55));
        kelas.tambahMahasiswa(
                new Mahasiswa("Citra", "231003", 90));
        kelas.tambahMahasiswa(
                new Mahasiswa("Dina", "231004", 70));
        kelas.tambahMahasiswa(
                new Mahasiswa("Eka", "231005", 50));

      
        kelas.tampilkanSemua();

        
        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Jaringan Komputer"
        };

        System.out.println("\n=== MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        
        System.out.println("\nRata-rata Nilai : "
                + kelas.hitungRataRata());

       
        System.out.println("Jumlah Lulus : "
                + kelas.jumlahLulus());

        
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "231006", 88));

        System.out.println("\nData setelah ditambah:");
        System.out.println("Jumlah Mahasiswa : "
                + kelas.jumlahData());
    }
}
