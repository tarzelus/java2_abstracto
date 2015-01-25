import java.util.Scanner;

class Perro extends Animales {
// La clase perro es una subclase de la clase abstracta Animal
String raza;
public Perro(String n, int p, String r) {
super(n,p);
raza=r;
      }
public void habla() {
	// Este método es necesario redefinirlo para poder instanciar
	// objetos de la clase Perro
	Scanner sc = new Scanner(System.in);
	
	if (nombre.equalsIgnoreCase("perro")){
	System.out.println("Escribe el nobre de la raza:");
	raza = sc.nextLine();
    
    System.out.println("Me llamo "+nombre+": GUAU, GUAU");
    System.out.println("mi raza es "+raza);
	}
    }
}