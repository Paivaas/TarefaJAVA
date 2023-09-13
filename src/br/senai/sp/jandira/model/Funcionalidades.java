package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionalidades {

    List<Tarefa> listaTarefas = new ArrayList<>();

    Scanner teclado = new Scanner(System.in);

    public Tarefa CriarTarefa(){

        Tarefa tarefa = new Tarefa();

        System.out.println("____________________________________");
        System.out.print("Titulo: ");
        tarefa.titulo = teclado.nextLine();

        System.out.print("Descrição: ");
        tarefa.descricao = teclado.nextLine();

        System.out.print("Data de vencimento: ");
        tarefa.vencimento = teclado.nextLine();

        System.out.print("Situação: ");
        tarefa.situacao = teclado.nextLine();

        return tarefa;
    }
    public void AdcionarLista(Tarefa tarefa){
        listaTarefas.add(tarefa);
    }
    public void ModificarTarefa(){



    }
    public void VizuizarTarefa(){

        for (Tarefa tarefa : listaTarefas){
            System.out.println("____________________________________");
            System.out.println("|    " + tarefa.titulo);
            System.out.println("|    " + tarefa.descricao);
            System.out.println("|    " + tarefa.vencimento);
            System.out.println("|    " + tarefa.situacao);

            }
        }
    }


