/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libcode.webapp.controladores;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;
import libcode.webapp.entidades.Alumno;
import libcode.webapp.negocio.DataService;

/**
 *
 * @author pc
 */
@Named
@RequestScoped
public class indexController {
    List<Alumno> alumnosList = new ArrayList<>();
    
    private Alumno alumno = new Alumno();
    
    @EJB DataService servicio;
    
    @PostConstruct
    public void cargarAlumnos(){
        alumnosList= servicio.getAlumnos();
    }

    public List<Alumno> getAlumnosList() {
        return alumnosList;
    }

    public void setAlumnosList(List<Alumno> alumnosList) {
        this.alumnosList = alumnosList;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    
    
}
