import java.util.Scanner;
/**
 * Este programa sirve para hallar el promedio de un conjunto de números además el número mínimo y máximo. 
 * 
 * @autores Jeimmy Solandry Naranjo - Santiago Velasquez - Mario Dorado 
 * @version (a version number or a date)
 */
public class Ej1
{
    public static void main(String[] args)
    {
        //Iniciamos definiendo las variables y pidiendo acceso al teclado. 
        int promedio = 0;
        Scanner teclado = new Scanner(System.in);
        //Luego le pedimos al usuario que indique la cantidad de valores. 
        System.out.print("Indique la cantidad de numeros a trabajar: ");
        int n = teclado.nextInt();
        int valor [] = new int [n];
        for (int i = 0; i < valor.length; ++i)
        {
            System.out.print("Ingrese un valor: ");  //Luego le pedimos al usuario que indique los valores. 
            valor [i] = teclado.nextInt();
            if (i >= 0)
            {
                promedio = (promedio + valor [i]);  //Hacemos la suma de todos los valores para después hallar el promedio. 
            }
        }
        //Definimos las variables para el calcular el número menor y mayor. 
        int mayor, menor;
        mayor = menor = valor [0];
        //Calculamos el número menor y mayor. 
        for (int i = 0; i < valor.length; i++)
        {
           if (valor [i] < menor)
            {
                menor = valor [i];
            } 
           if (valor [i] > mayor)
           {
                mayor = valor [i];
           }
        }
        //Calculamos el promedio con la suma de los valores dividido la cantidad de valores. 
        promedio = promedio / n;
        //Mostramos los resultados .
        System.out.println("El valor menor de todos los números es:  " + menor);
        System.out.println("El valor mayor de todos los número es: " + mayor);
        System.out.println("El promedio de todos los valores es: " + promedio);
    }
}