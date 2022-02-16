
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node 
    {
        public int data;
        public Node left;
        public Node right;
        public Node middle;
        public int height;

        /**
         * Constructs a leaf node with a value.
         * 
         * @param data The data value for the node.
         */
        public Node(int data) 
        {
            this.data = data;
            this.left = null;
            this.right = null;
            this.middle = null;
            this.height = 0;
        }
    }
