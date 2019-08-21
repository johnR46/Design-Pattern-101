public class Amplifier {
    DvdPlayer dvd;

    public Amplifier() {
        System.out.println("Amplifier create");
    }

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off !");

    }

    public void setDvd(DvdPlayer dvd){
        this.dvd = dvd;
        System.out.println("Amplifier setting DVD player");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volume){
        System.out.println("Amplifier setting volume to " + volume);
    }

}