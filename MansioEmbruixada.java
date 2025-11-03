import java.util.Random;
import java.util.Scanner;

public class MansioEmbruixada {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Random rand= new Random();
    int passos=5; 
    boolean eixidatrobada=false;
    System.out.println("Benvingut a la Mansio Embruixada");
    System.out.println("Tens "+passos+"passos per trobar la eixida...Bona sort!");
    while (passos > 0 && !eixidatrobada) {
        
        
        
        System.out.println("Porta esquerra(1) o porta dreta(2)?");
        int eleccio = sc.nextInt();
        
        int portacorrectalazar = rand.nextInt(2) + 1;
        System.out.println("(DEBUG) Porta correcta: "+ portacorrectalazar);

        
        if (eleccio == portacorrectalazar) {
            System.out.println("Has trobat la eixida! Enhorabona!");
            eixidatrobada = true;}
            else {
                passos = passos -1;
                System.out.println("Un fantasma taspanta! Et queden "+passos+" passos.");

                if (passos== 0 && !eixidatrobada) {
                    System.out.println("Shan acabat els passos...La mansio tatrapa pa sempre");
                    
                }
            }
    }


    }
}
