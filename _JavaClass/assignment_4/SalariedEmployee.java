// SalariedEmployee.java

// SalariedEmployee class extends Employee.

import java.time.LocalDateTime;   
 

public class SalariedEmployee extends Employee

{

   private double weeklySalary;

 

   // 7-argument constructor

   public SalariedEmployee( String first, String last, String ssn, int year, int month, int day,

      double salary )

   {

      super( first, last, ssn, year, month, day ); // pass to Employee constructor

      setWeeklySalary( salary ); // validate and store salary

   } // end 7-argument SalariedEmployee constructor

      // four-argument constructor

      public SalariedEmployee( String first, String last, String ssn,

      double salary )

   {

      super( first, last, ssn); // pass to Employee constructor

      setWeeklySalary( salary ); // validate and store salary

   } // end four-argument SalariedEmployee constructor

 

   // set salary

   public void setWeeklySalary( double salary )

   {

      weeklySalary = salary < 0.0 ? 0.0 : salary;

   } // end method setWeeklySalary

 

   // return salary

   public double getWeeklySalary()

   {

      return weeklySalary;

   } // end method getWeeklySalary

 

   // calculate earnings; override abstract method earnings in Employee

   public double earnings()

   {

      double earnings = getWeeklySalary();
      
               
      LocalDateTime now = LocalDateTime.now(); 
      if (birthMonth == now.getMonthValue())
      {
          earnings += 100.00;
      }

      return earnings;

   } // end method earnings

 

   // return String representation of SalariedEmployee object

   public String toString()

   {

      return String.format( "salaried employee: %s\n%s: $%,.2f",

         super.toString(), "weekly salary", getWeeklySalary() );

   } // end method toString

} // end class SalariedEmployee