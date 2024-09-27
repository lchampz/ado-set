import Classes.Caminhao;
import Classes.Carro;
import Classes.Moto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Carro> carsList = new ArrayList<Carro>();
        ArrayList<Moto> motoList = new ArrayList<Moto>();
        ArrayList<Caminhao> caminhaoList = new ArrayList<Caminhao>();

        while(isRunning) { //event-loop
            System.out.println(" ");
            System.out.println("Cadastre um veículo");

            System.out.println(" ");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhao");
            System.out.println("4 - Resumo");
            System.out.println("5 - Sair");
            System.out.println(" ");

            System.out.print("Sua resposta: ");
            System.out.println(" ");

            switch (scan.nextInt()) {
                case 1:
                    Carro carrinho = registerNewCarro();
                    carsList.add(carrinho);
                    carrinho.exibirDetalhes();
                break;
                case 2:
                    Moto motinho = registerNewMoto();
                    motoList.add(motinho);
                    motinho.exibirDetalhes();
                break;
                case 3:
                    Caminhao caminhaozinho = registerNewCaminhao();
                    caminhaoList.add(caminhaozinho);
                    caminhaozinho.exibirDetalhes();
                break;
                case 4:
                    System.out.println("Quantidade de Carros: " + carsList.size());
                    System.out.println("Quantidade de Motos: " + motoList.size());
                    System.out.println("Quantidade de Caminhões: " + caminhaoList.size());
                break;
                case 5:
                    isRunning = false;
                break;
                default: break;
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

    public static Moto registerNewMoto() {
        Scanner scan = new Scanner(System.in);
        String modelo;
        String marca;
        int ano;
        int cilindradas;
        double preco;

        System.out.print("Insira o modelo: ");
        modelo = scan.next();
        System.out.print("Insira o marca: ");
        marca = scan.next();
        System.out.print("Insira o ano: ");
        ano = scan.nextInt();
        System.out.print("Insira a cilindradas: ");
        cilindradas = scan.nextInt();
        System.out.print("Insira a preco: ");
        preco = scan.nextDouble();

        return new Moto(marca, modelo, ano, preco, cilindradas);
    }

    public static Caminhao registerNewCaminhao() {
        Scanner scan = new Scanner(System.in);
        String modelo;
        String marca;
        int ano;
        int carga;
        double preco;

        System.out.print("Insira o modelo: ");
        modelo = scan.next();
        System.out.print("Insira o marca: ");
        marca = scan.next();
        System.out.print("Insira o ano: ");
        ano = scan.nextInt();
        System.out.print("Insira a carga (kg): ");
        carga = scan.nextInt();
        System.out.print("Insira a preco: ");
        preco = scan.nextDouble();

        return new Caminhao(marca, modelo, ano, preco, carga);
    }
}