import br.senai.sp.jandira.model.Funcionalidades;
import br.senai.sp.jandira.model.Tarefa;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Funcionalidades funcionalidades = new Funcionalidades();

        while (true) {

            System.out.println("---------Tarefas---------");
            System.out.println("[1] Adicionar tarefa");
            System.out.println("[2] Modificar tarefa");
            System.out.println("[3] Vizualizar tarefa");
            int escolha = teclado.nextInt();

            if (escolha == 1) {
                Tarefa tarefa = funcionalidades.CriarTarefa();
                funcionalidades.AdcionarLista(tarefa);
            } else if (escolha == 2) {

            } else if (escolha == 3) {
                funcionalidades.VizuizarTarefa();
            } else {
                System.out.println("Valor invalido");
            }
        }

    }
}