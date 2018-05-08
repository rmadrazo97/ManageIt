package Informacion;
// Generated May 7, 2018 7:07:22 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Articulo generated by hbm2java
 */
public class Articulo  implements java.io.Serializable {


     private String idarticulo;
     private Proveedor proveedor;
     private String nombre;
     private String descripcion;
     private BigDecimal precio;
     private BigDecimal costo;
     private Set<Detallefactura> detallefacturas = new HashSet<Detallefactura>(0);
     private Set<Inventario> inventarios = new HashSet<Inventario>(0);

    public Articulo() {
    }

	
    public Articulo(String idarticulo) {
        this.idarticulo = idarticulo;
    }
    public Articulo(String idarticulo, Proveedor proveedor, String nombre, String descripcion, BigDecimal precio, BigDecimal costo, Set<Detallefactura> detallefacturas, Set<Inventario> inventarios) {
       this.idarticulo = idarticulo;
       this.proveedor = proveedor;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.precio = precio;
       this.costo = costo;
       this.detallefacturas = detallefacturas;
       this.inventarios = inventarios;
    }
   
    public String getIdarticulo() {
        return this.idarticulo;
    }
    
    public void setIdarticulo(String idarticulo) {
        this.idarticulo = idarticulo;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public BigDecimal getCosto() {
        return this.costo;
    }
    
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
    public Set<Detallefactura> getDetallefacturas() {
        return this.detallefacturas;
    }
    
    public void setDetallefacturas(Set<Detallefactura> detallefacturas) {
        this.detallefacturas = detallefacturas;
    }
    public Set<Inventario> getInventarios() {
        return this.inventarios;
    }
    
    public void setInventarios(Set<Inventario> inventarios) {
        this.inventarios = inventarios;
    }




}

