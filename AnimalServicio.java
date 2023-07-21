
public class AnimalServicio implements IAnimalServicio {

    @Override
    public Animal GetValueAnimal() {

        Animal objeto = new Animal();

        objeto.Color = "Marron";
        objeto.Edad = 12;
        objeto.Especie = "Perro";
        objeto.Patas = 4;
        objeto.Genero = "Masculino";

        return objeto;
    }

}
