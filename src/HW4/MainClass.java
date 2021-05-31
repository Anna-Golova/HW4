package HW4;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
          "Chemistry", "History", "Physics", "Psychology", "Mathematics",
          "Science", "Literature", "Laboratory", "Experiment", "Psychology",
          "Chemistry", "Science"
        );
        Set<String> unique = new HashSet<String>(words);
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("");

        }
    }

