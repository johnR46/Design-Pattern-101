public interface HomeTheater {

    abstract void watchMovie(String movie);

    abstract void endMovie();

    /*
     * ใน interface HomeTheater จะมี Method ที่เรียกใช้งานระบบที่ซํบซ้อนด้วย method
     * watchMovie(String movie) และ endMovie()
     */

}