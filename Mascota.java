package Tema5;

public class Mascota {
    private String nombre;
    private int edad;
    private String tipoAnimal;

    public Mascota (String nombre, int edad, String tipoAnimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
    }

    //PARA OBTENER EL ATRIBUTO Y PODER USARLO EN OTRO LADO YA QUE ES PRIVADO
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }
}
