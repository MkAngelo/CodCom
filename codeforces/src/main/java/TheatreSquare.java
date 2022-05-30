import java.util.*;
import java.io.*;

public class TheatreSquare {
    public static void main(String[] args) {
        FScanner fs = new FScanner();
        double n = fs.nextInt(), m = fs.nextInt(), a = fs.nextInt();
        long right = (long) Math.ceil((double) n/a);
        long down = (long) Math.ceil((double) m/a);
        long ans = right * down;
        System.out.println(ans);
    }
    static class FScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while(!st.hasMoreTokens())
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n){
            int[] a = new int [n];
            for(int i=0; i<n; i++) a[i] = nextInt();
            return a;
        }
        long nextLong(){
            return Long.parseLong(next());
        }
    }
}
