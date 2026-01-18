package javamarathon.javacore.association.test;

import javamarathon.javacore.association.domain.Player;
import javamarathon.javacore.association.domain.Team;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest03 {
    public static void main(String[] args) {
        Team team01 = new Team("Barcelona");    
        Team team02 = new Team("Real Madrid");
        Team team03 = new Team("Santos");

        Player player01 = new Player("Lionel Messi");
        Player player02 = new Player("Suarez");
        Player player03 = new Player("Neymar Jr");
        Player player04 = new Player("Cristiano Ronaldo");
        Player player05 = new Player("Bale");
        Player player06 = new Player( "Benzema");

        List<Player> playersTeam01 = new ArrayList<>();
        playersTeam01.add(player01);
        playersTeam01.add(player02);
        playersTeam01.add(player03);

        List<Player> playersTeam02 = new ArrayList<>();
        playersTeam02.add(player04);
        playersTeam02.add(player05);
        playersTeam02.add(player06);

        List<Player> playersTeam03 = new ArrayList<>();
        playersTeam03.add(player03);

        team01.addPlayers(playersTeam01);
        team02.addPlayers(playersTeam02);
        team03.addPlayers(playersTeam03);

        for (Player player : playersTeam01) {
            player.addTeam(team01);
        }
        for (Player player : playersTeam02) {
            player.addTeam(team02);
        }
        for (Player player : playersTeam03) {
            player.addTeam(team03);
        }
        team01.teamPrinter();
        player03.playerPrinter();
    }
}
