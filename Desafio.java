import java.util.Scanner;

public class Desafio{

    public static void main(String[] args) {
    
        String Cliente="Sighem S.A de C.V";
        double capital=2523;
        String tipoCliente="Cuenta Empresarial";
        String menu="""
            ¿Que operación decea realizar?
            1.- Consultar Saldo
            2.- Retirar efectivo
            3.- Depositar
            9.- Salir
        """;
        int opcion=0;

        System.out.println("==================================");
        System.out.println("  Nombre del Cliente: "+Cliente );
        System.out.println("  Monto disponible: "+capital );
        System.out.println("  Tipo de Clinete: "+tipoCliente );
        System.out.println("===================================\n");

        
        Scanner teclado = new Scanner(System.in);
        
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:    //consultas
                    System.out.println("Tu saldo Actual es: "+capital+"\n");
                    break;
                case 2://retiros
                    System.out.println("¿Ingrese el monto a retirar?");
                    int montoRetiro=teclado.nextInt();
                    if(montoRetiro>capital){
                        System.out.println("Transacción Rechazada por fondos insuficientes!\n");
                    }else{
                        capital=capital-montoRetiro;
                        System.out.println("Transacción exitosa de "+montoRetiro+"\nMonto disponible: "+capital);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar");
                    double montoDepo=(double) teclado.nextInt();
                    capital+=montoDepo;
                    System.out.println("Monto depositado: "+montoDepo+"\nMonto disponible: "+capital);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro servicio..");
                    break;
            }
        }
        
    }
}