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

/**
 *
 * @author Jeison / Código Vago - www.codigovago.com 
 */
public class Login extends Conexion{
    static CorreoElectronico correo = new CorreoElectronico();
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    Connection conexion = getConexion();
    
    public boolean buscarUsuario( Usuario usuario ){ 
        String query = "SELECT usuario_uss,clave_uss,cargo_emp FROM usuario WHERE usuario_uss = ? LIMIT 1;";
        try { 
            ps = conexion.prepareStatement( query );
            ps.setString( 1, usuario.getUsuario_uss());
            rs = ps.executeQuery();
            
            if ( rs.next() ) {
                if ( usuario.getUsuario_uss().equals(rs.getString( 1 ))) {
                    usuario.setUsuario_uss(rs.getString(2) );
                    usuario.setClave_uss(rs.getString(2) );
                    usuario.setCargo_emp(rs.getString(3));
                    rolesUsuario( usuario );
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
                System.out.println("Datos no encontrados");

            } catch (SQLException e) {
                System.out.println( e.toString() );
            }
        }
        return false;
    }
    public void rolesUsuario( Usuario usuario ){
        switch (usuario.getCargo_emp()){
            case "mesero":      System.out.println("Es mesero");        break;
            case "chef":        System.out.println("Es chef");          break;
            default:            System.out.println("Opción defaul");    break; 
        }
    }
    public boolean recuperarClave( Empleado empleado ){
       String query = "SELECT correo_emp FROM empleado WHERE correo_emp = ? LIMIT 1;";
        try { 
            ps = conexion.prepareStatement( query );
            ps.setString( 1, empleado.getCorreo_emp());
            rs = ps.executeQuery();
            
            if ( rs.next() ) {
                if ( empleado.getCorreo_emp().equals(rs.getString( 1 ))) {
                     correo.setCorreo( empleado );
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
