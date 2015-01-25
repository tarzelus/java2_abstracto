import java.util.Scanner;


class Main {
public static void main(String argumentos[]) {
	
	Scanner sc = new Scanner(System.in);
	String nombre, raza="";
	int patas;
	
	System.out.print("\nintroduce el Nombre del animal: ");
    nombre = sc.nextLine();
    System.out.print("\nintroduce el numero de patas del animal: ");
    patas = sc.nextInt();
    
	Perro toby = new Perro(nombre,patas,raza);

System.out.println();
toby.habla();
}
}