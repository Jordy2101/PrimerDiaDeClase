



public class ClasePrincipal{

    public static void main(String[] args){


        AnimalServicio servicio = new AnimalServicio();

        var resultado = servicio.GetValueAnimal();

        System.out.println("El animal " + resultado.Especie + " es del genero " + resultado.Genero + " tiene edad de " + resultado.Edad);
   

        //  AnimalServicio servicio = new AnimalServicio();
   
    }


}