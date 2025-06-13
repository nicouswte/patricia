public class Fruta {

    public static void main(String[] args) {
        Fruta fruta = new Fruta("Maçã", "Vermelha", 150, "Pomo");
        fruta.exibirInfo();
    }

    String nome;
    String cor;
    int peso;
    String tipo;

    public Fruta() {
    }

    public Fruta(String nome, String cor, int peso, String tipo) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.tipo = tipo;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Peso: " + peso + "g");
        System.out.println("Tipo: " + tipo);
    }
}