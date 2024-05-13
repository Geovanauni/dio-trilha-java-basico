public class AparelhoMultifuncional implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        AparelhoMultifuncional aparelhoMultifuncional = new AparelhoMultifuncional(); 

        aparelhoMultifuncional.tocar();
        aparelhoMultifuncional.pausar();
        aparelhoMultifuncional.selecionarMusica();

        // Aparelho Telefônico
        aparelhoMultifuncional.ligar();
        aparelhoMultifuncional.atender();
        aparelhoMultifuncional.iniciarCorreioVoz();

        // Navegador na Internet
        aparelhoMultifuncional.exibirPagina();
        aparelhoMultifuncional.adicionarNovaAba();
        aparelhoMultifuncional.atualizarPagina();
    }
    public void tocar() {
        System.out.println("Tocando música...");
    }
    public void pausar() {
        System.out.println("Música pausada.");
    }
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }
    public void ligar() {
        System.out.println("Ligando...");
    }
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
    
    

