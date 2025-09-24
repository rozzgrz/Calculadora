package latinasincloud;
import java.util.Scanner;

public class calculadoracientifica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int seleccion;
        double numero1, numero2, respuesta;

        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Terminar programa");
            System.out.print("Selecciona tu opción: ");

            seleccion = entrada.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.print("Ingresa el primer valor: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Ingresa el segundo valor: ");
                    numero2 = entrada.nextDouble();
                    respuesta = suma(numero1, numero2);
                    System.out.println("La suma es: " + respuesta);
                    break;

                case 2:
                    System.out.print("Ingresa el primer valor: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Ingresa el segundo valor: ");
                    numero2 = entrada.nextDouble();
                    respuesta = resta(numero1, numero2);
                    System.out.println("La resta es: " + respuesta);
                    break;

                case 3:
                    System.out.print("Ingresa el primer valor: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Ingresa el segundo valor: ");
                    numero2 = entrada.nextDouble();
                    respuesta = multiplicacion(numero1, numero2);
                    System.out.println("La multiplicación es: " + respuesta);
                    break;

                case 4:
                    System.out.print("Ingresa el primer valor: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Ingresa el segundo valor: ");
                    numero2 = entrada.nextDouble();
                    if (numero2 == 0) {
                        System.out.println("Error: La división por cero no está permitida.");
                    } else {
                        respuesta = division(numero1, numero2);
                        System.out.println("La división es: " + respuesta);
                    }
                    break;

                case 5:
                    System.out.print("Ingresa la base: ");
                    numero1 = entrada.nextDouble();
                    System.out.print("Ingresa el exponente: ");
                    numero2 = entrada.nextDouble();
                    respuesta = elevarPotencia(numero1, numero2);
                    System.out.println("El resultado de la potencia es: " + respuesta);
                    break;

                case 6:
                    System.out.println("Cerrando calculadora. Hasta la vista!");
                    break;

                default:
                    System.out.println("Opción incorrecta. Por favor, elige una opción válida.");
                    break;
            }

        } while (seleccion != 6);

        entrada.close();
    }

    public static double suma(double x, double y) {
        return x + y;
    }

    public static double resta(double x, double y) {
        return x - y;
    }

    public static double multiplicacion(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static double elevarPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}