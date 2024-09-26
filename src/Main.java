import Classes.Caminhao;
import Classes.Carro;
import Classes.Moto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = false;
        Scanner scan = new Scanner(System.in);
        ArrayList<Carro> carsList = new ArrayList<Carro>();
        ArrayList<Moto> motoList = new ArrayList<Moto>();
        ArrayList<Caminhao> caminhaoList = new ArrayList<Caminhao>();

        while(isRunning) { //event-loop

            System.out.println("Cadastre um veículo");
            System.out.println(" ");

            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhao");
            System.out.println("4 - Resumo");
            System.out.println("5 - Sair");

            switch (scan.nextInt()) {
                case 1:
                    Carro carrinho = registerNewCarro();
                    carsList.add(carrinho);
                break;

            }
        }
    }

    public static Carro registerNewCarro() {
        Scanner scan = new Scanner(System.in);
        String modelo;
        String marca;
        int ano;
        int qtdPortas;
        double preco;

        System.out.print("Insira o modelo: ");
        modelo = scan.next();
        System.out.print("Insira o marca: ");
        marca = scan.next();
        System.out.print("Insira o ano: ");
        ano = scan.nextInt();
        System.out.print("Insira a qtd. de portas: ");
        qtdPortas = scan.nextInt();
        System.out.print("Insira a preco: ");
        preco = scan.nextDouble();

        return new Carro(marca, modelo, ano, preco, qtdPortas);

    }
}