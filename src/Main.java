public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        Despedida despedida = new Despedida();
        System.out.println("Version 1.0.0 lista para produccion");
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");
        System.out.println(saludo.generarSaludo("Mundo", "en"));
        System.out.println(saludo.generarSaludo("Mundo", "es"));
        System.out.println(saludo.generarSaludo("Mundo", "fr"));
    }
}
