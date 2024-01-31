/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import menu.Menu;
import view.EquationView;

/**
 *
 * @author 84898
 */
public class EquationController extends Menu{
    public void menu (EquationView ev)
    {
        String[] content = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit the program"};
        
        Menu m = new Menu("Menu", content)
        {
            @Override
            public void execute(int ch) {
                switch (ch)
                {
                    case 1: ev.calculate_superlativeEquation(); break;
                    case 2: ev.calculate_quadraticEquation(); break;
                }
            }
            
        };
        m.run();
                
    }

    @Override
    public void execute(int ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
