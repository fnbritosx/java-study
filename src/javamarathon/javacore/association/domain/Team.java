package javamarathon.javacore.association.domain;

import java.util.List;
import java.util.ArrayList;

public class Team {
    private String name;
    private List<Player> playerArray = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, List<Player> players) {
        this.name = name;
        playerArray = players;
    }

    public void teamPrinter(){
        if (playerArray.isEmpty()){
            System.out.println(name);
        }else{
            System.out.println(name + " - Players: ");
            for(Player player : playerArray){
                System.out.println(player.getName() + " ");
            }
            System.out.println();
        }

    }

    public void addPlayers(List<Player> players) {
        playerArray = players;
    }

    public String getName() {
        return name;
    }

    public void addName(String name) {
        this.name = name;
    }
}
