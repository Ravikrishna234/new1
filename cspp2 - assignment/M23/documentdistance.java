import java.util.*;
import java.io.*;
class bag {
    static HashMap<String, Integer> map = new HashMap<>();
    static HashMap<String, Integer> map1 = new HashMap<>();
    static HashMap<String, Integer> map2 = new HashMap<>();
    bag(){}
    public void addwords(String[] a) {
        for(int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])) {
                int value = map.get(a[i]);
                map.put(a[i],value + 1);
            }
            else {
                map.put(a[i],1);
            }
        }
        // for(String key : map.keySet()) {
        //  System.out.print(key + ":" + map.get(key) + " , ");
        // }
    }
    public void addword(String[] a) {
        for(int j = 0; j < a.length; j++) {
            if(map1.containsKey(a[j])) {
                int value1 = map1.get(a[j]);
                map1.put(a[j],value1 + 1);
            }
            else {
                map1.put(a[j],1);
            }
        }
        // for(String key1 : map1.keySet()) {
        //  System.out.print(key1 + ":" + map1.get(key1) + " , ");
        // }
    }
    public void compare() {
        double numerator = 0;
        double denominator1 = 0;
        double denominator2 = 0;
        double result = 0;
        for(String key2 : map.keySet()) {
            if(map1.containsKey(key2)) {
                numerator += map.get(key2) * map1.get(key2);
            }
            }
            for(String key3 : map.keySet()) {
                denominator1 += Math.pow(map.get(key3),2);

            }
            for(String key4 : map1.keySet()) {
                denominator2 += Math.pow(map1.get(key4),2);

            }
            double denominator = (Math.sqrt(denominator1) * Math.sqrt(denominator2));
            result = (numerator / denominator) * 100;
            System.out.format("%.0f",result);
            System.out.print("       ");

        }
    }
class documentdistance {
    public static void main(String[] args) {
        String[] tokens;
        try{
            Scanner scan = new Scanner(System.in);
            String x = scan.nextLine();
            File inputfile = new File(x);
            File[] files = inputfile.listFiles();
            for(int i = 0; i < files.length; i++) {
                System.out.print(files[i].getName() + "     ");
            }
            System.out.println();
            for(int i = 0; i < files.length;i++) {
                System.out.print(files[i].getName()+ "      ");
                for(int j = 0; j < files.length; j++) {
                    bag b = new bag();
                     if(i == j) {
                        System.out.print("100" + " ");
                        continue;
                     }
                Scanner s = new Scanner(files[i]);
                String line = s.useDelimiter("\\A").next();//replaceAll("[^\\p{Alpha} ]","").toLowerCase();
                tokens = line.toLowerCase().split(" ");
                b.addwords(tokens);




                Scanner sc = new Scanner(files[j]);
                String lines = sc.useDelimiter("\\A").next();//replaceAll("[^\\p{Alpha} ]","").toLowerCase();
                String[] token = lines.toLowerCase().split(" ");
                b.addword(token);
                b.compare();
            }
            System.out.println();
        }
    }

        catch(FileNotFoundException e) {
            System.out.println("File not Found");
        }
        // b.compare();

    }
}
