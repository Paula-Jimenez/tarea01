/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_MantenimientoCursos;
import Vista.FRM_MantenimientoEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PaulaJCh
 */


public class Control_FRM_MenuPrincipal implements ActionListener{
    
    FRM_MantenimientoEstudiante mantenimientoEstudiante;
    FRM_MantenimientoCursos mantenimientoCursos;
    
     public Control_FRM_MenuPrincipal()
    {
        mantenimientoEstudiante=  new FRM_MantenimientoEstudiante();
        mantenimientoCursos= new FRM_MantenimientoCursos();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Salir")){
            System.exit(0);
        }
         if(e.getActionCommand().equals("Registro Estudiantes")){
            this.mantenimientoEstudiante.setVisible(true);
        }
           if(e.getActionCommand().equals("Registro Cursos")){
            this.mantenimientoCursos.setVisible(true);
        }
    }
}
