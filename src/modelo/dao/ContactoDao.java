package modelo.dao;
import java.util.ArrayList;

import modelo.javabean.Contacto;

public interface ContactoDao {
    /**
     * Registra un nuevo contacto en la agenda
     * @param contacto el contacto añadido
     * @return True cuando el contacto no coincide con uno que existe donde devuelve falso
     */
    boolean altaContacto(Contacto contacto);
    /**
     * Elimina un contacto de la agenda
     * @param contacto el contacto eliminado
     * @return True si se elimino correctamente o false si no se elimino
     */

    boolean eliminarContacto(Contacto contacto);
    /**
     * Elimina el contacto solo mediante su nombre
     * @param nombre el contacto eliminado
     * @return true si se elimino y false si no
     */

    boolean eliminarContacto(String nombre);

    /**
     * Busca un contacto por su nombre
     * @param nombre el contacto encontrado
     * @return el contacto encontrado o null si no se encontro
     */

    Contacto buscarUno(String nombre);

    /**
     * Busca un contacto por su numero de telefono
     * @param telefono el telefono del contacto
     * @return El contacto que coincida o null si ninguno coincide
     */
    Contacto buscarTelefono(String telefono);

    /**
     * Busca un contacto por su email
     * @param email el email del contacto
     * @return El contacto que coincida o null si ninguno coincide
     */
    Contacto buscarEmail(String email);

    /**
     * busca un contacto por las tres primeras letras de su nombre
     * @param nombre las tres primeras letras
     * @return El contacto que coincida o null si ninguno coincide
     */
    ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);

    /**
     * Cambia los datos de un contacto
     * @param contacto Los datos a cambiar del contacto
     * @return true si se pudo cambiar o false si no
     */
    boolean cambiarDatos(Contacto contacto);

    /**
     * busca un contacto basado en la empresa en la que trabaja
     * @param empresa la empresa a buscar
     * @return El contacto que coincida o null si ninguno coincide
     */
    ArrayList<Contacto> contactosPorEmpresa(String empresa);
}
