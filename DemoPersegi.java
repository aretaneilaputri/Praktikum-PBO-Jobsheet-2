public class DemoPersegi {
    public static void main(String[]args) {
        PersegiPanjang persegi1 = new PersegiPanjang();
        persegi1.panjang = 10;
        persegi1.panjang = 5;

        persegi1.displayInfo();
        System.out.println("Luas       :" + persegi1.getLuas());
        System.out.println("Kelliling  :" + persegi1.getKeliling());

    }
}