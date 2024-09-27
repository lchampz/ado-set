package Classes;

import Abstract.Veiculo;

public class Caminhao extends Veiculo {
    private double carga;

    public Caminhao(String marca, String modelo, int ano, double preco, double carga) {
        super(marca, modelo, ano, preco);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(" ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preco: " + getPreco());
        System.out.println("Carga (kg): " + getCarga());
        System.out.println(" ");
    }
}
