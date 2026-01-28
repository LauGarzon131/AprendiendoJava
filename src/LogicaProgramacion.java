import java.util.Scanner;
public class LogicaProgramacion {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //Declaracion Variables
        double saldoDisponible = 500.0;
        int claveCorrecta = 4940;
        boolean sistemaEncendido = true; //Sistema para que no se cierre

        System.out.println("Ingrese clave:");
        int claveIngresada = lector.nextInt();

        if (claveIngresada == claveCorrecta) {

            // Sistema abierto
            while (sistemaEncendido) {
                System.out.println("Bienvendido: Escoge una opción");
                System.out.println("\n MENÚ PRINCIPAL ");
                System.out.println("Saldo actual: $" + saldoDisponible);
                System.out.println("1. Retirar");
                System.out.println("2. Consignar");
                System.out.println("3. SALIR");
                int opcion = lector.nextInt();

                if (opcion == 1) {
                    System.out.println("¿Cuánto retira?");
                    double retiro = lector.nextDouble();
                    if(retiro <= saldoDisponible) saldoDisponible -= retiro;
                    else System.out.println("Fondos insuficientes");
                }
                else if (opcion == 2) {
                    System.out.println("¿Cuánto consigna?");
                    double con = lector.nextDouble();
                    saldoDisponible += con;
                }
                else if (opcion == 3) {

                    sistemaEncendido = false;
                    System.out.println("Cerrando sesión... ¡Adiós!");
                }
            } // Aquí termina el while

        } else {
            System.out.println("Clave incorrecta.");
        }
    }
}









































