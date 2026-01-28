import java.util.Scanner;
public class LogicaProgramacion {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Declaracion variables
        double saldoDisponible = 500.0;
        int claveCorrecta = 4940;

        System.out.println("Ingrese clave:");
        int claveIngresada = lector.nextInt();

        // 1. Filtro de Seguridad
        if (claveIngresada == claveCorrecta) {
            System.out.println("Clave correcta.");
            System.out.println("Su saldo actual es: $" + saldoDisponible);

            // 2. Menú de opciones
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Salir");
            System.out.println("3. Consignar dinero");
            int opcion = lector.nextInt();

            if (opcion == 1) {
                // Funcion para el retiro
                System.out.println("Ingrese monto a retirar:");
                double retiro = lector.nextDouble();

                if (retiro <= saldoDisponible) {
                    saldoDisponible -= retiro;
                    System.out.println("Retiro exitoso. Nuevo saldo: $" + saldoDisponible);
                } else {
                    System.out.println("Fondos insuficientes.");
                }
            } else if (opcion == 2) {
                // Salir4
                System.out.println("Gracias por consultar su saldo. ¡Vuelva pronto!");
            } else if (opcion == 3){
                System.out.println("Ingrese monto a consignar:");
                double consignar = lector.nextDouble();

                if (saldoDisponible >=consignar){
                    saldoDisponible += consignar;
                    System.out.println("Consignacion exitosa");
                    System.out.println("Su nuevo saldo es:"+ saldoDisponible);
                }
            }
            else {
                System.out.println("Opción no válida.");
            }
            //

        } else {
            System.out.println("Clave incorrecta.");
        }

    }
}









































