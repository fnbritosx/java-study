package devbrito.marathonjava.javacore.introduction.methodoverload.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String assessment;

    public void init (String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }
    public void init (String name, String type, int episodes, String assessment){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.assessment = assessment;
    }
    public void animePrinter(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.assessment);
    }
}
