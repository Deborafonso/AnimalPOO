public class Guepardo extends Animais {
    private static final int VELOCIDADE_KMH = 130;

    public void mover(int segundos) {
        if (segundos > 0) {
            //metrosPercorridos += VELOCIDADE_KMH * 1000 / 3600 * segundos;
            System.out.printf("O guepardo correu %.1f metros.%n",
			      metrosPercorridos);
        }
    }
} // fim da classe Guepardo
