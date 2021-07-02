public class Movie {

    private String title;
    private String directorName;
    private String directorSurname;
    private int lenghtInMinutes;
    private int yearOfProduction;

    public Movie(String title, String directorName, String directorSurname, int lenghtInMinutes, int yearOfProduction) {
        this.title = title;
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.lenghtInMinutes = lenghtInMinutes;
        this.yearOfProduction = yearOfProduction;
    }

}
