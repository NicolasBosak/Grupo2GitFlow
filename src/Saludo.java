public class Saludo {
    public String generarSaludo(String saludo) {

        if(saludo==null || saludo.isEmpty()){
            return "Hola, invitado.";
        }
        return "Hola " + saludo + "!";
    }
}