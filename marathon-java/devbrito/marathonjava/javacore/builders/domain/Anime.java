package devbrito.marathonjava.javacore.builders.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String assessment;

    public Anime() {
        System.out.println();
    }

    public Anime(String name, String type, int episodes ){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }
    public Anime(String name, String type, int episodes, String assessment){
        this(name, type, episodes);
        this.assessment = assessment;
    }

    public void animePrinter(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.assessment);
    }
}
