import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap 
        DosenTetap dosenTetap = new DosenTetap("197007051997021001", "76534123", "Priyo Sidik Sasongko S.Si., M.Kom.",
            LocalDate.of(1955, 5, 14),
            LocalDate.of(2001, 2, 21), 5500000, "Fakultas Sains & Matematika");
        
        System.out.println("=== Informasi Dosen Tetap ===");
        dosenTetap.printInfo();
        System.out.println();

        // Membuat objek DosenTamu 
        DosenTamu dosenTamu = new DosenTamu("196201181987031002", "24654835", "Prof. Dr. F.X. Adji Samekto S.H., M.Hum.",
            LocalDate.of(1969, 3, 17),
            LocalDate.of(2010, 3, 19), 2900000, "Fakultas Teknik", 24);
        
        System.out.println("=== Informasi Dosen Tamu ===");
        dosenTamu.printInfo();
        System.out.println();

        // Membuat objek Tendik 
        Tendik tendik = new Tendik("19920810202408142345", "Bambang Eko", 
            LocalDate.of(1967, 4, 12), 
            LocalDate.of(2013, 5, 28), 1760000, "Pengolah Data Tenaga Kependidikan"); 
       
        System.out.println("=== Informasi Tendik ===");
        tendik.printInfo();
        System.out.println();
    }
}