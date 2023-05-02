import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();

        // Add words from file to ArrayList
        String line;
        BufferedReader in = new BufferedReader(new FileReader("src/call_of_the_wild.txt"));
        try {
            while ((line = in.readLine()) != null) {
                words.addAll(List.of(line.split("\\s+")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort words in ArrayList by length
        int index;
        for (int i = 0; i < words.size(); i++){
            index = i;
            for (int j = i ; j <= words.size() - 1; j++){
                if (words.get(j).length() > words.get(index).length()){
                    index = j;
                }
            }
            String temp = words.get(i);
            words.set(i, words.get(index));
            words.set(index, temp);
        }

        // Print the first longest word in the list
        System.out.println("The first longest word: " + words.get(0));
    }
}


