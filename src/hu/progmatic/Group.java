package hu.progmatic;

public class Group {

public Wordcup wordcup;
private String stage;
private String date;
private String teamA;
private String teamB;
private int goalsA;
private int goalsB;
private int penalitesA;
private int getPenalitesB;

    public Group() {
    }

    public Group (String line) {
        String [] parts = line.split(";");
        if (parts.length > 6) {
            this.stage = parts[0];
            this.date = parts[1];
            this.teamA = parts[2];
            this.teamB = parts[3];
            this.goalsA = Integer.parseInt(parts[4]);
            this.goalsB = Integer.parseInt(parts[5]);
            this.penalitesA = Integer.parseInt(parts[6]);
            this.getPenalitesB = Integer.parseInt(parts[7]);
        }else {
            this.stage = parts[0];
            this.date = parts[1];
            this.teamA = parts[2];
            this.teamB = parts[3];
            this.goalsA = Integer.parseInt(parts[4]);
            this.goalsB = Integer.parseInt(parts[5]);
            this.penalitesA = 0;
            this.getPenalitesB = 0;
        }
    }

    public Group(Wordcup wordcup, String stage, String date, String teamA, String teamB, int goalsA, int goalsB) {
        this.wordcup = wordcup;
        this.stage = stage;
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
        this.goalsA = goalsA;
        this.goalsB = goalsB;
    }

    public Group(Wordcup wordcup, String stage, String date, String teamA, String teamB, int goalsA, int goalsB, int penalitesA, int getPenalitesB) {
        this.wordcup = wordcup;
        this.stage = stage;
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
        this.goalsA = goalsA;
        this.goalsB = goalsB;
        this.penalitesA = penalitesA;
        this.getPenalitesB = getPenalitesB;
    }

    public Wordcup getWordcup() {
        return wordcup;
    }

    public void setWordcup(Wordcup wordcup) {
        this.wordcup = wordcup;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public int getGoalsA() {
        return goalsA;
    }

    public void setGoalsA(int goalsA) {
        this.goalsA = goalsA;
    }

    public int getGoalsB() {
        return goalsB;
    }

    public void setGoalsB(int goalsB) {
        this.goalsB = goalsB;
    }

    public int getPenalitesA() {
        return penalitesA;
    }

    public void setPenalitesA(int penalitesA) {
        this.penalitesA = penalitesA;
    }

    public int getGetPenalitesB() {
        return getPenalitesB;
    }

    public void setGetPenalitesB(int getPenalitesB) {
        this.getPenalitesB = getPenalitesB;
    }

    @Override
    public String toString() {
        return "Group{" +
                "wordcup=" + wordcup +
                ", stage='" + stage + '\'' +
                ", date='" + date + '\'' +
                ", teamA='" + teamA + '\'' +
                ", teamB='" + teamB + '\'' +
                ", goalsA=" + goalsA +
                ", goalsB=" + goalsB +
                ", penalitesA=" + penalitesA +
                ", getPenalitesB=" + getPenalitesB +
                '}';
    }

}
