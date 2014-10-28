package Modelo;
// Generated 10-27-2014 07:00:47 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private int idcategoria;
     private String nombre;
     private String descripcion;
     private Set productos = new HashSet(0);

    public Categoria() {
    }
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Categoria(int idcategoria, String nombre, String descripcion) {
        this.idcategoria = idcategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Categoria(int idcategoria, String nombre, String descripcion, Set productos) {
       this.idcategoria = idcategoria;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.productos = productos;
    }
   
    public int getIdcategoria() {
        return this.idcategoria;
    }
    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
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
    
    public Set getProductos() {
        return this.productos;
    }
    public void setProductos(Set productos) {
        this.productos = productos;
    }

    public void crearProducto(String nombre, String Descripcion, Categoria categoria){
    
    }
    
    public void removeProducto(int idProducto){
    
    }
    
    public void modificarProducto(int idProducto, String nombreProducto, String descripcion, Categoria categoria){
    
    }
    
    public boolean esIgual(String nombre){
        return nombre == this.nombre;
    }

}


