// BasePlusCommissionEmployee.java

// BasePlusCommissionEmployee class extends CommissionEmployee.

import java.time.LocalDateTime;   
 

public class BasePlusCommissionEmployee extends CommissionEmployee

{

   private double baseSalary; // base salary per week

 

   // 9-argument constructor

   public BasePlusCommissionEmployee( String first, String last,

      String ssn, int year, int month, int day, double sales, double rate, double salary )

   {

      super( first, last, ssn, year, month, day, sales, rate );

      setBaseSalary( salary ); // validate and store base salary

   } // end 9-argument BasePlusCommissionEmployee constructor
   
   // six-argument constructor

   public BasePlusCommissionEmployee( String first, String last,

      String ssn,  double sales, double rate, double salary )

   {

      super( first, last, ssn,  sales, rate );

      setBaseSalary( salary ); // validate and store base salary

   } // end six-argument BasePlusCommissionEmployee constructor

 

   // set base salary

   public void setBaseSalary( double salary )

   {

      baseSalary = ( salary < 0.0 ) ? 0.0 : salary; // non-negative

   } // end method setBaseSalary

 

   // return base salary

   public double getBaseSalary()

   {

      return baseSalary;

   } // end method getBaseSalary

 

   // calculate earnings; override method earnings in CommissionEmployee

   public double earnings()

   {
      double earnings = getBaseSalary() + super.earnings();
      
      LocalDateTime now = LocalDateTime.now(); 
      if (birthMonth == now.getMonthValue())
      {
          earnings += 100.00;
      }

      return earnings;

   } // end method earnings

 

   // return String representation of BasePlusCommissionEmployee object

   public String toString()

   {

      return String.format( "%s %s; %s: $%,.2f",

         "base-salaried", super.toString(),

         "base salary", getBaseSalary() );

   } // end method toString  

} // end class BasePlusCommissionEmployee