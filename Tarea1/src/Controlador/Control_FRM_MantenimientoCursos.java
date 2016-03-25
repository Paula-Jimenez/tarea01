/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCursos;
import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoCursos;
import Vista.FRM_MantenimientoEstudiante;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 *
 * @author PaulaJCh
 */
public class Control_FRM_MantenimientoCursos implements ActionListener{
    
    FRM_MantenimientoCursos mantenimientoCursos;
    MetodosCursos metodos;     

 public Control_FRM_MantenimientoCursos(FRM_MantenimientoCursos  mantenimientoCursos){
        this.mantenimientoCursos= mantenimientoCursos;
        metodos= new MetodosCursos();
    }
public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Consultar"))
        {
            mantenimientoCursos.mostrarInformacion(metodos.consultarCurso(mantenimientoCursos.devolverSiglas()));
        }
         if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarCurso(mantenimientoCursos.devolverInformacion());
            metodos.mostrarInformacionCursos();
        }
          if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarCurso(mantenimientoCursos.devolverInformacion());
        }
            if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarCurso(mantenimientoCursos.devolverInformacion());
        }
    }

}

