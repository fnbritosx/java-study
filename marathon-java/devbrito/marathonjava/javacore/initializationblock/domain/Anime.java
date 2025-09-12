package devbrito.marathonjava.javacore.initializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;
    // 1 - Static blocks are executed once (when the class is loaded for the first time)
    // 2 - Memory is allocated for the object
    // 3 - Instance attributes are initialized (default values → explicit values)
    // 4 - Instance initialization blocks (non-static) are executed
    // 5 - Constructor is executed

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
