// Employee.java

// Employee abstract superclass.

 

public abstract class Employee

{

   private String firstName;

   private String lastName;

   private String socialSecurityNumber;

   private Date birthDate;

   protected int birthMonth;

 

   // 6-argument constructor

   public Employee( String first, String last, String ssn, int year, int month, int day)

   {

      firstName = first;

      lastName = last;

      socialSecurityNumber = ssn;

      birthDate = new Date(year, month, day);

      birthMonth = month;

   } // end 6-argument Employee constructor
      // 6-argument constructor

      public Employee( String first, String last, String ssn)

      {
   
         firstName = first;
   
         lastName = last;
   
         socialSecurityNumber = ssn;
         birthDate = new Date(1970, 1, 1);

         birthMonth = 1;
   
      } // end 6-argument Employee constructor

 

   // set first name

   public void setFirstName( String first )

   {

      firstName = first;

   } // end method setFirstName

 

   // return first name

   public String getFirstName()

   {

      return firstName;

   } // end method getFirstName

 

   // set last name

   public void setLastName( String last )

   {

      lastName = last;

   } // end method setLastName

   // set birth date

   public void setBirthDate( int year, int month, int day)
   {
       birthDate = new Date(year, month, day);
   }//end method setBirthDate

 

   // return last name

   public String getLastName()

   {

      return lastName;

   } // end method getLastName

 

   // set social security number

   public void setSocialSecurityNumber( String ssn )

   {

      socialSecurityNumber = ssn; // should validate

   } // end method setSocialSecurityNumber

 

   // return social security number

   public String getSocialSecurityNumber()

   {

      return socialSecurityNumber;

   } // end method getSocialSecurityNumber

   // return string birthdate
   public String getBirthDate()
   {
       return birthDate.toString();
   }

      // return string birthdate
      public int getBirthMonth()
      {
          return birthMonth;
      }

 

   // return String representation of Employee object

   public String toString()

   {

      return String.format( "%s %s\nsocial security number: %s\nbirthday: %s",

         getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate() );

   } // end method toString


 

   // abstract method overridden by subclasses

   public abstract double earnings(); // no implementation here

} // end abstract class Employee
