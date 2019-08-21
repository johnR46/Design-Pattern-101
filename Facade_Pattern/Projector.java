public class Projector {

    DvdPlayer dvd;

    public Projector() {

        System.out.println("Project Create !");
    }

    public void on() {
        System.out.println("Projector on !");

    }

    public void off() {
        System.out.println("Projector off !");

    }

    public void setInput(DvdPlayer dvd) {
        this.dvd = dvd;

    }

    public void wideScreenMode() {
        System.out.println("Projector in Wide Screen mode 16x9 aspect ratio");
    }

}