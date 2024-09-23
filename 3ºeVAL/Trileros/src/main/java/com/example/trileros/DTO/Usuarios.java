package com.example.trileros.DTO;

public class Usuarios {

//    private String nombre;
//    private String apellido;
    private String usuario;
    private Integer aciertos;
    private Integer errores;

    public Usuarios(/*String nombre, String apellido,*/ String usuario, Integer aciertos, Integer errores) {
//       setNombre(nombre);
//       setApellido(apellido);
       setUsuario(usuario);
       setAciertos(aciertos);
       setErrores(errores);
    }

//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getAciertos() {
        return aciertos;
    }

    public void setAciertos(Integer aciertos) {
        this.aciertos = aciertos;
    }

    public Integer getErrores() {
        return errores;
    }

    public void setErrores(Integer errores) {
        this.errores = errores;
    }
}
