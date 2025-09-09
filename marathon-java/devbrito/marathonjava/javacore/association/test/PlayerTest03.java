package devbrito.marathonjava.javacore.association.test;

import devbrito.marathonjava.javacore.association.domain.Player;
import devbrito.marathonjava.javacore.association.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Team team01 = new Team("Barcelona");    
        Team team02 = new Team("Real Madrid");

        Player player01 = new Player("Lionel Messi");
        Player player02 = new Player("Suarez");
        Player player03 = new Player("Neymar Jr");
        Player player04 = new Player("Cristiano Ronaldo");
        Player player05 = new Player("Bale");
        Player player06 = new Player( "Benzema");

        Player[] playersA = {player01, player02, player03};
        Player[] playersB = {player04, player05, player06};

        team01.setPlayers(playersA);
        team02.setPlayers(playersB);

        for(Player player : playersA){
            player.setTeam(team01);
        }

        for(Player player : playersA){
            player.setTeam(team02);
        }

        team01.teamPrinter();
        System.out.println("-----------------");
        team02.teamPrinter();
        System.out.println("-----------------");

        for (Player player : playersA){
            player.playerPrint();
        }

        System.out.println("-----------------");

        for (Player player : playersB){
            player.playerPrint();
        }

    }
}
