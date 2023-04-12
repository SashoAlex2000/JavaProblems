package objectsClasses;

import java.util.*;

public class teamWordkProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Team> teams= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] shredded = scanner.nextLine().split("-");
            boolean teamIsCreated = false;

            for (Team team : teams) {
                if (shredded[1].equals(team.getName())) {
                    System.out.printf("Team %s was already created!\n", team.getName());
                    teamIsCreated = true;
                    break;
                }
            }

            if (teamIsCreated) {
                continue;
            }

            boolean playerExists = false;

            for (Team team : teams) {
                List<String> currentMembers = team.getMembers();
                for (String existingPlayer : currentMembers) {
                    if (existingPlayer.equals(shredded[0])) {
                        System.out.printf("%s cannot create another team!\n", existingPlayer);
                        playerExists = true;
                        break;
                    }
                }
            }

            if (playerExists) {
                break;
            }
            List<String> members= new ArrayList<>();
            members.add(shredded[0]);
            Team currentTeam = new Team(shredded[1], members);
            teams.add(currentTeam);
            System.out.printf("Team %s has been created by %s!\n", shredded[1], shredded[0]);
        }

        String line = scanner.nextLine();

        while (!"end of assignment".equals(line)) {

            String [] bits = line.split("->");
            String playerName = bits[0];
            String teamName = bits[1];

            boolean teamExists = false;
            boolean playerIsMemberOfOther = false;
            int magicIndex = -1;

            for (Team team : teams) {
                if (teamName.equals(team.getName())) {
                    teamExists = true;
                    magicIndex = teams.indexOf(team);
                }
                List <String> currentListMembers = team.getMembers();
                for (String member : currentListMembers) {
                    if (Objects.equals(member, playerName)) {
                        playerIsMemberOfOther = true;
                        break;
                    }
                }
            }

            if (!teamExists) {
                System.out.printf("Team %s does not exist!\n", teamName);
            }else if (playerIsMemberOfOther) {
                System.out.printf("Member %s cannot join team %s\n", playerName, teamName);
            } else {
                List <String> members = teams.get(magicIndex).getMembers();
                members.add(playerName);
                teams.get(magicIndex).setMembers(members);
            }

            line = scanner.nextLine();

        }

        List<Team> disbanded = new ArrayList<>();
        List<Team> validTeams = new ArrayList<>();


        for (Team team : teams) {
            if (team.getSize() == 1) {
                disbanded.add(team);
            } else {
                validTeams.add(team);
            }
        }

        disbanded.sort(Comparator.comparing(Team::getSize).reversed().thenComparing(Team::getName));
        validTeams.sort(Comparator.comparing(Team::getSize).reversed().thenComparing(Team::getName));

        for (Team team : validTeams) {
            System.out.printf("%s\n", team.getName());
            System.out.printf("- %s\n", team.getMembers().get(0));
            for (int i = 1; i < team.getSize(); i++) {
                System.out.printf("-- %s\n", team.getMembers().get(i));
            }
        }

        System.out.print("Teams to disband:\n");

        for (Team team : disbanded) {
            System.out.printf("%s\n", team.getName());
        }


    }

    public static class Team {

        String name;
        List<String> members;

        public int getSize() {
            return this.members.size();
        }

        public Team(String name, List<String> members) {
            this.name = name;
            this.members = members;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getMembers() {
            return members;
        }

        public void setMembers(List<String> members) {
            this.members = members;
        }
    }

}
