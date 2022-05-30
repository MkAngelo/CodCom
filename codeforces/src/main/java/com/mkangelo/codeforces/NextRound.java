package com.mkangelo.codeforces;

import java.io.*;
import java.util.*;


public class NextRound {
    public static void main(String[] args){
        FScanner fs = new FScanner();
        int n = fs.nextInt(), k = fs.nextInt(); // participants and min
        FScanner fsa = new FScanner();
        int[] array = fsa.readArray(n);
        int ans = 0;
        for(int i=0; i<n; i++){
            if(array[i] > k) ans++;
        }
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
