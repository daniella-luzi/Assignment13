import java.io.*;
import java.util.*;

public class assignment13 {

    public static void main(String[] args) throws IOException {
        //Input the correct file path for your computer
        File filename = new File("C:\\Users\\pinkd\\OneDrive\\Desktop\\Assignment13\\src\\input.txt");
        Scanner scanner = new Scanner(filename);
        Map<String, Integer>  counts = new HashMap<String, Integer>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                word = word.toLowerCase();
                if (!counts.containsKey(word)) {
                    counts.put(word, 1);
                } else {
                    counts.put(word, counts.get(word) + 1);
                }
                writeToFile("output.txt", counts);
    
            }
            
            System.out.println(counts);
            scanner.close();
            }

    public static void writeToFile(String filename, Map<String, Integer> counts) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            writer.write(entry.getKey() + " " + entry.getValue());
            writer.newLine();
        }
        writer.close();
    }
}

