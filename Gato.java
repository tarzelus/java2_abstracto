import java.util.Scanner;

class Gato extends Animales {
// La clase perro es una subclase de la clase abstracta Animal
String años;
public Gato(String n, int p, int a) {
super(n,p);
años=a;
      }
public void habla() {
	// Este método es necesario redefinirlo para poder instanciar
	// objetos de la clase Perro
	Scanner sc = new Scanner(System.in);
	
	if (nombre.equalsIgnoreCase("gato")){
	System.out.println("Escribe los años del gato:");
	años = sc.nextLine();
    
    System.out.println("Me llamo "+nombre+": miau");
    System.out.println("tengo "+años+" años");
	}
    }
}