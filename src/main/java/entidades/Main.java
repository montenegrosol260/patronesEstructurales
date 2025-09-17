package entidades;

import java.util.Scanner;
import entidades.Facade.*;
import entidades.Proxy.ArchivoProxy;

public class Main {
    public static void main(String[] args) {

//        //FACADE
//        Scanner scanner = new Scanner(System.in);
//
//        // Crear los objetos base
//        Carrito carrito = new Carrito();
//        Pago pago = new Pago();       // Suponiendo que tu clase Pago tiene un constructor sin args
//        Envio envio = new Envio();    // Igual acá
//
//        // Creamos la fachada
//        TiendaFacade tienda = new TiendaFacade(carrito, pago, envio);
//
//        // Flujo de la tienda
//        tienda.gestionarProd(scanner);  // 1) Añadir productos
//        tienda.procesarPago();          // 2) Procesar el pago
//        tienda.coordEntrega();          // 3) Coordinar el envío

//        scanner.close();

        //PROXY
        ArchivoProxy controlAcceso = new ArchivoProxy("archivo.txt");
        controlAcceso.agregarUsuarioAutorizado("Alberto");
        controlAcceso.agregarUsuarioAutorizado("Marta");

        controlAcceso.abrir("Sol");
        controlAcceso.abrir("Marta");

    }
}