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
public class MetodosEstudiantes {
    ArrayList<Estudiante> arrayEstudiante;
    
    public MetodosEstudiantes()
    {
        arrayEstudiante=new ArrayList<Estudiante>(); 
    }
    public void agregarEstudiante(String informacion[])
    { 
        Estudiante temporal=new Estudiante(informacion[0],informacion[1]);
        arrayEstudiante.add(temporal);
    }
    
    public void mostrarInformacionEstudiantes()
    {
        Estudiante temporal;
        temporal= arrayEstudiante.get(0);
        System.out.println(temporal.getInformacion());
    }
    
    public String[] consultarEstudiante(String carnet)
    {
        String arregloConsulta[] =new String[2];
        
        for(int contador=0;contador<arrayEstudiante.size();contador++)
        {
            if(arrayEstudiante.get(contador).getCarnet().equals(carnet))
            {
                arregloConsulta[0]=arrayEstudiante.get(contador).getCarnet();
                arregloConsulta[1]=arrayEstudiante.get(contador).getNombre();
            }
        }
        return arregloConsulta;
        
    }
            
    public void modificarEstudiante(String informacion[])
   {
       for(int i=0; i<arrayEstudiante.size();i++){
           if(arrayEstudiante.get(i).getCarnet().equals(informacion[0])){
               
               arrayEstudiante.get(i).setCarnet(informacion[0]);
               arrayEstudiante.get(i).setNombre(informacion[1]);
           }
       }
           
   }
     public void eliminarCurso(String informacion[])
       {
          System.out.print(arrayEstudiante.size());
          
          for(int i=0;i<arrayEstudiante.size();i++)
          {
              if(arrayEstudiante.get(i).getCarnet().equals(informacion[0])){
                  arrayEstudiante.remove(i);
                  JOptionPane.showMessageDialog(null,"El Estudiante fúe eliminado");{
                  
              }
              }System.out.print(arrayEstudiante.size());
          }
       }
    
    
}
