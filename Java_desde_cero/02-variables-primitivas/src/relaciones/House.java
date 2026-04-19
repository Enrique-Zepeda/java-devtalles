package relaciones;

public class House {
    // COMPOSICIÓN (Relación Fuerte - "Es parte de")
    // Si la instancia de 'House' se destruye, sus 'Room' y 'Door' también desaparecen.
    // La vida de estos objetos está ligada al ciclo de vida de la casa.
    private Room room;
    private Door door;

    // ASOCIACIÓN / AGREGACIÓN (Relación Débil - "Tiene un")
    // El 'Owner' existe independientemente de la 'House'.
    // Si la casa se demuele, el propietario sigue existiendo en el sistema.
    private Owner owner;

    public House(Room room, Owner owner, Door door) {
        this.room = room;
        this.owner = owner;
        this.door = door;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}