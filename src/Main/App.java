
package Main;

import Gestores.GestorCompra;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("******** MENU DE OPCIONES ********");
            System.out.println("1. Iniciar pedido");
            System.out.println("2. Ver pedidos");
            System.out.println("3. Recojo del Pedido");
            System.out.println("0. Cerrar");
            System.out.println("**********************************");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = usuario.nextInt();
            usuario.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("");
                    GestorCompra.gestionarCompra(usuario);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    GestorCompra.verPedidosRegistrados();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    GestorCompra.gestionarRecojo(usuario);
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 0);
    }
}
