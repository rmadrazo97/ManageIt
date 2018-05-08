package Informacion;
// Generated May 7, 2018 7:07:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private Integer idrol;
     private String nombre;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Rol() {
    }

	
    public Rol(String nombre) {
        this.nombre = nombre;
    }
    public Rol(String nombre, Set<Usuario> usuarios) {
       this.nombre = nombre;
       this.usuarios = usuarios;
    }
   
    public Integer getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


