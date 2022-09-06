package DSA.PEPCODING.GenericTree;

import java.io.*;
import java.util.*;

public class maxSubtreeSum {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }

    static Node max = null;
    static int msum = Integer.MIN_VALUE;

    public static int maxSubtree(Node node) {

        int plus = node.data;
        for (Node child : node.children) {
            int ans = maxSubtree(child);
            plus += ans;
        }
        if (plus > msum) {
            msum = plus;
            max = node;

        }

        return plus;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        // write your code here
        max.data = Integer.MIN_VALUE;
        maxSubtree(root);

        System.out.println(max.data + "@" + msum);

    }

}