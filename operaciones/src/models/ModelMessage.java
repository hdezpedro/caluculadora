/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class ModelMessage {
    private float resultado;
    private float numero1;
    private float numero2;
    public float getresultado()
    {
        return resultado;
    }
    public void setresultado(float resultado) {
        this.resultado = resultado;
    }
    public float getnumero1()
    {
        return numero1;
    }
    public void setnumero1(float numero1) {
        this.numero1 = numero1;
    }
    public float getnumero2()
    {
        return numero2;
    }
    public void setnumero2(float numero2) {
        this.numero2 = numero2;
    }
    

    public void suma(){
         this.resultado=this.numero1+numero2;
    }
    public void resta(){
         this.resultado=this.numero1-numero2;
    }
    public void multiplicacion(){
         this.resultado=this.numero1*numero2;
    }
    public void division(){
        if (this.numero2>0){
        this.resultado=this.numero1/numero2;
        }
        else
        {
          JOptionPane.showMessageDialog(null,"El numero debe ser mayor a cero","Atencion", JOptionPane.INFORMATION_MESSAGE );  
        }
    }

    
}
