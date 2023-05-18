package q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new File().processFile();

        Comparable c = (s1, s2) -> s2.length() - s1.length();
        words.sort(c::compareTo);

        System.out.println(words.get(0));
    }
}

interface Comparable {
    int compareTo(String s1, String s2);
}

class File {
    public ArrayList<String> processFile() {
        String line;
        ArrayList<String> words = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/q1/call_of_the_wild.txt"));
            while ((line = in.readLine()) != null) {
                words.addAll(List.of(line.split("\\s+")));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
}