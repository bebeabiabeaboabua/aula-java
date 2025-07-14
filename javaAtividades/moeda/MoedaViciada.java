
import java.util.Random;

public class MoedaViciada
{
    Random aleatorio = new Random();
    

    public String CaraOuCoroa(String usuario){
        int numero = aleatorio.nextInt(100);
        if(usuario.equalsIgnoreCase("cara")){
            if(numero < 30){
                return "Cara";
            }else{
                return "Coroa";
            }
        }
        if(usuario.equalsIgnoreCase("coroa")){
            if(numero < 30){
                return "Coroa";
            }else{
                return "Cara";
            }
        }
        
        return "Escolha invalida";
    }
}
