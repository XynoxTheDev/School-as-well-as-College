/**
 * Write a program in Java to find that provided year is leap year or not.
   */
  
  class Year
  {
      public static void main(int year) // Variable 'y' is used for year.
      {
            // year to be checked
             boolean leap = false;

             // if the year is divided by 4
             if (year % 4 == 0) {

             // if the year is century
               if (year % 100 == 0) {

             // if year is divided by 400
             // then it is a leap year
              if (year % 400 == 0)
              leap = true;
             else
             leap = false;
              }
      
             // if the year is not century
             else
              leap = true;
             }
    
             else
             leap = false;

             if (leap)
             System.out.println(year + " is a leap year.");
             else
             System.out.println(year + " is not a leap year.");
  }
}
