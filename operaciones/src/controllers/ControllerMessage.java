/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelMessage; 
import views.ViewMessage;

/**
 *
 * @author HP
 */
public class ControllerMessage {
   
    
     private final ViewMessage vista;
     private final ModelMessage modelo; 
     
     public ControllerMessage( ViewMessage vista , ModelMessage modelo){ 
         this.vista = vista; 
         this.modelo = modelo;
         
         this.vista.jb_suma.addActionListener(this::jb_sumaActionPerformed); 
         this.vista.jb_resta.addActionListener(this::jb_restaActionPerformed);
         this.vista.jb_division.addActionListener((evt) -> this.jb_divisionActionPerformed(evt));
         this.vista.jb_multiplicacion.addActionListener(this::jb_multiplicacionActionPerformed);
         
       
     }
     
     private void jb_sumaActionPerformed(java.awt.event.ActionEvent evt)  {
      modelo.setnumero1(Float.parseFloat((vista.jtf_numero1.getText())));
      modelo.setnumero2(Float.parseFloat((vista.jtf_numero2.getText())));
      modelo.suma();
      vista.jtf_resultado.setText(""+modelo.getresultado());
     
    }
      private void jb_restaActionPerformed(java.awt.event.ActionEvent evt)  {
      modelo.setnumero1(Float.parseFloat((vista.jtf_numero1.getText())));
      modelo.setnumero2(Float.parseFloat((vista.jtf_numero2.getText())));
      modelo.resta();
      vista.jtf_resultado.setText(""+modelo.getresultado());
     
    }
       private void jb_divisionActionPerformed(java.awt.event.ActionEvent evt)  {
      modelo.setnumero1(Float.parseFloat((vista.jtf_numero1.getText())));
      modelo.setnumero2(Float.parseFloat((vista.jtf_numero2.getText())));
      modelo.division();
      vista.jtf_resultado.setText("ghola"+modelo.getresultado());
     
    }
       private void jb_multiplicacionActionPerformed(java.awt.event.ActionEvent evt)  {
      modelo.setnumero1(Float.parseFloat((vista.jtf_numero1.getText())));
      modelo.setnumero2(Float.parseFloat((vista.jtf_numero2.getText())));
      modelo.multiplicacion();
      vista.jtf_resultado.setText(""+modelo.getresultado());
     
    }
     public void iniciar_vista() {
         vista.setTitle( "operaciones " ); 
         vista.setLocationRelativeTo(null);
         
     }

}
