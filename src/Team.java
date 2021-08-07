public class Team {
    String nameTeam;
    int codTeam;
    int numTeam;

    public Team(String nameTeam, int codTeam, int numTeam) {
        this.nameTeam = nameTeam;
        this.codTeam = codTeam;
        this.numTeam = numTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public int getCodTeam() {
        return codTeam;
    }

    public void setCodTeam(int codTeam) {
        this.codTeam = codTeam;
    }

    public int getNumTeam() {
        return numTeam;
    }

    public void setNumTeam(int numTeam) {
        this.numTeam = numTeam;
    }

}
