package devbrito.marathonjava.javacore.association.domain;

public class Seminar {
    private String title;
    private StudentSeminar[] studentSeminar;
    private LocationSeminar locationSeminar;

    public Seminar(String title, LocationSeminar locationSeminar) {
        this.title = title;
        this.locationSeminar = locationSeminar;
    }

    public Seminar(String title, StudentSeminar[] studentSeminar, LocationSeminar locationSeminar) {
        this(title, locationSeminar);
        this.studentSeminar = studentSeminar;
    }
}
