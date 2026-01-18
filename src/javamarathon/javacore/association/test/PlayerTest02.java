package javamarathon.javacore.association.test;

import javamarathon.javacore.association.domain.Player;
import javamarathon.javacore.association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player01 = new Player("Faker");
        Player player02 = new Player("Gumayusi");
        Player player03 = new Player("Keria");
        Team team = new Team("SKT T1");

        Player[] players = new Player[]{player01, player02, player03};

        for(Player player : players){
            player.addTeam(team);
            player.playerPrinter();
        }
    }
}
