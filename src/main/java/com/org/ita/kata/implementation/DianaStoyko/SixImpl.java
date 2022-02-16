package com.org.ita.kata.implementation.DianaStoyko;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        int i = 1;
        long count = 0;

        while (m > 0) {
            double pow = Math.pow(i, 3);
            m = m - (long) pow;
            count = count + 1;
            i++;
        }

        if (m != 0) {
            return -1;
        }
        return count;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(x + 1));
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.isEmpty()) return "";
        int wins = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        boolean teamExist = false;
        boolean changeParsedArea = false;
        boolean changeParsedScore = true;
        String teams = "Los Angeles Clippers,Dallas Mavericks,New York Knicks,NYK,Atlanta Hawks,Indiana Pacers,Memphis Grizzlies,"
                + "Los Angeles Lakers,Minnesota Timberwolves,Phoenix Suns,Portland Trail Blazers,New Orleans Pelicans,"
                + "Sacramento Kings,Los Angeles Clippers,Houston Rockets,Denver Nuggets,Cleveland Cavaliers,Milwaukee Bucks,"
                + "Oklahoma City Thunder,San Antonio Spurs,Boston Celtics,Philadelphia 76ers,Brooklyn Nets,Chicago Bulls,"
                + "Detroit Pistons,Utah Jazz,Miami Heat,Charlotte Hornets,Toronto Raptors,Orlando Magic,Washington Wizards,"
                + "Golden State Warriors,Dallas Maver,";
        String[] teamNames = teams.split(",");
        for (String team : teamNames) {
            if (team.equals(toFind)) {
                teamExist = !teamExist;
                break;
            }
        }

        if (!teamExist) return toFind + ":This team didn't play!";

        String[] allGames = resultSheet.split(",");

        for (String currentGame : allGames) {
            int start = 0;
            int end = 0;
            int one = 1;
            int index = currentGame.indexOf(toFind);
            String[] parse = currentGame.split(" ");

            if (index > -1 && index < currentGame.length() / 2 - toFind.length() + 3) {
                start = 0;
                end = parse.length;
                changeParsedArea = !changeParsedArea;
            } else if (index > -1 && index > currentGame.length() / 2 - toFind.length() + 3) {
                start = parse.length - 1;
                end = 0;
                changeParsedArea = !changeParsedArea;
                one = -1;
            }

            int[] twoTeamsScores = new int[2];

            if (changeParsedArea) {
                changeParsedArea = !changeParsedArea;
                for (int i = start; i != end; i += one) {
                    if (parse[i].matches("([0-9]*)\\.([0-9]*)")) {
                        return "Error(float number):" + currentGame;
                    }
                    if (parse[i].matches("^[0-9]*[1-9][0-9]*$") && changeParsedScore) {
                        changeParsedScore = !changeParsedScore;
                        int score = Integer.parseInt(parse[i]);
                        scored += score;
                        conceded += score;
                        twoTeamsScores[0] = score;
                        continue;
                    }
                    if (parse[i].matches("^[0-9]*[1-9][0-9]*$") && !changeParsedScore) {
                        changeParsedScore = !changeParsedScore;
                        int score = Integer.parseInt(parse[i]);
                        conceded += score - twoTeamsScores[0];
                        twoTeamsScores[1] = score;
                    }
                }
                if (twoTeamsScores[0] > twoTeamsScores[1]) {
                    wins++;
                    points += 3;
                } else if (twoTeamsScores[0] < twoTeamsScores[1]) {
                    loses++;
                } else {
                    draws++;
                    points++;
                }
            }
        }
        if (scored == 0) return toFind + ":This team didn't play!";
        return toFind + ":W=" + wins + ";D=" + draws + ";L=" + loses + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}