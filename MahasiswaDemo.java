public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        
        m1.displayBiodata();

        System.out.println("--------------------------");

        // Objek 2 (soal nomor 12)
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "254107060164";
        m2.nama = "Areta Neila Putri";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2C";

        m2.displayBiodata();

        System.out.println("--------------------------");

        // Objek 3 
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "25410706016";
        m3.nama = "Alina Nadhira Putri";
        m3.alamat = "Bandung, Jawa Barat";
        m3.kelas = "2B";
        
        m3.displayBiodata();

        
    }
}
