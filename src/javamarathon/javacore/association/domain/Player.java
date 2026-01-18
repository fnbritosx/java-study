package javamarathon.javacore.association.domain;

import java.util.List;
import java.util.ArrayList;

public class Player {
    private String name;
    private List<Team> teamArray = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void playerPrinter(){
        if(teamArray.isEmpty()){
            System.out.println(name);
        } else{
            System.out.println(name + " - Teams: " );
            for(Team team:teamArray){
                System.out.println(team.getName() + " ");
            }
            System.out.println();
        }
    }

    public List<Team> getTeamArray() {
        return teamArray;
    }

    public void addTeam(Team team) {
        this.teamArray.add(team);
    }

    public String getName() {
        return name;
    }
}
