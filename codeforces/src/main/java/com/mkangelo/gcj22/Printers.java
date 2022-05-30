package com.mkangelo.gcj22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Printers {
    public static void main(String[] args) {
        FScanner fs=new FScanner();
        int T=fs.nextInt();
        for (int tt = 1; tt<=T; tt++) {
            int[][] grid=new int[3][];
            for(int i=0; i<3; i++) grid[i]=fs.readArray(4);
            int[] mins=grid[0];
            for(int i=0; i<4; i++){
                mins[i]=Math.min(mins[i], Math.min(grid[1][i],grid[2][i]));
            }
            int sum=1_000_000;
            for(int i=0;i<4;i++){
                mins[i]=Math.min(mins[i],sum);
                sum-=mins[i];
            }
            if(sum>0)
                System.out.println("Case #"+tt+": IMPOSSIBLE");
            else
                System.out.println("Case #"+tt+": "+mins[0]+" "+mins[1]+" "+mins[2]+" "+mins[3]);

        }
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
