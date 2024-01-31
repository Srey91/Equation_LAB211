/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.EquationController;
import view.EquationView;

/**
 *
 * @author 84898
 */
public class Main {
    public static void main(String[] args) {
        EquationController ec = new EquationController();
        EquationView ev = new EquationView();
        
        ec.menu(ev);
    }
}
