/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84898
 */
public class QuadraticEquation extends SuperlativeEquation{
    private double a;
    
    public QuadraticEquation()
    {
        super();
        this.a = 0;
    }
    
    public QuadraticEquation(double a, double b, double c)
    {
        super(b, c);
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }  
}
