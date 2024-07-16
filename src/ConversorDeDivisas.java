import java.util.Scanner;

public class ConversorDeDivisas {
    public static void convertir(String divisaBase, String divisaTarget, ConsultaDeDivisas consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Divisas divisas = consulta.buscarDivisas(divisaBase, divisaTarget);
        System.out.println("La tasa de conversión del día de hoy es\n1"+divisaBase+" = "+divisas.conversion_rate()+" "+divisaTarget);
        System.out.println("Ingresa la cantidad de " + divisaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * divisas.conversion_rate();
        System.out.println(cantidad+ " " +divisaBase+ " = " + cantidadConvertida + " " + divisas.target_code());
    }

    public static void convertirOtraDivisa (ConsultaDeDivisas consulta, Scanner lectura){
        System.out.println("Ingresa el código de la divisa base:");
        String divisaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la divisa deseada: ");
        String divisaDeseada = lectura.nextLine().toUpperCase();
        convertir(divisaBase, divisaDeseada, consulta, lectura);

    }
}
