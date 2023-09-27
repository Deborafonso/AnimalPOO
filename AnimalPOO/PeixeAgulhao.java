public class PeixeAgulhao extends Animais{
    private static final int VELOCIDADE_KMH = 115;
    
    }

    public void mover(int segundos) {
        if (segundos > 0) {
            metrosPercorridos += VELOCIDADE_KMH * 1000 / 3600 * segundos;
            System.out.printf("O peixe-agulhao nadou %.1f metros.%n",
			      metrosPercorridos);
        }
    }
} // fim da classe PeixeAgulhao
