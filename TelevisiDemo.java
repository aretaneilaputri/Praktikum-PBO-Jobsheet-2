public class TelevisiDemo {

    public static void main(String[] args) {

        // Instansiasi objek 1
        Televisi tv1 = new Televisi();
        tv1.merk = "Samsung";
        tv1.ukuranLayar = 32;
        tv1.volume = 10;
        tv1.channel = 1;

        // Instansiasi objek 2
        Televisi tv2 = new Televisi();
        tv2.merk = "LG";
        tv2.ukuranLayar = 43;
        tv2.volume = 15;
        tv2.channel = 5;

        // Menampilkan data awal
        System.out.println("=== DATA AWAL TELEVISI 1 ===");
        tv1.displayInfo();

        System.out.println("\n=== DATA AWAL TELEVISI 2 ===");
        tv2.displayInfo();

        // Eksekusi dan update atribut objek 1
        System.out.println("\n=== EKSEKUSI TELEVISI 1 ===");
        tv1.nyalakan();
        tv1.gantiChannel(3);
        tv1.tambahVolume();

        // Eksekusi dan update atribut objek 2
        System.out.println("\n=== EKSEKUSI TELEVISI 2 ===");
        tv2.nyalakan();
        tv2.gantiChannel(7);
        tv2.tambahVolume();

        // Menampilkan hasil akhir
        System.out.println("\n=== HASIL AKHIR TELEVISI 1 ===");
        tv1.displayInfo();

        System.out.println("\n=== HASIL AKHIR TELEVISI 2 ===");
        tv2.displayInfo();
    }
}