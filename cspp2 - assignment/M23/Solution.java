import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.io.FileReader;
import java.io.File;
/**
 * Class for plagiarism.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Empty.
    }

    /**
     * {Main method}.
     *
     * @param      args       The arguments
     *
     * @throws     Exception  {Exception class}
     */
    public static void main(final String[] args) throws Exception {
        Plagiarism pl = new Plagiarism();
        Scanner scan = new Scanner(System.in);
        try {
            File folder = new File(scan.next());
            File[] listOfFiles = folder.listFiles();
            for (File i : listOfFiles) {
                FileReader fr = new FileReader(i);
                BufferedReader br = new BufferedReader(fr);
                String buffer = "";
                String s;
                while (((s = br.readLine()) != null)) {
                    buffer += s;
                }
                Pattern p = Pattern.compile("[^a-z A-Z 0-9]");
                Matcher m = p.matcher(buffer);
                String words = m.replaceAll("").replace(".", " ").toLowerCase();
                br.close();
                fr.close();
                pl.load(words);
            }
        } catch (Exception e) {
            System.out.println("empty directory");
        }pl.bagofwords();
    }
}
