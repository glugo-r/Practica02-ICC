import java.util.Scanner;
import modulos.Usuario;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		
		String correo;
		while(true) {
			System.out.print("Ingrese su correo: ");
			correo = scanner.nextLine();
			if(isCorreoValido(correo)) {
				break;
			} 
			else {
				System.out.println("Correo inválido. Asegúrese de que contenga '@' y termiine en '.com'.");
			}
		}
		
		String rol = "";
		while(true) {
			System.out.println("Seleccione su rol:");
			System.out.println("1. Empleado");
			System.out.println("2. Administrador");
			System.out.print("Ingrese su opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();
			
			if(opcion == 1) {
				rol = "Empleado";
				break;
			}
			else if (opcion == 2){
				rol = "Administrador";
				break;
			}
			else {
				System.out.println("Opción inválida. Por favor seleccione una opción válida.");
			}
		}
		
		Usuario usuario = new Usuario(nombre, correo, rol);
		System.out.println("Usuario creado exitosamente.");
		System.out.println("Nombre: " + usuario.getNombre());
		System.out.println("Correo: " + usuario.getCorreo());
		System.out.println("Rol: " + usuario.getRol());
	}
	
	private static boolean isCorreoValido(String correo) {
		return correo.contains("@") && correo.endsWith(".com");
	}
}
				
