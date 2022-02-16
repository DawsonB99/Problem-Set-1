import java.util.Scanner;
import java.util.ArrayList;
import java.text.NumberFormat;
/**
 * Enter in Callee's name, number of ghosts needing busting, marshmellow men needing squashing,
 * and a discount code for your reciept of our Service.
 *
 * @author Dawson Bridger
 * @version Spring 2020
 */
public class GhostBusters
{
    public static String customer_name;
    public static int num_ghosts;
    public static int num_marshmellowmen;
    public static String discount_code;

    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        
        double totals = 0;
        double indTotal = 0;
        int counter = 0;
        int invoiceTotal = 0;
        int ghostTotal = 0;
        int marshmellowTotal = 0;
        double dupTotal = indTotal;
        double dupGrandTotal = totals;
        String callee = input.next();
        while(!callee.equals("PRINT"))
        {
            if(counter == 0)
            {
                customer_name = callee;
                counter++;
            }
            else if(counter == 1)
            {
                num_ghosts = Integer.parseInt(callee);
                counter++;
            }
            else if(counter == 2)
            {
                num_marshmellowmen = Integer.parseInt(callee);
                counter++;
            }
            else if(counter == 3)
            {
                discount_code = callee;
                indTotal = (long)500 + ((long)4000 * num_ghosts) + ((long)10000 * num_marshmellowmen);
                if(num_ghosts > 0 || num_marshmellowmen > 0)
                {
                    indTotal += (long)1000;
                }
                dupTotal = indTotal;
                System.out.println(customer_name + ": " + (discount_code.equalsIgnoreCase("Tully")? 
                            "$" + NumberFormat.getNumberInstance().format((long)(indTotal = indTotal * .98)) + "($" + 
                            NumberFormat.getNumberInstance().format((long)dupTotal) + 
                            " less 2% discount code Tully)": discount_code.equalsIgnoreCase("Barrett")? 
                            "$" + NumberFormat.getNumberInstance().format((long)(indTotal = indTotal * .95)) 
                            + " ($" + NumberFormat.getNumberInstance().format((long)dupTotal) + 
                            " less 5% discount code Barrett)" : discount_code.equalsIgnoreCase("Egon")? 
                            "$" + NumberFormat.getNumberInstance().format((long)(indTotal = indTotal * .90)) 
                            + "($" + NumberFormat.getNumberInstance().format((long)dupTotal) + 
                            " less 10% discount code Egon)" : discount_code.equalsIgnoreCase("Vigo")?
                            "$" + NumberFormat.getNumberInstance().format((long)(indTotal = indTotal * .80)) 
                            + " ($" + NumberFormat.getNumberInstance().format((long)dupTotal) + " less 20% discount code Vigo)" 
                            : discount_code.equalsIgnoreCase("Venkman")? "$" + 
                            NumberFormat.getNumberInstance().format((long)(indTotal = indTotal * .60)) + " ($" 
                            + NumberFormat.getNumberInstance().format((long)dupTotal) +  " less 40% discount code Venkman)"
                            : "$" + NumberFormat.getNumberInstance().format((long)indTotal) + 
                            " (unknown discount code " + discount_code + ")"));
                totals += indTotal;
                counter = 0;
                ghostTotal += num_ghosts;
                marshmellowTotal += num_marshmellowmen;
                invoiceTotal += 1;
                indTotal = 0;
                dupGrandTotal += dupTotal;
            }

            callee = input.next();
        }
        System.out.println((invoiceTotal > 1? invoiceTotal + " invoices, $" : invoiceTotal + " invoice, $") + NumberFormat.getNumberInstance().format((int)totals) 
        + " (discounted from $" + NumberFormat.getNumberInstance().format((int)dupGrandTotal) + "), " + ghostTotal + (ghostTotal > 1?
        " ghosts, " : " ghost, ") + marshmellowTotal + (marshmellowTotal > 1? 
        " marshmellow men" : " marshmellow man"));

    }
}
