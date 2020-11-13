import java.util.Scanner;
import java.text.DecimalFormat;

public class products 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double total =0.0;
        int prodNum;//used for product count and sentinal value
        do
        {

            System.out.println("enter the product number for line or -1 to finish ");
            //get sentinal product number and check for exit value
            prodNum = input.nextInt();
            if (prodNum != -1)
            {
                System.out.println("enter the quantity for this item or -1 to cancel: ");
                //get quantity and check for cancelation value
                int quant = input.nextInt();
                if(quant != -1)
                {
                    //assign unit cost based on product number
                    double price = 0.0;
                    switch(prodNum)
                    {
                        case 1:
                        price = 2.98;
                        break;
                        case 2:
                        price = 4.50;
                        break;
                        case 3:
                        price = 9.98;
                        break;
                        case 4:
                        price = 4.49;
                        break;
                        case 5:
                        price = 6.87;
                        break;
                    }
                    //append the string builder with a line for the current entry
                    total += (price* quant);
                    System.out.println("product " + String.valueOf(prodNum)+ "\t units " + String.valueOf(quant) + " unit cost $" + String.valueOf(price) 
                    + " total $" + new DecimalFormat("#.00").format(total)) ;
                }

            }
        }while( prodNum != -1);//exit on the -1 value for prodnum
        //print summary
        System.out.println("final sentinal value: " + prodNum);
        System.out.println("order final total: " + new DecimalFormat("#.00").format(total));
        input.close();//dispose of your trash properly
    }
}