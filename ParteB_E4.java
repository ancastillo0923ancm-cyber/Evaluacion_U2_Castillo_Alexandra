import java.util.Scanner;
public class ParteB_E4 {
    

    static int leerMinutos(Scanner sc) {
        int minutos;
        do {
            System.out.print("Minutos (1-1440): ");
            minutos = sc.nextInt();
        } while (minutos < 1 || minutos > 1440);
        return minutos;
    }

    static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;
    }

    static double tarifa(int horas, char tipo) {
        double precio = (Character.toUpperCase(tipo) == 'A') ? 1.00 : 0.50;
        double total = horas * precio;
        if (horas > 8) {
            total = total * 0.80;
        }
        return total;
    }
    }
