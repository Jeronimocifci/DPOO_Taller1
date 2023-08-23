package uniandes.dpoo.taller0.modificacion;

//Asumiendo que estas clases ya existen en tu proyecto y están en el lugar correcto
import java.io.FileNotFoundException;
import java.io.IOException;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos; // Puede que necesites ajustar este import dependiendo de la estructura exacta de tu proyecto
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas; // Ídem

public class Modificacion {

 public static void main(String[] args) {
     // Primeramente, imprime un saludo básico
     System.out.println("Hola, mundo!");

     // A continuación, intentamos cargar la información de los atletas
     try {
         CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
         System.out.println("Archivo cargado exitosamente.");
         System.out.println("El país con más medallistas es: " + calc.paisConMasMedallistas());
     } catch (FileNotFoundException e) {
         System.out.println("ERROR: El archivo indicado no se encontró.");
     } catch (IOException e) {
         System.out.println("ERROR: Hubo un problema leyendo el archivo.");
         System.out.println(e.getMessage());
     }
 }
}



