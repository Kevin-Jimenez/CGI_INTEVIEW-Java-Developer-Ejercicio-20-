/**
 * PROBLEMA: Diseñar un algoritmo que, dado el siguiente arrayElementos de datos:
 *          {2, 4, 5, 1, 6, 3, 9, 7, 8, 0}
 *          Permita el ordenamiento de dicho arrayElementos en orden ascendente.
 *
 *
 * **/
public class Main {
    public static void main(String[] args) {

        int[] arrayElementos = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};
        int auxiliar;

        /*Se comparan e intercambian elementos continuos al actual.*/
        for (int i = 0; i < arrayElementos.length - 1; i++) {
            for (int j = 0; j < arrayElementos.length - 1 - i; j++) {
                if (arrayElementos[j] > arrayElementos[j + 1]) {//elemento actual es mayor al siguiente
                    //Realizamos el intercambio apoyandonos de un auxiliar
                    auxiliar = arrayElementos[j];
                    arrayElementos[j] = arrayElementos[j + 1];
                    arrayElementos[j + 1] = auxiliar;
                }
            }
        }

        System.out.print("Ordenamiento ascendente: ");
        for(int arrayElemento : arrayElementos) {
            System.out.print(arrayElemento + " ");
        }

    }
}
