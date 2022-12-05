package day1;

public class FootballTeam {
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getGoalKeeper() {
        return goalKeeper;
    }

    public void setGoalKeeper(String goalKeeper) {
        this.goalKeeper = goalKeeper;
    }

    public String getDefencesName() {
        return defencesName;
    }

    public void setDefencesName(String defencesName) {
        this.defencesName = defencesName;
    }

    public String getMidfieldersName() {
        return midfieldersName;
    }

    public void setMidfieldersName(String midfieldersName) {
        this.midfieldersName = midfieldersName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getLastFiveGames() {
        return lastFiveGames;
    }

    public void setLastFiveGames(String lastFiveGames) {
        this.lastFiveGames = lastFiveGames;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // States
    private String countryName;
    private String goalKeeper;
    private String defencesName;
    private String midfieldersName;
    private String coach;
    private String lastFiveGames;
    private String phoneNumber;

    // behaviour
   public double payPlayers(double salary){
       return 0.00;
   }
    //view contract
}
