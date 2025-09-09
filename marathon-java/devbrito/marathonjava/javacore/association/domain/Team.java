package devbrito.marathonjava.javacore.association.domain;

public class Team {
    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void teamPrinter(){
        if(players == null) {
            System.out.println(name);
        }
        if(players != null){
            for(Player player : players){
                System.out.printf("%s - %s%n", name, player.getName());
            }
        }
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
