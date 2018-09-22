import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
class Solution {
	/**
	 *Class for Stringmatch.
	 */
	private Solution() { }
	/**
	 * @param args value
	 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // if (testfiles.length == 0) {
        //     System.out.println("empty Directory");
        // } else {
        try{
        File testcase = new File(input.nextLine());
        File[] testfiles = testcase.listFiles();

            System.out.print("             ");
            for(File name : testfiles) {
                System.out.print(name.toString().split("\\\\")[1] + "    ");

            }

            ArrayList<String> fileStrings = new ArrayList<>();
            ArrayList<Stringmatch> objects = new ArrayList<>();
            for (File filename : testfiles) {
                try{
                    String content = new String(Files.readAllBytes(Paths.get(filename.getAbsolutePath())));
                    content = content.replaceAll("\n", " ")
                    .replaceAll("[^A-Za-z0-9 ]", "").replaceAll("\\s+", " ");
                    fileStrings.add(content);
                } catch (Exception e) {
                    System.out.println("file not found");
                }
            }
            int k = 0;
            int i = 1;
            for (String input1 : fileStrings) {
                System.out.println();
                System.out.print("File" + i + ".txt" + "        ");
                for (String input2 : fileStrings) {
                    objects.add(new Stringmatch(input1, input2));
                    objects.get(k).common(input1.toCharArray(),
                     input2.toCharArray(),input1.length(), input2.length());
                    System.out.print(objects.get(k).getresult() + "         ");
                    k++;
                }
                i++;
            }
        } catch(Exception e){
            System.out.println("Empty Directory");
        }
    }

}