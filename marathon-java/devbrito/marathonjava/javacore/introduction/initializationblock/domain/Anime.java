package devbrito.marathonjava.javacore.introduction.initializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

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
