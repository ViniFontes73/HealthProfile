/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthprofile;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Vinicius
 */
public class pessoa {
 private String nome; 
 private String sobrenome;
 private String sexo;
 private LocalDate dataNascimento;
 private Double altura;
 private Double massa;

// construtor
 public pessoa(String nome, String sobrenome, String sexo, LocalDate dataNascimento, Double altura, Double massa) // nome do construtor é o nome da classe seguido do objeto ou variavel
 {
 this.nome = nome;
 this.sobrenome = sobrenome;
 this.sexo = sexo;
 this.dataNascimento = dataNascimento;
 this.altura = altura;
 this.massa = massa;
 }
 
 // configurar o nome
 public void setNome(String nome) {
 this.nome = nome;}
 // metodo para chamar o nome
 public String getNome(){
 return nome;
 }
 // configurar o nome
 public void setSobrenome (String sobrenome) {
 this.sobrenome = sobrenome;}
 // metodo para chamar o sobrenome
 public String getSobrenome(){
 return sobrenome;
 }
//configurar sexo
 public void setSexo  (String sexo){
     this.sexo = sexo;}
 // chamar sexo
 public String getSexo (){
     return sexo;
 }
//configurar Data de nasciemnto
 public void setDataNascimento (LocalDate dataNascimento){
     this.dataNascimento = dataNascimento;}
 // chamar Data de nascimento
 public LocalDate getDataNascimento (){
     return dataNascimento;
}
// config altura
 public void setAltura(Double altura){
     this.altura = altura;}
 //chamar altura
 public Double getAltura (){
     return altura;
 }
// config massa
 public void setMassa(Double massa){
     this.massa = massa;}
 //chamar massa
 public Double getMassa (){
     return massa;
 }
 
//ACHAR A IDADE DO USUARIO
public int definirIdade(){
LocalDate hoje = LocalDate.now();
Period periodo = Period.between(dataNascimento, hoje);
return periodo.getYears();
}
// ACHAR IMC DO USUARIO
public double IMC() {
        return massa / (altura * altura);
    }
}

