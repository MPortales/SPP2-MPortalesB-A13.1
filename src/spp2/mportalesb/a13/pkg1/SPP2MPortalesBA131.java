/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mportalesb.a13.pkg1;
import javax.swing.JOptionPane;
/**
 *
 * @author may37
 */
public class SPP2MPortalesBA131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double e, p, imc;
        e= metodo("Introduce la estatura");
        p = metodo ("Introduce el peso");
        imc= p/(e*e);
        JOptionPane.showMessageDialog(null,"El IMC es " + imc );
        
        if (imc<=16){
            JOptionPane.showMessageDialog(null, "Necesitas COMER");
        } else if(imc>=25){
           JOptionPane.showMessageDialog(null,"DEJA DE COMER");                  
        } else {
            JOptionPane.showMessageDialog(null, "ESTAS BIEN");
        }
    }
    public static double metodo (String dato){
        boolean flag;
        double infor=0;
        do{
         try{   
        String info= JOptionPane.showInputDialog(null, "Calculadora IMC", dato);
        infor= Double.parseDouble(info);
        flag= false;
         } catch (Exception ex){
             System.out.println("Introduce el dato pedido");
             flag= true;
             System.out.println("");
         } 
        }while (flag);       
        return infor;
    }
}
