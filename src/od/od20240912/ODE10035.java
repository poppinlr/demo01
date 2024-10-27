package od.od20240912;

import java.util.Arrays;
import java.util.Scanner;

class Tree {
    int val;
    Tree left;
    Tree right;

    public Tree(int val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Tree() {}
}

public class ODE10035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 0;
        if(arr[0] <= arr[1]) {
            left = arr[0];
            right = arr[1];
        } else {
            left = arr[1];
            right = arr[0];
        }
        Tree treeLeft = new Tree(left, null, null);
        Tree treeRight = new Tree(right, null, null);

        Tree tree = new Tree(treeLeft.val + treeRight.val, treeLeft, treeRight);
        for (int i = 2; i < N; i++) {
            int val = arr[i];
            if(val <= tree.val){
                treeLeft = new Tree(val, null, null);
                treeRight = tree;
                tree = new Tree(treeLeft.val + treeRight.val, treeLeft, treeRight);
            } else {
                treeLeft = tree;
                treeRight = new Tree(val, null, null);
                tree = new Tree(treeLeft.val + treeRight.val, treeLeft, treeRight);
            }
        }

        StringBuilder sb = new StringBuilder();
        zhongxu(tree, sb);
        System.out.println(sb.toString().trim());
    }

    public static void zhongxu(Tree tree,StringBuilder sb) {
        if(tree.left!=null){
            zhongxu(tree.left, sb);
        }
        sb.append(tree.val).append(" ");
        if(tree.right!=null){
            zhongxu(tree.right, sb);
        }

    }
}
