/**
 * Write a program to accept basic pay and print the net pay.
 * 
 * Use the following formulas:
 * 
 * | Gross Salary | = basic pay + da + hra      |
 * |--------------|-----------------------------|
 * | Deduction    | = pf + it                   |
 * | Net Salary   | = gross salary - deductions |
 * 
 * Use the following values:
 * 
 * | da  | = 40% of basic salary |
 * |-----|-----------------------|
 * | hra | = 30% of basic salary |
 * | pf  | = 10% of basic salary |
 * | it  | = 2% of basic salary  |
 * 
   */
  
  class Pay
  {
      public static void main(int bs) // bs = Basic Salary
      {
          double da, hra, pf, it, gr, d, Nt;
          da = 0.40*bs;
          hra = 0.30*bs;
          pf = 0.10*bs;
          it = 0.02*bs;
          gr = bs+da+hra;
          d = pf+it;
          Nt = gr-d;
          System.out.println("Net Salary = "+Nt);
      }
  }