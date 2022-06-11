package hu.progmatic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wordcup  {
    private List<Group> groups = new ArrayList<>();
    private String year;
    private String host;
    private String confederation;
    private String date_from;
    private String date_to;


    public Wordcup() {
    }

    public Wordcup(String year, String host, String confederation, String date_from, String date_to) {
        this.year = year;
        this.host = host;
        this.confederation = confederation;
        this.date_from = date_from;
        this.date_to = date_to;
    }
    public Wordcup (String line) {
        String[] parts = line.split(";");
        this.year = parts[0];
        this.host= parts[1];
        this.confederation= parts[2];
        this.date_from= parts[3];
        this.date_to= parts[4];

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getConfederation() {
        return confederation;
    }

    public void setConfederation(String confederation) {
        this.confederation = confederation;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Wordcup{" +
                "groups=" + groups +
                ", year='" + year + '\'' +
                ", host='" + host + '\'' +
                ", confederation='" + confederation + '\'' +
                ", date_from='" + date_from + '\'' +
                ", date_to='" + date_to + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wordcup wordcup = (Wordcup) o;
        return year.equals(wordcup.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }

}
