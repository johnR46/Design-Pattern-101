public class Main {
    public static void main(String[] args) {

        Projector projector = new Projector();   
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Tuner tuner = new Tuner();
        CdPlayer cd = new CdPlayer();

        HomeTheaterFacade  home = new HomeTheaterFacade(amp, tuner, dvd, cd, projector);

        home.watchMovie("One Punch man !");
        home.endMovie();





    }
}