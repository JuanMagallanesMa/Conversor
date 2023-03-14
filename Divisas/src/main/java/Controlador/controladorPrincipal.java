/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.LogicaDivisas;

import Vista.Paginaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author luis magallanes
 */
public class controladorPrincipal implements ActionListener{
    
    private  Paginaprincipal princ;
    
    

    public controladorPrincipal( Paginaprincipal princ) {
        
        this.princ = princ;
        this.princ.buttomDivisas1.addActionListener(this);
        
    }

     public void IniciarPrincipal(){
        princ.setLocationRelativeTo(null);
        
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
            
    
    }
    
        
}
    
  
   

