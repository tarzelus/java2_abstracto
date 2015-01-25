abstract class Animales {
String nombre;
int patas;
public Animales(String n, int p) {
nombre=n;
patas=p;
}
    abstract void habla();
               // método abstracto que debe ser redefinido por las subclases
}