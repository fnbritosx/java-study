package devbrito.marathonjava.javacore.association.domain;

public class Player {
    private String name;
    private Team team;

    public void playerPrint(){
        if(team == null) {
            System.out.println(name);
        }
        if(team != null){
            System.out.printf("%s - %s%n", name, team.getName());
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
