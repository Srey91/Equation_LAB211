/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.SuperlativeEquation;
import model.QuadraticEquation;
import validation.Validation;

/**
 *
 * @author 84898
 */
public class EquationView {
    SuperlativeEquation superlativeEquation = new SuperlativeEquation();
    QuadraticEquation quadraticEquation = new QuadraticEquation();
            
    Validation v = new Validation();
    
    public void input_linearEquation()
    {
        superlativeEquation.setB(v.getDouble("a"));
        superlativeEquation.setC(v.getDouble("b"));
    }
    
    public void input_squareEquation()
    {
        quadraticEquation.setA(v.getDouble("a"));
        quadraticEquation.setB(v.getDouble("b"));
        quadraticEquation.setC(v.getDouble("c"));
    }
    
    public void calculate_superlativeEquation()
    {
        input_linearEquation();
        
        int check;
        double b, c;
        b = superlativeEquation.getB();
        c = superlativeEquation.getC();
        
        if(b != 0 && c != 0)
        {
            check = 2;
        }else if(b != 0 && c == 0)
        {
            check = 1;
        }else
        {
            check = 0;
        }
        
        switch(check)
        {
            case 2 -> System.out.println("The result: " + -c / b);
            case 1 -> System.out.println("There are infinite value");
            case 0 -> System.out.println("There no solution");
        }
        
        if (check == 2)
        {
            double[] number = {b, c, -c/b};
            getOddNumbers(number);
            getEvenNumbers(number);
            getPerfectSquareNumbers(number);
        }else
        {
            double[] number = {b, c};
            getOddNumbers(number);
            getEvenNumbers(number);
            getPerfectSquareNumbers(number);
        }
    }
    
    public void calculate_quadraticEquation()
    {
        input_squareEquation();
        
        double a, b, c;
        a = quadraticEquation.getA();
        b = quadraticEquation.getB();
        c = quadraticEquation.getC();
        double delta, x1, x2;
        delta = b * b - 4 * a * c;
         
        if(delta > 0)
        {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 solutions");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
            
            double[] number = {a, b, c, x1, x2};
            getOddNumbers(number);
            getEvenNumbers(number);
            getPerfectSquareNumbers(number);

        }else if(delta == 0)
        {
            x1 = -b / (2 * a);
            System.out.println("The equation has double solution");
            System.out.println("x: " + x1);
            
            double[] number = {a, b, c, x1};
            getOddNumbers(number);
            getEvenNumbers(number);
            getPerfectSquareNumbers(number);
        }else
        {
            System.out.println("The equation has no solution");
            double[] number = {a, b, c};
            getOddNumbers(number);
            getEvenNumbers(number);
            getPerfectSquareNumbers(number);
        }
    }
    
    public void getPerfectSquareNumbers(double[] number)
    {
        System.out.print("Number is Perfect Square: ");
        for (int i = 0; i < number.length; i++)
        {
            if (checkPerfectSquare(number[i]));
            {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("");
    }
    
    public boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    
    public void getOddNumbers(double[] number)
    {     
        System.out.print("Number is Odd: ");
        for (int i = 0; i < number.length; i++)
        {
            if ((int) (Math.abs(number[i]) + 0.5) % 2 != 0)
            {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("");
    }   
    
    public void getEvenNumbers(double[] number)
    {     
        System.out.print("Number is Even: ");
        for (int i = 0; i < number.length; i++)
        {
            if ((int) (Math.abs(number[i]) + 0.5) % 2 == 0)
            {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("");
    }
}
