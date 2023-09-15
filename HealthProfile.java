/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.healthprofile;

/**
 *
 * @author Vinicius
 */
//PseudoCod
//Classe HealthProfille
//Atibutos dessa classe devem ser: nome, sobrenome, sexo, dataNascimento, ( mmddaa), altura e peso 
// criar um construtor 
// para cada atributo fornecer Set e Get
//
//Peça ao usuario as informações
// a partir disso será instanciado e imprimirá os resultados
import java.util.Scanner;
import java.time.LocalDate;

public class HealthProfile 
{
    public static void main(String[] args)
    {
    //criar objeto
    //pessoa pessoa = new pessoa("Vinicius", "Fontes"); esse tipo é um pouco CONFUSO
    
    //fazendo com scanner
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o nome: ");
    String nome = scanner.nextLine();
    System.out.print("Digite o Sobrenome: ");
    String sobrenome = scanner.nextLine();
    System.out.print("Digite seu Genero: ");                                    // COLOCAR MENU PARA ESCOLHER ENTRE "f" E "m"
    String sexo = scanner.nextLine();
    System.out.print("Digite a data de nascimento (AAAA-MM-DD): ");
    LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());
    System.out.print("Digite sua altura em metros 'usar virgula': ");                                   
    Double altura = scanner.nextDouble();
    System.out.print("Digite sua massa corparal em Kg. 'usar virgula': ");                                    
    Double massa = scanner.nextDouble();

    scanner.close();
        
    pessoa pessoa = new pessoa(nome, sobrenome, sexo, dataNascimento, altura, massa);
    
    
    System.out.printf("Nome: %s%n", pessoa.getNome());
    System.out.printf("Sobrenome: %s%n", pessoa.getSobrenome());
    System.out.printf("Genero: %s%n", pessoa.getSexo());
    System.out.printf("Data de Nascimento: %s%n", pessoa.getDataNascimento());
    System.out.printf("Sua altura é: %s%n", pessoa.getAltura ());
    System.out.printf("Sua massa é: %s%n", pessoa.getMassa ());
    System.out.printf("Idade: %d anos%n", pessoa.definirIdade());
    System.out.printf("IMC igual a: %.2f ", pessoa.IMC());
    }
    
    
    //Metodo alternativo que é entregando um relatório:
       
}
