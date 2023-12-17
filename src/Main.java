import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    private static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        Set<Integer> uniqueEvens = new TreeSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                uniqueEvens.add(num);
            }
        }

        for (Integer even : uniqueEvens) {
            System.out.println(even);
        }
    }

    private static void task3() {
        List<String> words = new ArrayList<>(List.of("apple", "orange", "banana", "apple", "grape", "banana"));

        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }

    private static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}