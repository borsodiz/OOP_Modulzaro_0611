package hu.progmatic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FociVB {
    public static void main(String[] args) {


        List<Group> groups2010 = null;
        try {
            groups2010 = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader("matches_2010.csv"));
                String line;
                reader.readLine();

                while ((line = reader.readLine()) != null) {
                    Group group = new Group(line);
                    groups2010.add(group);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Meccsek száma: " + groups2010.size());

            int sumGoalsGroupA = 0;
            for (Group group : groups2010) {
                sumGoalsGroupA += group.getGoalsA();
            }

            int sumGoalsGroupB = 0;
            for (Group group : groups2010) {
                sumGoalsGroupB += group.getGoalsB();
            }
            int sumGoals2010 = sumGoalsGroupA + sumGoalsGroupB;

            int kul = 0;
            for (Group group : groups2010) {
                if ((group.getGoalsA() >= group.getGoalsB()) && (group.getGoalsA() - group.getGoalsB()) > kul ){
                    kul = (group.getGoalsA() - group.getGoalsB());
                }
            }

            int winner = 0;

            for (Group group : groups2010) {
                if (group.getGoalsA() > group.getGoalsB()) {
                    winner ++;

                }
            }

            System.out.println("2010-ben a fogadók " + winner + " alkalommal nyertek");

            System.out.println("A legnagyobb gólkülönbség 2010-ben:" + kul);

            System.out.println("Gólok száma " + sumGoals2010);

            int sumGroupA1 = 0;

            for (Group group : groups2010) {
                if (group.getStage().equalsIgnoreCase("Group A")) {
                    sumGroupA1 += group.getGoalsA();
                }
            }


            int sumGroupA2 = 0;

            for (Group group : groups2010) {
                if (group.getStage().equalsIgnoreCase("Group A")) {
                    sumGroupA2 += group.getGoalsB();
                }
            }

            System.out.println("2010-ben az A csoportban a gólok száma: " + (sumGroupA1 + sumGroupA2));


        } catch (Exception e) {
            e.printStackTrace();
        }


        List<Group> groups2014 = null;
        try {
            groups2014 = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader("matches_2014.csv"));
                String line;
                reader.readLine();

                while ((line = reader.readLine()) != null) {
                    Group group = new Group(line);
                    groups2014.add(group);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Meccsek száma: " + groups2014.size());


            int sumGoalsGroupA = 0;
            for (Group group : groups2014) {
                sumGoalsGroupA += group.getGoalsA();
            }

            int sumGoalsGroupB = 0;
            for (Group group : groups2014) {
                sumGoalsGroupB += group.getGoalsB();
            }
            int sumGoals2014 = sumGoalsGroupA + sumGoalsGroupB;

            int kul = 0;
            for (Group group : groups2014) {
                if ((group.getGoalsA() >= group.getGoalsB()) && (group.getGoalsA() - group.getGoalsB()) > kul ){
                    kul = (group.getGoalsA() - group.getGoalsB());
                }
            }

            int winner = 0;

            for (Group group : groups2014) {
                if (group.getGoalsA() > group.getGoalsB()) {
                    winner ++;

                }
            }

            System.out.println("2014-ben a fogadók " + winner + " alkalommal nyertek");

            System.out.println("A legnagyobb gólkülönbség 2014-ben:" + kul);


            System.out.println("Gólok száma " + sumGoals2014);



            int sumGroupA1 = 0;

            for (Group group : groups2014) {
                if (group.getStage().equalsIgnoreCase("Group A")) {
                    sumGroupA1 += group.getGoalsA();
                }
            }


            int sumGroupA2 = 0;

            for (Group group : groups2014) {
                if (group.getStage().equalsIgnoreCase("Group A")) {
                    sumGroupA2 += group.getGoalsB();
                }
            }

            System.out.println("2014-ben az A csoportban a gólok száma: " + (sumGroupA1 + sumGroupA2));


        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Group> groups2018 = null;
        try {
            groups2018 = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader("matches_2018.csv"));
                String line;
                reader.readLine();

                while ((line = reader.readLine()) != null) {
                    Group group = new Group(line);
                    groups2018.add(group);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Meccsek száma: " + groups2018.size());

            int sumGoalsGroupA = 0;
            for (Group group : groups2018) {
                sumGoalsGroupA += group.getGoalsA();
            }

            int sumGoalsGroupB = 0;
            for (Group group : groups2018) {
                sumGoalsGroupB += group.getGoalsB();
            }
            int sumGoals2018 = sumGoalsGroupA + sumGoalsGroupB;


            System.out.println("Gólok száma " + sumGoals2018);


            int kul = 0;
            for (Group group : groups2018) {
                if ((group.getGoalsA() >= group.getGoalsB()) && (group.getGoalsA() - group.getGoalsB()) > kul ){
                    kul = (group.getGoalsA() - group.getGoalsB());
                }
            }

            int winner = 0;

            for (Group group : groups2018) {
                if (group.getGoalsA() > group.getGoalsB()) {
                    winner ++;

                }
            }

            System.out.println("2018-ben a fogadók " + winner + " alkalommal nyertek");

            System.out.println("A legnagyobb gólkülönbség 2018-ban:" + kul);

            int sumGroupA1 = 0;

            for (Group group : groups2018) {
                if (group.getStage().equalsIgnoreCase("Group A")) {
                    sumGroupA1 += group.getGoalsA();
                }
            }


            int sumGroupA2 = 0;

            for (Group group : groups2018) {
                if (group.getStage().equalsIgnoreCase("Group A")) {
                    sumGroupA2 += group.getGoalsB();
                }
            }

            System.out.println("2018-ben az A csoportban a gólok száma: " + (sumGroupA1 + sumGroupA2));

        } catch (Exception e) {
            e.printStackTrace();
        }





        try {
            List<Wordcup> wordcups = new ArrayList<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader("worldcups.csv"));
                String line;
                reader.readLine();

                while ((line = reader.readLine()) != null) {
                    Wordcup wordcup = new Wordcup(line);
                    wordcups.add(wordcup);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Bajnokságok száma: " + wordcups.size());


        } catch (Exception e) {
            e.printStackTrace();
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a host country name: ");
        String countryName = scanner.nextLine();
        if (countryName.equalsIgnoreCase("South Africa")) {
            try (PrintWriter writer = new PrintWriter("selected.csv")) {
                writer.println("year;stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties_b");
                for (Group group : groups2010) {
                    String sor = group.getStage() + ";"
                            + group.getDate() + ";"
                            + group.getTeamA() + "; "
                            + group.getTeamB() + ";"
                            + group.getPenalitesA() + ";"
                            + group.getGetPenalitesB();
                    writer.println(sor);
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (countryName.equalsIgnoreCase("Brazil")) {
            System.out.println("Matches played in Barzil: ");
            try (PrintWriter writer = new PrintWriter("selected.csv")) {
                writer.println("year;stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties_b");
                for (Group group : groups2014) {
                    String sor = group.getStage() + ";"
                            + group.getDate() + ";"
                            + group.getTeamA() + "; "
                            + group.getTeamB() + ";"
                            + group.getPenalitesA() + ";"
                            + group.getGetPenalitesB();
                    writer.println(sor);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (countryName.equalsIgnoreCase("Russia")) {
            System.out.println("Matches played in Russia: ");

            try (PrintWriter writer = new PrintWriter("selected.csv")) {
                writer.println("year;stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties_b");
                for (Group group : groups2018) {
                    String sor = group.getStage() + ";"
                            + group.getDate() + ";"
                            + group.getTeamA() + "; "
                            + group.getTeamB() + ";"
                            + group.getPenalitesA() + ";"
                            + group.getGetPenalitesB();
                    writer.println(sor);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            System.out.println("Nothing has found in the database for this country");
        }

    }
}
