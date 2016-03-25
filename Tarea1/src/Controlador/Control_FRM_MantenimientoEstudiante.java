/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PaulaJCh
 */
public class Control_FRM_MantenimientoEstudiante implements ActionListener{
    
    MetodosEstudiantes metodos; 
    FRM_MantenimientoEstudiante mantenimientoEstudiante;
    
    public Control_FRM_MantenimientoEstudiante(FRM_MantenimientoEstudiante mantenimientoEstudiante){
        this.mantenimientoEstudiante= mantenimientoEstudiante;
        metodos= new MetodosEstudiantes();
    }
    
     public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Consultar"))
        {
            mantenimientoEstudiante.mostrarInformacion(metodos.consultarEstudiante(mantenimientoEstudiante.devolverCarnet()));
        }
         if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarEstudiante(mantenimientoEstudiante.devolverInformacion());
            metodos.mostrarInformacionEstudiantes();
        }
          if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarEstudiante(mantenimientoEstudiante.devolverInformacion());
        }
            if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarCurso(mantenimientoEstudiante.devolverInformacion());
        }
    }
}
