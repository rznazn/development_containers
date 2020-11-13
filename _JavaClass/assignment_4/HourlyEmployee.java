// HourlyEmployee.java

// HourlyEmployee class extends Employee.

 
import java.time.LocalDateTime;   

public class HourlyEmployee extends Employee

{

   private double wage; // wage per hour

   private double hours; // hours worked for week

 

   // eight-argument constructor

   public HourlyEmployee( String first, String last, String ssn, int year, int month, int day,

      double hourlyWage, double hoursWorked )

   {

      super( first, last, ssn, year, month, day);

      setWage( hourlyWage ); // validate and store hourly wage

      setHours( hoursWorked ); // validate and store hours worked

   } // end eight-argument HourlyEmployee constructor

   
   // five-argument constructor

   public HourlyEmployee( String first, String last, String ssn,

      double hourlyWage, double hoursWorked )

   {

      super( first, last, ssn);

      setWage( hourlyWage ); // validate and store hourly wage

      setHours( hoursWorked ); // validate and store hours worked

   } // end five-argument HourlyEmployee constructor

 

   // set wage

   public void setWage( double hourlyWage )

   {

      wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;

   } // end method setWage

 

   // return wage

   public double getWage()

   {

      return wage;

   } // end method getWage

 

   // set hours worked

   public void setHours( double hoursWorked )

   {

      hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?

         hoursWorked : 0.0;

   } // end method setHours

 

   // return hours worked

   public double getHours()

   {

      return hours;

   } // end method getHours

 

   // calculate earnings; override abstract method earnings in Employee

   public double earnings()

   {
      double earnings;

      if ( getHours() <= 40 ) // no overtime

      earnings = getWage() * getHours();

      else

      earnings = 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;

               
      LocalDateTime now = LocalDateTime.now(); 
      if (birthMonth == now.getMonthValue())
      {
          earnings += 100.00;
      }

      return earnings;

   } // end method earnings

 

   // return String representation of HourlyEmployee object

   public String toString()

   {

      return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",

         super.toString(), "hourly wage", getWage(),

         "hours worked", getHours() );

   } // end method toString

} // end class HourlyEmployee