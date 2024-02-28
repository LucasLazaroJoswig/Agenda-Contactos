package testing;

import java.util.ArrayList;

import modelo.dao.AgendaContactosDaoImplArrayList;
import modelo.javabean.Contacto;

public class CrearAgenda {
    public static void main(String[] args) {
        /**
         * Se crea la agenda principal con nombre mi agenda
         */
        AgendaContactosDaoImplArrayList agenda = new AgendaContactosDaoImplArrayList("","Mi agenda");
/**
 * Se añaden tres contactos a la agenda
 */
        agenda.altaContacto(new Contacto("Lukas", "Lazaro", "663803225", "lukas@email.com", "IFP"));
        agenda.altaContacto(new Contacto("Domenico", "Alberico", "683482119", "domenico@email.com", "IFP"));
        agenda.altaContacto(new Contacto("Eduardo", "Gomez", "657889123", "eduardo@email.com", "IFP"));
/**
 * Testeamos el metodo buscarUno y printeamos su resultado
 */
        Contacto contacto = agenda.buscarUno("Lukas");
        System.out.println(contacto);
/**
 * Testeamos el metodo buscarContactosPorTresPrimeros y printeamos su resultado
 */
        ArrayList<Contacto> encontrados = agenda.buscarContactosPorTresPrimeros("Dom");
        for (Contacto c : encontrados) {
            System.out.println(c);
        }
        /**
         * Testeamos el metodo cambiarDatos y comprobamos su resultado
         */
        agenda.cambiarDatos(new Contacto("Lukas", "Lazaro Joswig", "663803225", "lukas@gmail.com", "IFP"));
        Contacto contacto1 = agenda.buscarUno("Lukas");
        System.out.println(contacto1);
/**
 * Testeamos el metodo buscarEmail y printeamos su resultado
 */
        Contacto contacto2 = agenda.buscarEmail("eduardo@gmail.com");
        System.out.println(contacto2);
/**
 * Testeamos el metodo buscarTelefono y printeamos su resultado
 */

        Contacto contacto3 = agenda.buscarTelefono("663803225");
        System.out.println(contacto3);


/**
 * Testeamos el metodo eliminarContacto y comprobamos su resultado
 */
        agenda.eliminarContacto(new Contacto("Eduardo", "Gomez", "657889123", "eduardi@email.com", "IFP"));

        ArrayList<Contacto> encontrados2 = agenda.buscarContactosPorTresPrimeros("Edu");
        for (Contacto f : encontrados2) {
            System.out.println(f);
        }
        /**
         * Testeamos el metodo eliminarContacto por nombre y comprobamos su resultado
         */
        agenda.eliminarContacto("Domenico");
        Contacto contacto4 = agenda.buscarEmail("domenico@gmail.com");
        System.out.println(contacto4);
/**
 * Testeamos el metodo contactosPorEmpresa y comprobamos su resultado
 */
        ArrayList<Contacto> encontrados1 = agenda.contactosPorEmpresa("IFP");
        for (Contacto c : encontrados1) {
            System.out.println(c);

        }
    }
}