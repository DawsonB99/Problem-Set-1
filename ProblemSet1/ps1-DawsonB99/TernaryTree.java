
/**
 * Write a description of class TernaryTree here.
 *
 * @author Dawson Bridger
 * @version Spring 2020
 */
public class TernaryTree
{

    public Node root;

    /**
     * Constructs an empty binary search tree (BST).
     */
    public TernaryTree() 
    {
        root = null;
    }

    

    /**
     * Adds the value to the tree maintianing the BST
     * property that for every tree node n, all values in n's left
     * subtree are less than or equal to n's data value and all values
     * in n's right subtree are larger.
     * 
     * @param value The value to be added to the BST.
     */ 
    public void addRoot(int value) 
    {
        root = new Node(value);
    }
    
    /**
     * Returns the number of leaves in the BST.
     * 
     * @return The number of leaves in the BST.
     */
    public int numLeaves() 
    {    
        return numLeaves(root);
    }
    
     /**
     * Returns the number of leaves in the BST whose
     * root is node n.
     * 
     * @param The root of the BST (or subtree).
     * @return The number of leaves in the BST whose
     * root is node n.
     */
    public int numLeaves(Node n) 
    {
        if(n == null)
        {
            return 0;
        }
        else if(n.left == null && n.right == null && n.middle == null)
        {
            return 1;
        }
        else
        {
            return numLeaves(n.left) + numLeaves(n.right) + numLeaves(n.middle);
        }
    }
    
    
}



