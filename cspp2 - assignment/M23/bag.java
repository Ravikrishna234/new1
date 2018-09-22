import java.util.*;
import java.io.*;
public class bag {
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
    public double compare() {
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
            result = (Math.round(numerator) / denominator) * 100;
            return result;

        }

    }
    class Stringmatch {
        //String[] a;
        //String[] b;
        // int len1;
        // int len2;
        // public void match(String c) {
        //     len1 = c.length();
        //     a = c.split(" ");
        // }
        // public void match1(String d) {
        //     len2 = d.length();
        //     b = d.split(" ");
        // }
        public void compare1(String a, String b) {
             double max = 0;
             double count = 0;
             //System.out.print(a.length() + " " + b.length());
             int length = a.length() + b.length();
             //System.out.println(length);
             for(int i = 0; i < a.length(); i++) {
                for(int j = 0; j < b.length(); j++) {
                    int g = 0;
                        count = 1;
                    //System.out.print(i + g + " " + a.length() + " " + j + g + " " + b.length());
                    while((i + g)<a.length() && (j + g)<b.length()) {
                        if(b.charAt(j+g) == a.charAt(i+g)) {
                            count++;
                            //System.out.print(count);
                            if(count > max) {
                                max = count;
                            }
                        }
                            else {
                                count = 0;
                                break;
                            }
                            g++;
                    }
                }
                }
             //System.out.println(max);
        //
             //System.out.println(max);
             //System.out.println(length);
            double res = (max * 2) / length;
             double result = res * 100;
            System.out.println(result);

}
}