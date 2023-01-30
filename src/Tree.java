import java.util.Scanner;

public class Tree {
//     this is properties of tree class;
        int val;
        Tree left;
        Tree right;

//        this is a constructor for tree class;
        Tree(int val,Tree left, Tree right){
            this.val = val;
            this.left = left;
            this.right = right;
        }


    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         Tree  tree_node = new Tree(4,null,null);
         Tree  tree_left = new Tree(6,null,null);
         Tree  tree_right = new Tree(10,null,null);
         Tree   tree_left_left = new Tree(55,null,null);
        Tree   tree_left_right = new Tree(65,null,null);
        Tree tree_right_left = new Tree(42,null,null);
        Tree tree_right_right = new Tree(42,null,null);

         tree_node.left = tree_left;
         tree_node.right = tree_right;

         tree_left.left = tree_left_left;
         tree_left.right = tree_left_right;

    }
}
