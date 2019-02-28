/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.modelo;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Empleado {
    private int codigo_emp;
    private String id_emp;
    private String nombres_emp;
    private String apellido_emp;
    private String telefono_emp;
    private String direccion_emp;
    private String correo_emp;
    private String cargo_emp;

    public Empleado(int codigo_emp, String id_emp, String nombres_emp, String apellido_emp, String telefono_emp, String direccion_emp, String correo_emp, String cargo_emp) {
        this.codigo_emp = codigo_emp;
        this.id_emp = id_emp;
        this.nombres_emp = nombres_emp;
        this.apellido_emp = apellido_emp;
        this.telefono_emp = telefono_emp;
        this.direccion_emp = direccion_emp;
        this.correo_emp = correo_emp;
        this.cargo_emp = cargo_emp;
    }
    public Empleado(String id_emp, String nombres_emp, String apellido_emp, String telefono_emp, String direccion_emp, String correo_emp, String cargo_emp) {
        this.id_emp = id_emp;
        this.nombres_emp = nombres_emp;
        this.apellido_emp = apellido_emp;
        this.telefono_emp = telefono_emp;
        this.direccion_emp = direccion_emp;
        this.correo_emp = correo_emp;
        this.cargo_emp = cargo_emp;
    }
    public Empleado(String correo_emp) {
        this.correo_emp = correo_emp; 
    }
    public void imprimir (Empleado empleado){ 
        System.out.println("CEDULA: "+empleado.getId_emp()); 
        System.out.println("NOMBRES: "+empleado.getNombres_emp()); 
        System.out.println("APELLIDOS: "+empleado.getApellido_emp()); 
        System.out.println("TELEFONO: "+empleado.getTelefono_emp()); 
        System.out.println("DIRECCION: "+empleado.getDireccion_emp()); 
        System.out.println("CORREO: "+empleado.getCorreo_emp());
        System.out.println("CARGO: "+empleado.getCargo_emp()); 

    }
    /**
     * @return the codigo_emp
     */
    public int getCodigo_emp() {
        return codigo_emp;
    }

    /**
     * @param codigo_emp the codigo_emp to set
     */
    public void setCodigo_emp(int codigo_emp) {
        this.codigo_emp = codigo_emp;
    }

    /**
     * @return the id_emp
     */
    public String getId_emp() {
        return id_emp;
    }

    /**
     * @param id_emp the id_emp to set
     */
    public void setId_emp(String id_emp) {
        this.id_emp = id_emp;
    }

    /**
     * @return the nombres_emp
     */
    public String getNombres_emp() {
        return nombres_emp;
    }

    /**
     * @param nombres_emp the nombres_emp to set
     */
    public void setNombres_emp(String nombres_emp) {
        this.nombres_emp = nombres_emp;
    }

    /**
     * @return the apellido_emp
     */
    public String getApellido_emp() {
        return apellido_emp;
    }

    /**
     * @param apellido_emp the apellido_emp to set
     */
    public void setApellido_emp(String apellido_emp) {
        this.apellido_emp = apellido_emp;
    }

    /**
     * @return the telefono_emp
     */
    public String getTelefono_emp() {
        return telefono_emp;
    }

    /**
     * @param telefono_emp the telefono_emp to set
     */
    public void setTelefono_emp(String telefono_emp) {
        this.telefono_emp = telefono_emp;
    }

    /**
     * @return the direccion_emp
     */
    public String getDireccion_emp() {
        return direccion_emp;
    }

    /**
     * @param direccion_emp the direccion_emp to set
     */
    public void setDireccion_emp(String direccion_emp) {
        this.direccion_emp = direccion_emp;
    }

    /**
     * @return the correo_emp
     */
    public String getCorreo_emp() {
        return correo_emp;
    }

    /**
     * @param correo_emp the correo_emp to set
     */
    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    /**
     * @return the cargo_emp
     */
    public String getCargo_emp() {
        return cargo_emp;
    }

    /**
     * @param cargo_emp the cargo_emp to set
     */
    public void setCargo_emp(String cargo_emp) {
        this.cargo_emp = cargo_emp;
    }

    public void getId_emp(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
