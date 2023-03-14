/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.LogicaTemperatura;
import Vista.Paginaprincipal;
import Vista.Temperatura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author luis magallanes
 */
public class ControladorTemperatura implements ActionListener{

    private Temperatura visTemp;
    private LogicaTemperatura modelTemp;

    public ControladorTemperatura(Temperatura visTemp, LogicaTemperatura modelTemp) {
        this.visTemp = visTemp;
        this.modelTemp = modelTemp;
        this.visTemp.buttomConvertTemp.addActionListener(this);
        this.visTemp.buttomRegresarTemp.addActionListener(this);
    }
    public void IniciarTemp(){
        visTemp.setLocationRelativeTo(null);
        visTemp.setVisible(true);
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if(visTemp.buttomConvertTemp==e.getSource()){
            try{
                modelTemp.setNombreTemp((String)visTemp.comboTemperatura.getSelectedItem());
                modelTemp.setTemperatura(Double.parseDouble(visTemp.textFtTemp.getText().replaceAll("\\,", ".")));
                modelTemp.convertir();
                visTemp.labelTemp.setText(modelTemp.getNombreTemp());
                visTemp.textFSalidaTemp.setText(String.valueOf(modelTemp.getResultado()));
            }catch(NumberFormatException evt){
                JOptionPane.showMessageDialog(null, "Ingrese numeros", "Error",JOptionPane.ERROR_MESSAGE);
                visTemp.textFtTemp.setText("");
                visTemp.labelTemp.setText("");
                visTemp.textFSalidaTemp.setText("0");
            }

        }else if(visTemp.buttomRegresarTemp==e.getSource()){
            Paginaprincipal princ = new Paginaprincipal();
            int valor = JOptionPane.showConfirmDialog(null, "Desea regrasar al menu principal?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            princ.setLocationRelativeTo(null);
            if(valor==0){
                princ.setVisible(true);
                visTemp.dispose();
            }
        }
    }
    
}
