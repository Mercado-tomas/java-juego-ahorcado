import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // iniciamos el juego
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letraAdivinada = new char[palabraSecreta.length()];

        for(int i = 0; i < letraAdivinada.length; i++){
            letraAdivinada[i] = '_';
            //System.out.println(palabraSecreta);
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letraAdivinada));
            System.out.println("Introduce una letra por favor: ");
            // graba lo primero que se escriba y convierte a minuscula
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            
            boolean letraCorrecta = false;
            for(int i = 0; i < palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == letra){
                    letraAdivinada[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto! Te quedan "+(intentos - intentosMaximos)+" intentos.");

            } 

            if(String.valueOf(letraAdivinada).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicitaciones! Adivinaste! La palabra era: "+ palabraSecreta);

            }




        }
        
        if(!palabraAdivinada){
            System.out.println("Perdiste! ");
        }
        scanner.close();

    
    
    
    
    }
}
