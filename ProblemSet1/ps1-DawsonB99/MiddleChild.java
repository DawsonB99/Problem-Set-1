import java.util.Scanner;
/**
 * Write a description of class MiddleChild here.
 *
 * @author Dawson Bridger
 * @version Spring 2020
 */
public class MiddleChild
{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        TernaryTree tree = new TernaryTree();
        String text = input.nextLine();
        tree.addRoot(Integer.parseInt(text));
        Node finger = tree.root;
        int count = 1;

        while(!text.equalsIgnoreCase("DONE"))
        {
            text = input.nextLine();
            Scanner reader = new Scanner(text);
            while(reader.hasNext() && !reader.hasNextInt())
            {
                String helper = reader.next();
                if(helper.equalsIgnoreCase("L"))
                {
                    if(finger.left == null)
                    {
                        finger.left = new Node(reader.nextInt());
                        count++;
                    }
                    finger = finger.left;
                }
                else if(helper.equalsIgnoreCase("M"))
                {
                    if(finger.middle == null)
                    {
                        finger.middle = new Node(reader.nextInt());
                        count++;
                    }
                    finger = finger.middle;
                }
                else if(helper.equalsIgnoreCase("R"))
                {
                    if(finger.right == null)
                    {
                        finger.right = new Node(reader.nextInt());
                        count++;
                    }
                    finger = finger.right;
                }
            }
            finger = tree.root;
        }

        System.out.print("Size: " + count + ", Num Leaves: " + tree.numLeaves() + "\n");
        
        
    }
}
