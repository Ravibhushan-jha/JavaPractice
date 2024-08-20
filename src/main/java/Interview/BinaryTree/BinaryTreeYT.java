package Interview.BinaryTree;

import java.net.ServerSocket;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){

            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{

        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }



    public static void preorder(Node root){
        // root --> left subtree ---> right subtree
        if(root == null){
            //System.out.print("-1 ");
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root){

        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root){

        if(root == null){
            return;
        }

        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){

        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            Node currentNode = q.remove();
            if(currentNode == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(currentNode.data + " ");
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }

        }

    }

    public static int countOfNodes(Node root){
        if(root == null){

            return 0;
        }

        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);

        return leftNode + rightNode + 1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){

            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int heightOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfNodes(root.left);
        int rightHeight = heightOfNodes(root.right);

        int myHeight = Math.max(leftHeight,rightHeight) + 1;
        return myHeight;
    }


    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);


       // preorder(root);
      //  inorder(root);
       // postorder(root);
       // levelOrder(root);
      // System.out.println(countOfNodes(root));

       // System.out.println(" Sum of total Nodes : "+sumOfNodes(root));
        System.out.println(" Height of total Nodes : "+heightOfNodes(root));

    }
}
