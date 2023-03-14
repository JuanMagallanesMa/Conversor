/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.LogicaDivisas;
import Vista.Paginaprincipal;
import Vista.SeleccionDivisas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author luis magallanes
 */
public class ControladorDivisas implements ActionListener{
    private  LogicaDivisas model;
    private  SeleccionDivisas div;

    public ControladorDivisas(LogicaDivisas model, SeleccionDivisas div) {
        this.model = model;
        this.div = div;
        this.div.buttonSeleccion.addActionListener(this);
        this.div.buttomRegresar.addActionListener(this);
    }
    public void IniciarDiv(){
        div.setLocationRelativeTo(null);
        div.setVisible(true);
    }

    
    @Override
    public  void actionPerformed (ActionEvent e){
        if(div.buttonSeleccion==e.getSource()){
           
            try {
                model.setCambio((String)div.comboConvertirDe.getSelectedItem());
                model.setMoneda(Double.parseDouble(div.textFIngreso.getText().replaceAll("\\,", ".")));
                div.labelResultado.setText(model.getCambio());
                model.convertir();
                div.textFSalida.setText(String.valueOf(model.getResultado()));
            }catch(NumberFormatException evt){
               JOptionPane.showMessageDialog(null, "Ingrese numeros", "Error",JOptionPane.ERROR_MESSAGE);
               div.textFIngreso.setText("");
               div.labelResultado.setText("");
               div.textFSalida.setText("0");
            }   
        }else if (div.buttomRegresar==e.getSource()){
            Paginaprincipal princ = new Paginaprincipal();
            int valor = JOptionPane.showConfirmDialog(null, "Desea regrasar al menu principal?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            princ.setLocationRelativeTo(null);
            if(valor==0){
                princ.setVisible(true);
                div.dispose();
            }
        }    
            
    }
    
    
    
}
