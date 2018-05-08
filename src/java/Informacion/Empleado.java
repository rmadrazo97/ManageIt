package Informacion;
// Generated May 7, 2018 7:07:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idempleado;
     private String dpi;
     private String nombre;
     private String telefono;
     private String direccion;
     private String email;
     private Set<Factura> facturas = new HashSet<Factura>(0);
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Empleado() {
    }

	
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public Empleado(String dpi, String nombre, String telefono, String direccion, String email, Set<Factura> facturas, Set<Usuario> usuarios) {
       this.dpi = dpi;
       this.nombre = nombre;
       this.telefono = telefono;
       this.direccion = direccion;
       this.email = email;
       this.facturas = facturas;
       this.usuarios = usuarios;
    }
   
    public Integer getIdempleado() {
        return this.idempleado;
    }
    
    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }
    public String getDpi() {
        return this.dpi;
    }
    
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set<Factura> getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}

