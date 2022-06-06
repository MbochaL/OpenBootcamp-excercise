public class Main {
    public static void main(String[] args) {

        String Estacion = "Primavera";

        switch(Estacion) {
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            default:
                System.out.println("Esto no es una estacion");
        }

    }
}