package Classes;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Implementação dos métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
    
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        // Testando funcionalidades do ReprodutorMusical
        iphone.tocar();
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.pausar();
        
        // Testando funcionalidades do AparelhoTelefonico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        // Testando funcionalidades do NavegadorInternet
        iphone.exibirPagina("http://www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
