package com.example.autocine_arnolds.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "proximamente")
public class Proximamente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String imagen;

    @Column(length = 1200)
    private String descripcion;

    private Double precio;
    private String director;
    private String iframe_url;
    private String duracion;
    private String fecha_estreno;
    private String genero;

    public Proximamente() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIframe_url() {
        return iframe_url;
    }

    public void setIframe_url(String iframe_url) {
        this.iframe_url = iframe_url;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Proximamente [id=" + id + ", titulo=" + titulo + ", imagen=" + imagen + ", descripcion=" + descripcion
                + ", precio=" + precio + ", director=" + director + ", iframe_url=" + iframe_url + ", duracion="
                + duracion + ", fecha_estreno=" + fecha_estreno + ", genero=" + genero + "]";
    }
}
