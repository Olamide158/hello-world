/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.point;
import java.util.Scanner;

/**
 *
 * @author Adeleke Olamide
 */
public class GradePoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many courses are you taking?");
        String courseNum = input.nextLine();
        System.out.println("Enter your  Course Code");
        String courseCode;
        courseCode = input.nextLine();
        courseCode = input.nextLine();
        courseCode = input.nextLine();
        courseCode = input.nextLine();
        courseCode = input.nextLine();
        courseCode = input.nextLine();
        courseCode = input.nextLine();
        courseCode = input.nextLine();
        courseCode = input.nextLine();
        courseCode =input.nextLine();
        courseCode =input.nextLine();
        courseCode =input.nextLine();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int l = input.nextInt();
        System.out.println(a+b+c+d+e+f+g+h+i+j+k+l);
        int m  = input.nextInt();
        int n = input.nextInt();
        int o = input.nextInt();
        int p = input.nextInt();
        int q = input.nextInt();
        int r = input.nextInt();
        int s = input.nextInt();
        int t = input.nextInt();
        int u = input.nextInt();
        int v = input.nextInt();
        int w = input.nextInt();
        int x = input.nextInt();
        System.out.println(a*m+b*n+c*o+d*p+e*q+f*r+g*s+h*t+i*u+j*v+k*w+l*x);
        double X = a+b+c+d+e+f+g+h+i+j+k+l;
        double Y= a*m+b*n+c*o+d*p+e*q+f*r+g*s+h*t+i*u+j*v+k*w+l*x;
        System.out.println(Y/X);
        System.out.println("first semester GP is"+Y/X);
        
        
       
        
        
        
        
    }
    
}
