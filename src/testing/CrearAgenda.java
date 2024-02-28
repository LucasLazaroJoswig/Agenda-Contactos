package testing;

import java.util.ArrayList;

import modelo.dao.AgendaContactosDaoImplArrayList;
import modelo.javabean.Contacto;

public class CrearAgenda {
    public static void main(String[] args) {
        AgendaContactosDaoImplArrayList agenda = new AgendaContactosDaoImplArrayList("","Mi agenda");

        agenda.altaContacto(new Contacto("Lukas", "Lazaro", "663803225", "lukas@email.com", "IFP"));
        agenda.altaContacto(new Contacto("Domenico", "Alberico", "683482119", "domenico@email.com", "IFP"));
        agenda.altaContacto(new Contacto("Eduardo", "Gomez", "657889123", "eduardo@email.com", "IFP"));

        Contacto contacto = agenda.buscarUno("Lukas");
        System.out.println(contacto);

        ArrayList<Contacto> encontrados = agenda.buscarContactosPorTresPrimeros("Dom");
        for (Contacto c : encontrados) {
            System.out.println(c);
        }
        agenda.cambiarDatos(new Contacto("Lukas", "Lazaro Joswig", "663803225", "lukas@gmail.com", "IFP"));
        Contacto contacto1 = agenda.buscarUno("Lukas");
        System.out.println(contacto1);

        Contacto contacto2 = agenda.buscarEmail("eduardio@gmail.com");
        System.out.println(contacto2);


        Contacto contacto3 = agenda.buscarTelefono("663803225");
        System.out.println(contacto3);



        agenda.eliminarContacto(new Contacto("Eduardo", "Gomez", "657889123", "eduardi@email.com", "IFP"));

        ArrayList<Contacto> encontrados2 = agenda.buscarContactosPorTresPrimeros("Edu");
        for (Contacto f : encontrados2) {
            System.out.println(f);
        }
        agenda.eliminarContacto("Domenico");
        Contacto contacto4 = agenda.buscarEmail("domenico@gmail.com");
        System.out.println(contacto4);

        ArrayList<Contacto> encontrados1 = agenda.contactosPorEmpresa("IFP");
        for (Contacto c : encontrados1) {
            System.out.println(c);

        }
    }
}