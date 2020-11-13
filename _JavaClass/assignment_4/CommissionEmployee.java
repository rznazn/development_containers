// CommissionEmployee.java

// CommissionEmployee class extends Employee.

import java.time.LocalDateTime;   
 

public class CommissionEmployee extends Employee

{

   private double grossSales; // gross weekly sales

   private double commissionRate; // commission percentage

 

   // 8-argument constructor

   public CommissionEmployee( String first, String last, String ssn, int year, int month, int day,

      double sales, double rate )

   {

      super( first, last, ssn, year, month, day);

      setGrossSales( sales );

      setCommissionRate( rate );

   } // end 8-argument CommissionEmployee constructor

   
   // five-argument constructor

   public CommissionEmployee( String first, String last, String ssn, 
      double sales, double rate )

   {

      super( first, last, ssn);

      setGrossSales( sales );

      setCommissionRate( rate );

   } // end five-argument CommissionEmployee constructor

 

   // set commission rate

   public void setCommissionRate( double rate )

   {

      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;

   } // end method setCommissionRate

 

   // return commission rate

   public double getCommissionRate()

   {

      return commissionRate;

   } // end method getCommissionRate

 

   // set gross sales amount

   public void setGrossSales( double sales )

   {

      grossSales = ( sales < 0.0 ) ? 0.0 : sales;

   } // end method setGrossSales

 

   // return gross sales amount

   public double getGrossSales()

   {

      return grossSales;

   } // end method getGrossSales

 

   // calculate earnings; override abstract method earnings in Employee

   public double earnings()

   {

      double earnings =  getCommissionRate() * getGrossSales();
      
      LocalDateTime now = LocalDateTime.now(); 
      if (birthMonth == now.getMonthValue())
      {
          earnings += 100.00;
      }

      return earnings;

   } // end method earnings

 

   // return String representation of CommissionEmployee object

   public String toString()

   {

      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",

         "commission employee", super.toString(),

         "gross sales", getGrossSales(),

         "commission rate", getCommissionRate() );

   } // end method toString

} // end class CommissionEmployee