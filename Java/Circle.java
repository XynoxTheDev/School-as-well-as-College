/** 
 * Write a program in Java to find:
 * Area & Circumference of Circle and Area of Semi-Cirle
   */

class Circle
{
    public static void main(int r) // Variable 'r' is used as Radius
    {
        double A,C,S;
        A=3.14*r*r;
        C=2*3.14*r;
        S=0.5*3.14*r*r;
        System.out.println("Area of Circle is "+A);
        System.out.println("Circumference of Circle is "+C);
        System.out.println("Area of Semi-Circle is "+S);
    }
}