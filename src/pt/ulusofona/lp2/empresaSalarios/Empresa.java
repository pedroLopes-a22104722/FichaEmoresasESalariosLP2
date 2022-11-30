package pt.ulusofona.lp2.empresaSalarios;

import java.util.ArrayList;
import java.util.Objects;

public class Empresa {

    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFunc(Funcionario func){
        funcionarios.add(func);
    }

    public Funcionario getFunc(Funcionario f){
        for (Funcionario funcionario : funcionarios) {
            if (Objects.equals(funcionario.getNome(), f.getNome())){
                return funcionario;
            }
        }
        return null;
    }

    public ArrayList<Tarefa> getAllTasks(){
        ArrayList<Tarefa> result = new ArrayList<>();

        for (Funcionario func :  funcionarios) {
            for (Tarefa tarefa : func.getTarefas()) {
                result.add(tarefa);
            }
        }
        return result;
    }

    public ArrayList<String> obterRelatorioSalariosParaOMes(String mes){
        ArrayList<String> result = new ArrayList<>();
        //result.add("----------------------------------------");
        result.add("Relatório de Salários - mês de " + mes);
        for (Funcionario func :  funcionarios) {
            result.add(func.nameSalaryInTheMonthString(mes));
        }
        //result.add("----------------------------------------");
        return result;
    }



    public ArrayList<String> obterRelatorioSalariosParaOMesDetalhados(String mes){
        ArrayList<String> result = new ArrayList<>();
        //result.add("----------------------------------------");
        result.add("Relatório de Salários - mês de " + mes);
        for (Funcionario func :  funcionarios) {
            result.add(func.nameSalaryInTheMonthString(mes));
            for (Tarefa t : getAllTasks()) {
                result.add("    " + t.getDescricao() + " (" + t.getTime() + ")");
            }
        }
        //result.add("----------------------------------------");
        return result;
    }
}
