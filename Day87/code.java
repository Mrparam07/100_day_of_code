import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class RecursiveBST {
}


// A class to store a binary tree node
class Node01
{
    int data;
    Node left = null, right = null;

    Node01(int data) {
        this.data = data;
    }
}

class BSTchl
{
    // Function to check if a given node is a leaf node or not
    public static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    // Print path present in the list in reverse order (leaf to the root node)
    public static void printPath(Deque<Integer> path)
    {
        Iterator<Integer> itr = path.descendingIterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next());

            if (itr.hasNext()) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    // Recursive function to print all paths from leaf-to-root node
    public static void printLeafToRootPaths(Node node, Deque<Integer> path)
    {
        // base case
        if (node == null) {
            return;
        }

        // include the current node to the path
        path.addLast(node.data);

        // if a leaf node is found, print the path
        if (isLeaf(node)) {
            printPath(path);
        }

        // recur for the left and right subtree
        printLeafToRootPaths(node.left, path);
        printLeafToRootPaths(node.right, path);

        // backtrack: remove the current node after the left, and right subtree are done
        path.removeLast();
    }

    // The main function to print all paths from leaf-to-root node
    public static void printLeafToRootPaths(Node node)
    {
        // Deque to store leaf-to-root path
        Deque<Integer> path = new ArrayDeque<>();

        // call recursive function
        printLeafToRootPaths(node, path);
    }

    public static void main(String[] args)
    {
        /* Construct the following tree
                   1
                 /   \
                /     \
               /       \
              2         3
             / \       / \
            /   \     /   \
           4     5   6     7
                    / \
                   /   \
                  8     9
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);
        root.right.left.right = new Node(9);

        // print all leaf-to-root paths
        printLeafToRootPaths(root);
    }
}
/*
"C:\Users\PARAMVEER SINGH\.jdks\openjdk-18.0.2.1-1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\lib\idea_rt.jar=64798:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\IdeaProjects\DDelta\out\production\DDelta BSTchl
4 -> 2 -> 1
5 -> 2 -> 1
8 -> 6 -> 3 -> 1
9 -> 6 -> 3 -> 1
7 -> 3 -> 1

Process finished with exit code 0

*/


