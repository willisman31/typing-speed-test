package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Wordlist {
    
    private String[] words;

    public Wordlist() {
        this.words = getWordlistFromFile();
    }

    public Wordlist(String[] words) {
        this.words = words;
    }

    public String[] getWords() {
        return this.words;
    }

    private String[] getWordlistFromFile() {
        String[] wordlist;
        try {
            ArrayList<String> rawWordlist = new ArrayList<String>();
            File wordlistFile = new File("./wordlist.txt");
            Scanner readWordlist = new Scanner(wordlistFile);
            while (readWordlist.hasNextLine()) {
                rawWordlist.add(readWordlist.nextLine());
            }
            wordlist = toArray(rawWordlist);
            readWordlist.close();
        } catch (FileNotFoundException f) {
            System.out.println("Error retrieving wordlist");
            wordlist = null;
        }
        return wordlist;
    }

    private String[] toArray(ArrayList<String> arrayList) {
        String[] array = new String[arrayList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
