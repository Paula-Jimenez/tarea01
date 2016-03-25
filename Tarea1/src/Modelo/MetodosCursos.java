/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PaulaJCh
 */
public class MetodosCursos {
    ArrayList<Curso> arrayCurso;
    
    public MetodosCursos()
    {
        arrayCurso= new ArrayList<Curso>();
    }
    public void agregarCurso(String informacion[])
    {
        Curso temporal=new Curso(informacion[0],informacion[1],informacion[2]);
        arrayCurso.add(temporal);
    }
    public void mostrarInformacionCursos()
    {
        Curso temporal;
        temporal= arrayCurso.get(0);
        System.out.println(temporal.getInformacion());
    }
    
    public String[] consultarCurso(String siglas)
    {
        String arregloConsulta[]=new String[3];
        
        for(int contador=0;contador<arrayCurso.size();contador++)
        {
            if(arrayCurso.get(contador).getSiglas().equals(siglas))
            {
                arregloConsulta[0]=arrayCurso.get(contador).getNombre();
                arregloConsulta[1]=arrayCurso.get(contador).getSiglas();
                arregloConsulta[2]=arrayCurso.get(contador).getCreditos();
            }
            
        }
        return arregloConsulta;
        
    }
    public void modificarCurso(String informacion[])
   {
       for(int i=0; i<arrayCurso.size();i++){
           if(arrayCurso.get(i).getSiglas().equals(informacion[0])){
               
               arrayCurso.get(i).setNombre(informacion[0]);
               arrayCurso.get(i).setSiglas(informacion[1]);
               arrayCurso.get(i).setCreditos(informacion[2]);
           }
       }
           
   }
    public void eliminarCurso(String informacion[])
       {
          System.out.print(arrayCurso.size());
          
          for(int i=0;i<arrayCurso.size();i++)
          {
              if(arrayCurso.get(i).getSiglas().equals(informacion[0])){
                  arrayCurso.remove(i);
                  JOptionPane.showMessageDialog(null,"El Curso fúe eliminado");{
                  
              }
              }System.out.print(arrayCurso.size());
          }
       }
}
