package com.josp.activities;

public class Datos {
    private String nombre;
    private String telefono;
    private String email;
    private String descripcion;
    private String nacimiento;

    public Datos(String nombre, String telefono, String email, String descripcion, String nacimiento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.descripcion = descripcion;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
}
