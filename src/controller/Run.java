package controller;

import modal.Gerente;
import modal.Vendedor;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        String nome;
        Double salario;
        String funcao;
        int vendas = 0;
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = entradaUsuario.next();
        System.out.println("Digite seu salario:");
        salario = entradaUsuario.nextDouble();
        System.out.println("Digite sua Função:");
        funcao = entradaUsuario.next();
        if(funcao.equals("Vendedor") || funcao.equals("vendedor") ){
            System.out.println("Quantas vendas você fez?");
            vendas = entradaUsuario.nextInt();
        }

        if(funcao.equals("Vendedor") || funcao.equals("vendedor") ){
            Vendedor vendedor = new Vendedor();
            vendedor.setNome(nome);
            vendedor.setSalario(salario);
            vendedor.setNroVenda(vendas);

            System.out.println("Seu nome é: "+vendedor.getNome());
            System.out.println("Seu salario é: " +vendedor.calculoSalario(vendedor.getSalario()));
            System.out.println("Sua função é: " + funcao);

        }else if(funcao.equals("Gerente") || funcao.equals("gerente")){
            Gerente gerente =  new Gerente();
            gerente.setNome(nome);
            gerente.setSalario(salario);

            System.out.println("Seu nome é: " + gerente.getNome());
            System.out.println("Seu salario é: " + gerente.getSalario());
            System.out.println("Sua função é: " + funcao);
        }
    }
}
