public class Televisi {

    // Atribut
    public String merk;
    public int ukuranLayar;
    public int volume;
    public int channel;
    public boolean statusDaya;

    // Method
    public void nyalakan() {
        statusDaya = true;
        System.out.println(merk + " berhasil dinyalakan.");
    }

    public void matikan() {
        statusDaya = false;
        System.out.println(merk + " berhasil dimatikan.");
    }

    public void gantiChannel(int channelBaru) {
        if (statusDaya) {
            channel = channelBaru;
            System.out.println("Channel " + merk + " diubah menjadi " + channel);
        } else {
            System.out.println("Gagal: Televisi masih dalam keadaan mati.");
        }
    }

    public void tambahVolume() {
        if (statusDaya) {
            volume++;
            System.out.println("Volume " + merk + " sekarang " + volume);
        } else {
            System.out.println("Gagal: Televisi masih dalam keadaan mati.");
        }
    }

    public void displayInfo() {
        System.out.println("Merk          : " + merk);
        System.out.println("Ukuran Layar  : " + ukuranLayar + " inch");
        System.out.println("Volume        : " + volume);
        System.out.println("Channel       : " + channel);
        System.out.println("Status Daya   : " + (statusDaya ? "Menyala" : "Mati"));
    }
}