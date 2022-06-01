package com.mkangelo.gcj22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.lang.Comparable;
import java.util.PriorityQueue;

public class Chain {
    public static void main(String[] args) {
        FScanner fs=new FScanner();
        int T=fs.nextInt();
        for (int tt = 1; tt<=T; tt++) {
            int n = fs.nextInt();
            Node[] nodes=new Node[n];
            nodes[0] = new Node(0);
            for (int i = 1; i < n; i++) nodes[i]=new Node(fs.nextInt());
            for (int i = 1; i < n; i++) nodes[fs.nextInt()].children.add(nodes[i]);

            PriorityQueue<Integer> res=nodes[0].dfs();
            long ans=0;
            while(!res.isEmpty()) ans+=res.remove();

            System.out.println("Case #"+tt+": ");
        }
    }
    static class Node implements Comparable<Node> {
        int value;
        ArrayList<Node> children=new ArrayList<>();

        public Node(int value){
            this.value=value;
        }

        public PriorityQueue<Integer> dfs(){
            if(children.isEmpty()) return value;
        }
        public int compareTo(Node o){
            return Integer.compare(o.children.size(), children.size());
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
