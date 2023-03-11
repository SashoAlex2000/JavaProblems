package objectsClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String [] shredded = scanner.nextLine().split("_");

            String type = shredded[0];
            String name = shredded[1];
            String time = shredded[2];

            Song currentSong = new Song();

            currentSong.setTypeList(type);
            currentSong.setName(name);
            currentSong.setTime(time);

            songs.add(currentSong);

        }

        String typeListDeter = scanner.nextLine();

        if ("all".equals(typeListDeter)) {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println(songs.get(i).getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeListDeter)) {
                    System.out.println(song.getName());
                }
            }
        }

    }

    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
    }

}
