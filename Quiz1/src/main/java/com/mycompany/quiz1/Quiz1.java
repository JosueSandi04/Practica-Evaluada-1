/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Quiz1 {

    public static void main(String[] args) {
        //Declaracion de variables.
        int empleados;
        double salarios;
        
        
                
        
                
                
        
        //Registro de datos
        empleados = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de empleados"));
        salarios = Double.parseDouble(JOptionPane.showInputDialog("Digite el total de los salarios")); 
       
        
        salarios = salarios * 0.1433;
           
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de " +salarios + " por concepto de SEM y IVM");
        
        //JOptionPane.showMessageDialog(null,"El total de empleados es de: " + empleados);
        //JOptionPane.showMessageDialog(null, "El total de todos los salarios es: " + salarios);

        
        
        
        
        
        
                
    }
}
