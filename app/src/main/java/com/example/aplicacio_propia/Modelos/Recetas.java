package com.example.aplicacio_propia.Modelos;

public class Recetas {

    private int idImagen;
    private String nomReceta;
    private String descripcion;
    private String ingredientes;

    public Recetas(int idImagen, String nomReceta) {
        this.idImagen = idImagen;
        this.nomReceta = nomReceta;
    }

    public Recetas(int idImagen, String nomReceta, String descripcion, String ingredientes) {
        this.idImagen = idImagen;
        this.nomReceta = nomReceta;
        this.descripcion = descripcion;
        this.ingredientes = ingredientes;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getNomReceta() {
        return nomReceta;
    }

    public void setNomReceta(String nomReceta) {
        this.nomReceta = nomReceta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
