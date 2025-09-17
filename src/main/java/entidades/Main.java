package entidades;

import java.util.Scanner;
import entidades.Facade.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear los objetos base
        Carrito carrito = new Carrito();
        Pago pago = new Pago();       // Suponiendo que tu clase Pago tiene un constructor sin args
        Envio envio = new Envio();    // Igual acá

        // Creamos la fachada
        TiendaFacade tienda = new TiendaFacade(carrito, pago, envio);

        // Flujo de la tienda
        tienda.gestionarProd(scanner);  // 1) Añadir productos
        tienda.procesarPago();          // 2) Procesar el pago
        tienda.coordEntrega();          // 3) Coordinar el envío

        scanner.close();
    }
}