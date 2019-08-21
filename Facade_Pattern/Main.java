public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();

        Tuner tuner = new Tuner();
        CdPlayer cd = new CdPlayer();

        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();

        // projector.setInput(dvd);

        HomeTheaterFacade home = new HomeTheaterFacade(amp, tuner, dvd, cd, projector);

         home.watchMovie("One Punch man !");
         home.endMovie();

    }
}