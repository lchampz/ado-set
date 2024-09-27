package Classes;

import Abstract.Veiculo;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, double preco, int qtdPortas) {
        super(marca, modelo, ano, preco);
        this.quantidadePortas = qtdPortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(" ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preco: " + getPreco());
        System.out.println("Qtd. de Portas: " + getQuantidadePortas());
        System.out.println(" ");
    }
}
