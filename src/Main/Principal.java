package Main;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import Vistas.Escritorio;
import java.time.LocalDate;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Escritorio menu= new Escritorio();
        menu.setVisible(true);

//        //prueba generar cuartel nuevo
//        Cuartel cuartel01 = new Cuartel("Cuartel: Los Polvorines", "San Martin 1234", 11352, 20153, "265245102", "polvorines@gmail.com", true);
//        CuartelData cuart1 = new CuartelData();
//        cuart1.GuardarCuartel(cuartel01);
//
//        Cuartel cuartel02 = new Cuartel("San Ignacio", "Sarmiento 210", 32055, 52010, "265213058", "sanignacio@gmail.com", true);
//        CuartelData cuart2 = new CuartelData();
//        cuart2.GuardarCuartel(cuartel02);
//
//        //prueba ver cuartel guardado
//        CuartelData cuart2 = new CuartelData();
//        Cuartel CuartelEncontrado = cuart2.BuscarCuartelPorId(2);
//
//        if (CuartelEncontrado != null) {
//            System.out.println("Cuartel Encontrado:");
//
//            System.out.println("ID: " + CuartelEncontrado.getId_cuartel());
//            System.out.println("Nombre: " + CuartelEncontrado.getNombre_cuartel());
//            System.out.println("Direccion: " + CuartelEncontrado.getDireccion());
//            System.err.println("Coordenada X: " + CuartelEncontrado.getCoord_X());
//            System.err.println("Coordenada Y: " + CuartelEncontrado.getCoord_Y());
//            System.out.println("Telefono: " + CuartelEncontrado.getTelefono());
//            System.out.println("Correo: " + CuartelEncontrado.getCorreo());
//
//        } else {
//            System.out.println("No se encontró el Cuartel. ");
//
//        }
//        //prueba modificar cuartel
//        CuartelData xx = new CuartelData();
//        Cuartel cuartel = new Cuartel();
//
//        cuartel.setNombre_cuartel("Cuartel Los Polvorines");
//        cuartel.setDireccion("San Martin 1234");
//        cuartel.setCoord_X(11352);
//        cuartel.setCoord_Y(20153);
//        cuartel.setTelefono("266614788");//modifique el numero de telefono
//        cuartel.setCorreo("polvorines@gmail.com");
//        cuartel.setEstado(true);
//        cuartel.setId_cuartel(1);
//
//        xx.ModificarCuartel(cuartel);
//        //listar cuateles
//        CuartelData cuartel = new CuartelData();
//        List<Cuartel> ListarCuarteles = cuartel.ListarCuarteles();
//
//        if (!ListarCuarteles.isEmpty()) {
//            System.out.println("Lista de Cuarteles:");
//
//            for (Cuartel cuarteles : ListarCuarteles) {
//                System.out.println("ID: " + cuarteles.getId_cuartel());
//                System.out.println("Nombre: " + cuarteles.getNombre_cuartel());
//                System.out.println("Direccion: " + cuarteles.getDireccion());
//                System.out.println("Coordenada X: " + cuarteles.getCoord_X());
//                System.out.println("Coordenada Y: " + cuarteles.getCoord_Y());
//                System.out.println("Telefono: " + cuarteles.getTelefono());
//                System.out.println("Correo: " + cuarteles.getCorreo());
//                System.out.println("Estado: " + cuarteles.isEstado());
//                System.out.println("*************************************");
//            }
//
//        } else {
//            System.out.println("No hay Cuarteles en la lista.");
//        }
//    
//        //crear bombero
//        Bombero xx = new Bombero();
//        BomberoData bomb = new BomberoData();
//        BrigadaData brigiData = new BrigadaData();
//
//        Brigada brig = brigiData.BuscarBrigada(1);
//
//        xx.setNombre("Mateo");
//        xx.setApellido("Sbodio");
//        xx.setFecha_nacimiento(LocalDate.of(1990, 5, 15));
//        xx.setGrupo_sanguineo("B+ ");
//        xx.setDni(232123211);
//        xx.setBrigada(brig);
//        xx.setCelular("223131223");
//        xx.setEstado(true);
//        xx.setId_bombero(1);
//
//        bomb.GuardarBombero(xx);
//
//        //buscar bombero por dni
//        BomberoData bombi = new BomberoData();
//        Bombero BomberoEncontrado = bombi.BuscarBomberoPorDni("232123211");
//
//        if (BomberoEncontrado != null) {
//            System.out.println("Personal encontrado:");
//
//            System.out.println("ID: " + BomberoEncontrado.getId_bombero());
//            System.out.println("Nombre: " + BomberoEncontrado.getNombre());
//            System.out.println("Apellido: " + BomberoEncontrado.getApellido());
//            System.out.println("DNI: " + BomberoEncontrado.getDni());
//            System.out.println("Fecha de Nacimiento: " + BomberoEncontrado.getFecha_nacimiento());
//            System.out.println("Grupo Sanguineo: " + BomberoEncontrado.getGrupo_sanguineo());
//
//            Brigada brigada = BomberoEncontrado.getBrigada();
//            System.out.println("Codigo de Brigada: " + brigada.getId_brigada());
//
//            System.out.println("Celular: " + BomberoEncontrado.getCelular());
//            System.out.println("Estado: " + BomberoEncontrado.isEstado());
//
//        } else {
//            System.out.println("No se encontró el bombero. ");       
//        }

    }
}