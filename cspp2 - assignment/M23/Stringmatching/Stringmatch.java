import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
class Stringmatch {
    private String file1;
    private String file2;
    private int lcs = 1;
    private Double result;
    private Double res;
    Stringmatch(String input1, String input2) {
        file1 = input1;
        file2 = input2;
    }
    public void common(char X[], char Y[], int m, int n) {
        Double longest[][] = new Double[m + 1][n + 1];
        result = 0.0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    longest[i][j] = 0.0;
                } else if (X[i - 1] == Y[j - 1]) {
                    longest[i][j] = longest[i - 1][j - 1] + 1;
                    result = Double.max(result, longest[i][j]);
                } else
                    longest[i][j] = 0.0;
            }
        }
        res = (double)Math.round((((result * 2) / (m + n)) * 100d));
    }
    public Double getresult() {
        return res;
    }
}