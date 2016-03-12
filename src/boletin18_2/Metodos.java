/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

import javax.swing.JOptionPane;


public class Metodos {
    int[]notas = new int[30];

  public void cargarArray(){
   for(int i=0;i<30;i++){
       notas[i]=(int)(Math.random()*10+1);
      System.out.println(notas[i]);
   }
   }
  public void aprobadosysuspensos(){
   int contador_aprobados=0;
   int contador_suspensos=0;
  
    for(int i=0;i<notas.length;i++){
        if(notas[i]>=5){
            contador_aprobados++;
        }else{
            contador_suspensos++;
        }}
      JOptionPane.showMessageDialog(null,"en total aprobaron programación "+contador_aprobados+" alumnos");
      JOptionPane.showMessageDialog(null,"en total suspenderon programación "+contador_suspensos+" alumnos");
    }
   public void notaMedia(){
     int acumulador_notas =0;
     
     for(int i=0;i<notas.length;i++){
         acumulador_notas+=notas[i];
     
     }
     
     JOptionPane.showMessageDialog(null,"a nota media en programación é "+acumulador_notas/notas.length);
}
   public void notaAlta(){
      int notaAlta=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>notaAlta){
                notaAlta=notas[i];
            }
        }
        JOptionPane.showMessageDialog(null," a nota máis alta é un: " + notaAlta);
    }
   
   
   
   }
   
   


