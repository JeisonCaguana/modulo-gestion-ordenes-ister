/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codigovago.modelo.accesoDatos;

import com.codigovago.modelo.Empleado;
import com.codigovago.modelo.Usuario; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Empleados extends Conexion{
    
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    Connection conexion = getConexion();
    
    
    
    public boolean registrarEmpleado( Empleado empleado ) {
        String query = "INSERT INTO empleado (codigo_emp,id_emp,nombres_emp,apellido_emp,telefono_emp,direccion_emp,correo_emp,cargo_emp) VALUES(?,?,?,?,?,?,?,?);";
        try {
            ps = conexion.prepareStatement( query );
            ps.setInt(1, empleado.getCodigo_emp());
            ps.setString( 2, empleado.getId_emp()); 
            ps.setString( 3, empleado.getNombres_emp()); 
            ps.setString( 4, empleado.getApellido_emp()); 
            ps.setString( 5, empleado.getTelefono_emp()); 
            ps.setString( 6, empleado.getDireccion_emp()); 
            ps.setString( 7, empleado.getCorreo_emp()); 
            ps.setString( 8, empleado.getCargo_emp());
            ps.execute();
            registroUsuario( empleado );
            return true;
        } catch (SQLException evt) {
            System.out.println( evt.toString() );
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException evt) {
                System.out.println( evt.toString() );
            }
        }
    }    
    public boolean registroUsuario( Empleado empleado ){
        String query = "INSERT INTO usuario (id_uss,usuario_uss,cargo_emp) VALUES(?,?,?);";
        
            String usuario_uss="";
            char buf[] = new char[1];         
            
            usuario_uss+=empleado.getNombres_emp().charAt(0);
            StringTokenizer nuevoUsuario=  new StringTokenizer(empleado.getApellido_emp());
            while (nuevoUsuario.hasMoreElements()){
                usuario_uss+= nuevoUsuario.nextElement();
                break;
            }
            usuario_uss+=empleado.getCodigo_emp();
            //md5
        try {
            ps = conexion.prepareStatement( query );
            ps.setInt(1, empleado.getCodigo_emp());
            ps.setString( 2, usuario_uss.toLowerCase()); 
            ps.setString( 3, empleado.getCargo_emp());
            ps.execute();
            return true;
        } catch (SQLException evt) {
            System.out.println( evt.toString() );
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException evt) {
                System.out.println( evt.toString() );
            }
        } 
    }
    public boolean actualizarEmpleado( Empleado empleado ) {
        String query = "UPDATE empleado SET nombres_emp='"+empleado.getNombres_emp()+"',apellido_emp='"+empleado.getApellido_emp()+"',telefono_emp='"+empleado.getTelefono_emp()+"',direccion_emp='"+empleado.getDireccion_emp()+"',correo_emp='"+empleado.getCorreo_emp()+"' WHERE id_emp='"+empleado.getId_emp()+"';";
        try {
            ps = conexion.prepareStatement( query );
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println( e.toString() );
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println( e.toString() );
            }
        }
    } 
    public boolean actualizarClave( Usuario usuario ){
        String query = "UPDATE usuario SET clave_uss='"+usuario.getClave_uss()+"' WHERE usuario_uss='"+usuario.getUsuario_uss()+"';";
        
        try {
            ps = conexion.prepareStatement( query ); 
            ps.execute();
            return true;
        } catch (SQLException evt) {
            System.out.println( evt.toString() );
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException evt) {
                System.out.println( evt.toString() );
            }
        } 
    }
    public boolean infoPerfil( Empleado empleado ){ 
        String query = "SELECT nombres_emp,apellido_emp,telefono_emp,direccion_emp,correo_emp,cargo_emp FROM empleado WHERE id_emp = ? LIMIT 1;";
        try { 
            ps = conexion.prepareStatement( query );
            ps.setString( 1, empleado.getId_emp());
            rs = ps.executeQuery();
            
            if ( rs.next() ) {
                if ( empleado.getId_emp().equals(rs.getString( 1 ))) {
                    empleado.getId_emp( rs.getString(1) ); 
                    empleado.setNombres_emp(rs.getString(2) ); 
                    empleado.setApellido_emp(rs.getString(3) ); 
                    empleado.setTelefono_emp(rs.getString(4) ); 
                    empleado.setDireccion_emp(rs.getString(5) ); 
                    empleado.setCorreo_emp(rs.getString(6) ); 
                    empleado.setCargo_emp(rs.getString(7) ); 

                return true;
                } else { 
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println( ex.toString() ); 
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println( e.toString() );
            }
        }
        return false;
    }
}
