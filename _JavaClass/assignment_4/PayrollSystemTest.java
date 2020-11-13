/**
   Program #3

   Function: Simple Java application to demonstrate the inheritance, and polymorphism.

   Programmed By: Denney, Gene B, 2020_11_09

*/
import java.util.*; 

public class PayrollSystemTest

{

   public static void main( String args[] )

   {

    ArrayList<Employee> emparr = new ArrayList<Employee>();
     
     Scanner cin = new Scanner(System.in);

     boolean keepGoing = true;

     do{
         Employee e;
         int empType;
         String first;
         String last;
         String ssn;
         int year, month, day;
         System.out.println("enter the number for employee type 1) hourly 2) salaried 3) commission or 4) base plus commission 5) to stop entering employees and continue");
         empType = cin.nextInt();
         cin.nextLine();
         while (0 >= empType && empType <= 6)
         {
            System.out.println("the selection needs to be 1,2,3,4 or 5");
            System.out.println("enter the number for employee type 1) hourly 2) salaried 3) commission or 4) base plus commission");
            empType = cin.nextInt();
         }
         if (empType == 5)
         {
             keepGoing = false;
             break;
         }
         System.out.println("enter employees's first name:");
         first = cin.nextLine();
         System.out.println("enter employees's last name:");
         last = cin.nextLine();
         System.out.println("enter employees's ssn:");
         ssn = cin.nextLine();
         System.out.println("enter the number for employee birth year");
         year = cin.nextInt();
         cin.nextLine();

         System.out.println("enter the number for employee birth month");
         month = cin.nextInt();
         cin.nextLine();
         while (0 >= month || month >= 13)
         {
            System.out.println("the selection needs to be 1 -12");
            System.out.println("enter the number for employee month");
            month = cin.nextInt();
            cin.nextLine();
         }
         System.out.println("enter the number for employee birth day of the month");
         day = cin.nextInt();
         cin.nextLine();
         while (-1 == Date.checkDay(day, month, year))
         {
            System.out.println("the selection needs to be a day within the given month");
            System.out.println("enter the number for employee birth day of the month");
            day = cin.nextInt();
            cin.nextLine();
         }
         switch (empType)
         {
             case 1:
                System.out.println("enter employee hourly wage");
                double hourlyWage = cin.nextDouble();
                cin.nextLine();
                System.out.println("enter employee hours worked");
                double hoursWorked = cin.nextDouble();
                cin.nextLine();
                e = new HourlyEmployee(first, last, ssn, year, month, day, hourlyWage, hoursWorked);
                emparr.add(e);
                break;
             case 2:
                System.out.println("enter employee weeky salary");
                double salary = cin.nextDouble();
                e= new SalariedEmployee(first, last, ssn, year, month, day, salary);
                emparr.add(e);
                break;
             case 3:
                System.out.println("enter employee gross sales");
                double sales = cin.nextDouble();
                cin.nextLine();
                System.out.println("enter employee commission rate");
                double rate = cin.nextDouble();
                cin.nextLine();
                e = new CommissionEmployee(first, last, ssn, year, month, day, sales, rate);
                emparr.add(e);
                break;
             case 4:
                System.out.println("enter employee gross sales");
                double salesB = cin.nextDouble();
                cin.nextLine();
                System.out.println("enter employee commission rate");
                double rateB = cin.nextDouble();
                cin.nextLine();
                System.out.println("enter employee base salary");
                double baseSal = cin.nextDouble();
                cin.nextLine();
                e = new BasePlusCommissionEmployee(first, last, ssn, year, month, day, salesB, rateB, baseSal);
                emparr.add(e);
                break;

         }

     }while (keepGoing);

     
      

      System.out.println( "Employees processed individually:\n" );

     for ( Employee currentEmployee : emparr )
     {

        System.out.printf( "%s\n%s: $%,.2f\n\n",
        //
        currentEmployee, "earned", currentEmployee.earnings() );
         
     }
 

      System.out.println( "Employees processed polymorphically:\n" );

     

      // generically process each element in array employees

      for ( Employee currentEmployee : emparr )

      {

         System.out.println( currentEmployee ); // invokes toString

 

         // determine whether element is a BasePlusCommissionEmployee

         if ( currentEmployee instanceof BasePlusCommissionEmployee )

         {

            // downcast Employee reference to

            // BasePlusCommissionEmployee reference

            BasePlusCommissionEmployee employee =

               ( BasePlusCommissionEmployee ) currentEmployee;

 

            double oldBaseSalary = employee.getBaseSalary();

            employee.setBaseSalary( 1.10 * oldBaseSalary );

            System.out.printf(

               "new base salary with 10%% increase is: $%,.2f\n",

               employee.getBaseSalary() );

         } // end if

         double earnings = currentEmployee.earnings();
         System.out.printf(

            "earned $%,.2f\n\n", earnings );

      } // end for

 

      // get type name of each object in employees array

            // get type name of each object in employees array

     int j = 0; 
         
     for ( Employee currentEmployee : emparr )
     {

         System.out.printf( "Employee %d is a %s\n", j,
   
         currentEmployee.getClass().getName() );
         j++;
     }

      cin.close();

   } // end main

} // end class PayrollSystemTest