import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaDeDivisas consulta = new ConsultaDeDivisas();

        int opcion = 0;
        while (opcion != 8){
            System.out.println("***********************************\n" +
                    "Bienvenida (o) al Conversor de Divisas D'Gree\n\n" +
                    "Ingresa la conversión que deseas realizar:\n\n" +
                    "1. Peso Mexicano (MXN) a Dollar (USD)\n" +
                    "2. Dollar (USD) a Peso Mexicano (MXN)\n" +
                    "3. Libra Esterlina (GBP) a Dollar (USD)\n" +
                    "4. Dollar (USD) a Libra Esterlina (GBP)\n" +
                    "5. Rublo Ruso (RUB) a Dollar (USD)\n" +
                    "6. Dollar (USD) a Rublo Ruso (RUB)\n" +
                    "7. Won Koreano (KRW) a Dollar (USD)\n" +
                    "8. Dollar (USD) a Won Koreano (KRW)\n" +
                    "9. Yen Japonés (JPY) a Dollar (USD)\n" +
                    "10. Dollar (USD) a Yen Japonés (JPY)\n" +
                    "11. Convertir otra moneda\n" +
                    "12. Salir\n" +
                    "************************************************\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConversorDeDivisas.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 2:
                    ConversorDeDivisas.convertir("USD", "MXN", consulta, lectura);
                    break;
                case 3:
                    ConversorDeDivisas.convertir("GBP", "USD", consulta, lectura);
                    break;
                case 4:
                    ConversorDeDivisas.convertir("USD", "GBP", consulta, lectura);
                    break;
                case 5:
                    ConversorDeDivisas.convertir("RUB", "USD", consulta, lectura);
                    break;
                case 6:
                    ConversorDeDivisas.convertir("USD", "RUB", consulta, lectura);
                    break;
                case 7:
                    ConversorDeDivisas.convertir("KRW", "USD", consulta, lectura);
                    break;
                case 8:
                    ConversorDeDivisas.convertir("USD", "KRW", consulta, lectura);
                    break;
                case 9:
                    ConversorDeDivisas.convertir("JPY", "USD", consulta, lectura);
                    break;
                case 10:
                    ConversorDeDivisas.convertir("USD", "JPY", consulta, lectura);
                    break;
                case 11:
                    ConversorDeDivisas.convertirOtraDivisa(consulta, lectura);
                    break;
                case 12:
                    System.out.println("Estás saliendo del Conversor");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
