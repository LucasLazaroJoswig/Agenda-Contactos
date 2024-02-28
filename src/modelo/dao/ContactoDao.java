package modelo.dao;
import java.util.ArrayList;

import modelo.javabean.Contacto;

public interface ContactoDao {
    boolean altaContacto(Contacto contacto);
    boolean eliminarContacto(Contacto contacto);
    boolean eliminarContacto(String nombre);
    Contacto buscarUno(String nombre);
    Contacto buscarTelefono(String telefono);
    Contacto buscarEmail(String email);
    ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);
    boolean cambiarDatos(Contacto contacto);
    ArrayList<Contacto> contactosPorEmpresa(String empresa);
}
