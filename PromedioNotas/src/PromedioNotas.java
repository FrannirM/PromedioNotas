import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Notas ***");

        //Defino Scanner
        var consola = new Scanner(System.in);

        //Defino largo de arreglo
        System.out.print("Cuantas calificaciones desea agregar? ");
        var cantidadNotas = Integer.parseInt(consola.nextLine());

        //Creo arreglo
        var notas = new int[cantidadNotas];

        //Agrego notas al arreglo
        for (var i = 0; i < cantidadNotas; i++) {
            System.out.print("Nota: " + i + ": ");
            notas[i] = Integer.parseInt(consola.nextLine());

        }

        //Saco promedio
        var res = 0.0;
        for (var i = 0; i < cantidadNotas; i++) {
            res = res + notas[i];
        }
        res = res / cantidadNotas;
        System.out.println("El promedio es de : " + res);
    }
}
