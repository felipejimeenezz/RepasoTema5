package Tema5;

public class TiendaMascotas {
    int numeroMascotas;
    Mascota[] inventario;

    public TiendaMascotas() {
        this.inventario = new Mascota[100];
        numeroMascotas = 0;
    }

    public void agregarMascota (String nombre, int edad, String tipoAnimal) {

        Mascota mascota = new Mascota (nombre, edad, tipoAnimal);

        inventario[numeroMascotas] = mascota; //AÑADIR MASCOTA AL ARRAY

        numeroMascotas++;

        System.out.println("Se ha añadido la mascota " +nombre);
    }

    public void venderMascota (String nombre) {

        for (int i = 0; i < numeroMascotas; i++) {
            //GETNOMBRE POR EL GETTER DE MASCOTA
            //.EQUALS ES IGUAL QUE == PORQUE EL IDE TE LO RECOMIENDA
            if (inventario[i].getNombre().equals(nombre)) {
                System.out.println("La mascota " +inventario[i].getNombre()+ " se ha vendido.");
                inventario[i] = null; //PARA QUITARLO DEL ARRAY

                //PASAR LAS MASCOTAS HACIA LA IZQUIERDA
                for (int j = i; j < numeroMascotas; j++) {
                    inventario[j] = inventario[j + 1];
                }
                numeroMascotas--;
                break;
            }
        }
    }

    public void mostrarInventario () {
        System.out.println("Hay " +numeroMascotas+ " mascotas:");
        for (int i = 0; i < numeroMascotas; i++) {
            System.out.println(inventario[i].getNombre()+ ", " +inventario[i].getEdad()+ ", " +inventario[i].getTipoAnimal());
        }
    }

    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();

        tienda.agregarMascota("Alex", 9, "perro");
        tienda.agregarMascota("Max", 2, "gato");
        tienda.agregarMascota("Perry", 8, "ornitorrinco");

        tienda.venderMascota("Max");

        tienda.mostrarInventario();
    }
}
