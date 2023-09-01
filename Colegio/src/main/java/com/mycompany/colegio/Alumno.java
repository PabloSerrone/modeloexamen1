/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colegio;

/**
 *
 * @author Pablo
 */
public class Alumno {
    
    private String nombre, apellido;
    private int asistencias, faltas;
    private float nota1, nota2;
    
    public Alumno()
    {
    nombre = "";
    apellido = "";
    asistencias = 0;
    faltas = 0;
    nota1 = 0.0f;
    nota2 = 0.0f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    public float calcularPromedio()
    {
        float promedio;
        promedio = (nota1 + nota2) / 2;
        return promedio;
        
    }
    
    public int CalcularPorcentajeAsistencias ()
    {
        int PorcentajeAsistencias;
       
        PorcentajeAsistencias = (asistencias+faltas)*asistencias/100;
        
        return PorcentajeAsistencias;
    }
 
    public String indicarEstadoAcademico()
    {
        String repuesta;
        if (calcularPromedio() >=6 && CalcularPorcentajeAsistencias() >= 70)
                {
                    repuesta = "Aprobado";
                }
        else         
                {
                    repuesta = "desaprobado";
                }
        return repuesta;
    
    }
    
    
    
    
}
