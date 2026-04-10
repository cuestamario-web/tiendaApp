import service.UsuarioService;
import service.ProductoService;
import model.Usuario;
import model.Producto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioService us = new UsuarioService();
        ProductoService ps = new ProductoService();

        while (true) {
            System.out.println("\n1. Crear Usuario");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Crear Producto");
            System.out.println("4. Listar Productos");
            System.out.println("0. Salir");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    us.crearUsuario(new Usuario(id, nom, email));
                    break;

                case 2:
                    us.listar().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("ID: ");
                    int pid = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String pnom = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    ps.crear(new Producto(pid, pnom, precio));
                    break;

                case 4:
                    ps.listar().forEach(System.out::println);
                    break;

                case 0:
                    return;
            }
        }
    }
}