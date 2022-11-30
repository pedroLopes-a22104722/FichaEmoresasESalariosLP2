package pt.ulusofona.lp2.empresaSalarios;

import java.util.ArrayList;
import java.util.Objects;

public class Funcionario {

    private String nome;
    private ArrayList<Tarefa> tarefas = new ArrayList<>();



    public Funcionario(String nome) {
        this.nome = nome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public String getNome() {
        return nome;
    }

    public int getWorkTime() {
        int workTime = 0;
        for (Tarefa tarefa : tarefas) {
            workTime += tarefa.getTime();
        }
        return workTime;
    }

    public int getWorkTimeFromMonth(String mes) {
        int workTime = 0;
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getMes() == mes){
                workTime += tarefa.getTime();
            }
        }
        return workTime;
    }

    public void addTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public int calcSalary(){
        return 505 + 2 * getWorkTime() + calcBonus();
    }

    public int calcSalaryFromMonth(String mes){
        return 505 + 2 * getWorkTimeFromMonth(mes) + calcBonus();
    }


    public Tarefa getTarefa(Tarefa t){
        for (Tarefa tarefa : tarefas) {
            if (Objects.equals(t.getDescricao(), tarefa.getDescricao())){
                return tarefa;
            }
        }
        return null;
    }

    public int calcBonus(){
        if (tarefas.size() > 10 && getWorkTime() < 50) {
            return tarefas.size()-5;
        }
        return 0;
    }


    public String nameSalaryInTheMonthString(String mes){
        return "  " + getNome() + " - " + calcSalaryFromMonth(mes) + "\n";
    }

}
