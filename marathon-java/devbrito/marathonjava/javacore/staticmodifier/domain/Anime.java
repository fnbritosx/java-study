package devbrito.marathonjava.javacore.introduction.staticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - static initialization block is executed when the JVM loads the class
    // 1 - memory is allocated for the object (when using 'new')
    // 2 - each instance attribute is initialized with default or explicit values
    // 3 - instance initialization block is executed (if present)
    // 4 - constructor is executed

    static {
        System.out.println("static initialization block 01");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            Anime.episodes[i] = i + 1;
            System.out.print(Anime.episodes[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
    static {
        System.out.println("static initialization block 02");
        System.out.println();
    }
    static {
        System.out.println("static initialization block 03");
        System.out.println();
    }
    {
        System.out.println("instance initialization block");
    }



    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
    }


    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
