public class HomeTheaterFacade implements HomeTheater {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;

    /*
     * class HomeTheaterFacade ซึ่ง implement HomeTheater โดยที่ใน constructor จะ
     * inject object ของ device ต่างๆ (Subsystem) เข้ามา และ method watchMovie
     * จะซ้อนการใช้งาน device ต่างๆ ที่ซับซ้อน และ endMovie ก็เป็นการปิดใช้งาน
     * device ต่างๆ
     * 
     */
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;

    }

    @Override
    public void watchMovie(String movie) {
        System.out.println("Get Ready to watch a movie ...");

        projector.on();
        projector.setInput(dvd);
        projector.wideScreenMode();

        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);

        dvd.on();
        dvd.play(movie);

    }

    @Override
    public void endMovie() {
        System.out.println("Shutting movie theater down ...");

        projector.off();

        amp.off();

        dvd.stop();
        dvd.eject();
        dvd.off();

    }
}