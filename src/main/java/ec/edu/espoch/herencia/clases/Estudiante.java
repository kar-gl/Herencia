/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia.clases;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Estudiante extends Persona {
    
 private String codigo;

    public Estudiante(String codigo, String nombre, String apellido, String cedula, String genero, int edad) {
        super(nombre, apellido, cedula, genero, edad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" + "codigo=" + codigo + '}';
    }
 
}
