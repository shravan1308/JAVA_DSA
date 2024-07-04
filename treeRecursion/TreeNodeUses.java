package treeRecursion;

import java.util.Scanner;

public class TreeNodeUses {
    public static TreeNode<Integer> takeInput(Scanner sc){
        int n;
        System.out.println("Enter next node data");
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter no of children for " + n);
        int childCount = sc.nextInt();
        for(int i =0; i<childCount; i++){
            TreeNode<Integer> children = takeInput(sc);
            root.children.add(children);
        }
       return root;
    }
        public static void print(TreeNode<Integer> root){
            String s =root.data + ":";
            for(int i =0; i<root.children.size(); i++){
                s = s + root.children.get(i).data + ":";
            }
            System.out.println(s);
            for(int i =0; i<root.children.size(); i++){
                print(root.children.get(1));
            }
        }
        // public static TreeNode<Integer> takeInputLevelWise(){
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter root data");
        //     int rootData = sc.nextInt();
        //     sc.close();
            
        // }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            TreeNode<Integer> root = takeInput(sc);
           print(root);
        }
}
