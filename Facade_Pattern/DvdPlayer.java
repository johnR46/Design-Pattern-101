public class DvdPlayer {

    private String movie;

    public DvdPlayer(){
        System.out.println("DvdPlayer Create !");
    }

    public void on() {
        System.out.println("DVD Player on");
    }

    public void off() {
        System.out.println("DVD Player off");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("DVD Player play movie " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stopped " + this.movie);
    }

    public void eject() {
        System.out.println("DVD Player eject");
    }

}