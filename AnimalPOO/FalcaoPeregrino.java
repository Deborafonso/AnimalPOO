public class FalcaoPeregrino extends Animais{
    private static final int VELOCIDADE_KMH = 390;

    public FalcaoPeregrino() {
        setMetrosPercorridos(0);
    }
    
    public void mover(int segundos) {
        if (segundos > 0) {
            double distancia = VELOCIDADE_KMH *1000 /3600 * segundos;
            setMetrosPercorridos(getMetrosPercorridos () + distancia);
            //setmetrosPercorridos() += VELOCIDADE_KMH * 1000 / 3600 * segundos;
            System.out.printf("O falcão peregrino voou %.1f metros.%n",
			getmetrosPercorridos());
        }
    }
} // fim da classe FalcaoPeregrino
