package org.example.login.DTO;

public class Usuario {

    private Integer id;
    private String nombre;
    private String apellidos;
    private String usuerName;
    private String pass;


    public Usuario(Integer id, String nombre, String apellidos, String usuerName, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuerName = usuerName;
        this.pass = pass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsuerName() {
        return usuerName;
    }

    public void setUsuerName(String usuerName) {
        this.usuerName = usuerName;
    }
}