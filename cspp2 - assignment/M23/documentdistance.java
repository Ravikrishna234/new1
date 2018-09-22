import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
/**DOCUMENTDISTANCE.**/
final class Documentdistance {
   /**
    * @brief [brief description]
    * @details [long description]
    */
    private Documentdistance() { }
        /**
         * @param args value
         */
    public static void main(final String[] args) {
         int max = 0;
         int a1 = 0;
         int a2 = 0;
        String[] tokens;
        Scanner scan = new Scanner(System.in);
         //Stringmatch sm = new Stringmatch();
        //   String x1 = scan.nextLine();
        //   String x2 = scan.nextLine();
        // //  //sm.match(x1);
        // //  //sm.match1(x2);
        //   sm.compare1(x1,x2);
        try {
            String x = scan.nextLine();
            File inputfile = new File(x);
            File[] files = inputfile.listFiles();
            System.out.print("\t\t");
            for (int i = 0; i < files.length; i++) {
                System.out.print(files[i].getName() + "\t");
            }
            System.out.println();
            for (int i = 0; i < files.length; i++) {
                System.out.print(files[i].getName() + "\t");
                for (int j = 0; j < files.length; j++) {
                    bag b = new bag();
                      //  if(i == j) {
                      //  System.out.print("100" + "\t\t");
                      //    continue;
                      // }
                     try {
                Scanner s = new Scanner(files[i]);
                String line = s.useDelimiter("\\A").next();
                //replaceAll("[^\\p{Alpha} ]","").toLowerCase();
                tokens = line.replaceAll("[^A-Za-z0-9_ ]","").
                toLowerCase().split(" ");
                b.addwords(tokens);
            } catch (Exception e) {
                System.out.print("0");
                break;
            }



                try {
                Scanner sc = new Scanner(files[j]);
                String lines = sc.useDelimiter("\\A").next();
                //replaceAll("[^\\p{Alpha} ]","").toLowerCase();
                String[] token = lines.replaceAll("[^A-Za-z0-9_ ]","").
                toLowerCase().split(" ");
                b.addword(token);
            } catch (Exception e) {
            System.out.print("0");
            break;
        }

        double result = b.compare();
        System.out.format("%.0f", result);
        System.out.print("\t\t");
        if (result > max && i != j) {
            a1 = j + 1;
            a2 = i + 1;
            result = max;
        }
    }
    System.out.println();
        }
        System.out.println("Maximum similarity is between File" + a1
            + ".txt and File" + a2 + ".txt");
    }catch(Exception e) {
    	System.out.println("empty directory");
    }
}

}

