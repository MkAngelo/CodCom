package com.mkangelo.gcj22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PunchedCards {
    public static void main(String[] args) {
        FScanner fs=new FScanner();
        int T = fs.nextInt();
        for (int tt = 1; tt <= T; tt++) {
            System.out.println("Case #"+tt+": ");
            int h=fs.nextInt(), w=fs.nextInt();
            char[][] grid=new char[2*h+1][2*w+1];
            for(char[] a:grid) Arrays.fill(a, '.');
            for(int y=0; y<grid[0].length; y+=2)
                for(int x=0; x<grid.length; x++)
                    grid[x][y] = x%2 ==0? '+':'|';
            for(int x=0; x<grid.length; x+=2)
                for(int y=0; y<grid[0].length; y++)
                    grid[x][y] = y%2 ==0? '+':'-';
            grid[0][0] = '.';
            grid[0][1] = '.';
            grid[1][0] = '.';
            for(char[] c:grid) System.out.println(c);
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
