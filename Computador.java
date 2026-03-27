public class Computador {
    // Atributos (Privados conforme o diagrama)
    private String cpu;
    private String memoriaRam;
    private String memoria;
    private boolean estaLigado; // Atributo extra para controle de estado

    // Construtor: Para dar vida ao objeto com suas peças
    public Computador(String cpu, String memoriaRam, String memoria) {
        this.cpu = cpu;
        this.memoriaRam = memoriaRam;
        this.memoria = memoria;
        this.estaLigado = false; // PC começa desligado por padrão
    }

    // Método para ligar
    public void ligarPC() {
        if (!estaLigado) {
            this.estaLigado = true;
            System.out.println("O computador com CPU " + cpu + " está ligando...");
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    // Método para desligar
    public void desligarPC() {
        if (estaLigado) {
            this.estaLigado = false;
            System.out.println("Desligando sistema... Até logo!");
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    // Método para jogar
    public void jogar() {
        if (estaLigado) {
            System.out.println("Iniciando jogo... Usando " + memoriaRam + " de RAM.");
        } else {
            System.out.println("Erro: Você não pode jogar com o PC desligado!");
        }
    }
}