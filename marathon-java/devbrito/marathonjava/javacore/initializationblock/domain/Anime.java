package devbrito.marathonjava.javacore.initializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;
    // 1 - allocated memory space for the object
    // 2 - each class attribute is created and initialized with default values default or whatever is passed
    // 3 - initialization block is executed
    // 4 - constructor is executed
    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            this.episodes[i] = i + 1;
            System.out.print(this.episodes[i] + " ");
        }
        System.out.println();
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
