package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class footballCards {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");

        System.out.println(Arrays.toString(array));
        int teamAplayers = 11;
        int teamBplayers = 11;
        boolean terminated = false;
        List<String> kickedPlayersTeamA = new ArrayList<>();
        List<String> kickedPlayersTeamB = new ArrayList<>();

        if (array.length > 0) {

            for (int i = 0; i < array.length; i++) {

                String [] currentInfo = array[i].split("-");
                String currentTeam = currentInfo[0];
                int playerNum = Integer.parseInt(currentInfo[1]);
                System.out.printf("current team: %s; current player: %d\n", currentTeam, playerNum);

                if ("A".equals(currentTeam)) {
                    if (!kickedPlayersTeamA.contains(String.valueOf(playerNum))) {
                        kickedPlayersTeamA.add(String.valueOf(playerNum));
                        teamAplayers--;
                    } else {
                        // pass
                    }
                } else if ("B".equals(currentTeam)) {
                    if (!kickedPlayersTeamB.contains(String.valueOf(playerNum))) {
                        kickedPlayersTeamB.add(String.valueOf(playerNum));
                        teamBplayers--;
                    }
                }

                if (teamAplayers < 7 || teamBplayers < 7) {
                    terminated = true;
                    break;
                }

            }

        }


        System.out.printf("Team A - %d; Team B - %d\n", teamAplayers, teamBplayers);
        if (terminated) {
            System.out.println("Game was terminated");
        }

    }

}
