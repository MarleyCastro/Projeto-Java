import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random numAleatorio = new Random();
        int num = 6;

            for (int i = 0; i < num; i++) {
                System.out.println(numAleatorio.nextInt(60));
            }
        }
    }

