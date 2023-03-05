package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousThreat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!"3:1".equals(line)) {

            String [] shredded = line.split(" ");
            String command = shredded[0];

            if ("merge".equals(command)) {

                int start = Integer.parseInt(shredded[1]);
                int end = Integer.parseInt(shredded[2]);
                String newWord = "";
                int iterations = 0;

                for (int i = Math.max(0, start); i <= Math.min(end, words.size() -1); i++) {
                    newWord  = newWord + words.get(i);
                    iterations += 1;
                }
                for (int i = 0; i < iterations; i++) {
                    words.remove(Math.max(0, start));
                }

                words.add(Math.max(0, start), newWord);

            } else {

                int index = Integer.parseInt(shredded[1]);
                int numberOfPartitions = Integer.parseInt(shredded[2]);
                String [] currentWord = words.get(index).split("");
                System.out.println(Arrays.toString(currentWord));
                System.out.println(currentWord.length);
                System.out.println(numberOfPartitions);

                List<String> temp = new ArrayList<>();

                if (currentWord.length % numberOfPartitions == 0) {
                    for (int i = 0; i < currentWord.length; i+=currentWord.length / numberOfPartitions) {
                        String interTemp = "";
                        for (int j = i; j < i + currentWord.length / numberOfPartitions; j++) {
                            interTemp = interTemp + currentWord[j];
                        }
                        temp.add(interTemp);
                    }
                } else {
                    int biggestPrevDivisor = (currentWord.length / numberOfPartitions) * numberOfPartitions;

                    for (int i = 0; i < (biggestPrevDivisor - currentWord.length / numberOfPartitions); i+=currentWord.length / numberOfPartitions) {
                        String interTemp = "";
                        for (int j = i; j < i + currentWord.length / numberOfPartitions; j++) {
                            interTemp = interTemp + currentWord[j];
                        }
                        temp.add(interTemp);
                    }
                    String finalTemp = "";
                    for (int i = biggestPrevDivisor - (currentWord.length / numberOfPartitions); i < currentWord.length; i++) {
                        finalTemp = finalTemp + currentWord[i];
                    }
                    temp.add(finalTemp);

                }
                // TODO: Finish the task

                words.remove(index);
                System.out.println(temp);

                for (int i = temp.size() - 1; i >= 0; i--) {
                    words.add(index, temp.get(i));
                }

            }

            line = scanner.nextLine();

        }
        System.out.println(words);
    }
}

//abcd efgh ijkl mnop qrst uvwx yzqwAaZ
//merge 4 10
//divide 4 5
//3:1
