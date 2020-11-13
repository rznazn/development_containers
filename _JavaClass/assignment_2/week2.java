import javax.swing.JOptionPane;

public class week2
{
    //main entry point for applicaiont
   public static void main(String[] args)
   {
       int[] ints = new int[3];

       //loop to recieve all three inputs
       for(int i =0; i < 3; i++)
       {
            ints[i] = Integer.parseInt(JOptionPane.showInputDialog("enter number " + i + " for calculation"));
            System.out.println("input " + i + " is: " + ints[i]);
       }

       //initilalize the smallest and largest to the first value
       int smallest = ints[0];
       int largest = ints[0];

       //loop through all values to get correct largest and smallest
       for(int i =1; i < 3; i++)
       {
            if(ints[i]< smallest) smallest = ints[i];
            if(ints[i]> largest) largest = ints[i];
       }

       //calculat total average and product
       int total = ints[0] + ints[1] + ints[2];
       int average = total/3;
       int product = ints[0] * ints[1] *  ints[2];

       //build output message
       String results = "sum : " + total+
                        "\naverage: " + average+
                        "\nproduct: " + product +
                        "\nsmallest: " + smallest +
                        "\nlargest: " + largest ;

        //show output message
       JOptionPane.showMessageDialog(null, results);
   }
}