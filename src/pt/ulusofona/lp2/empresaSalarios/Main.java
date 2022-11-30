package pt.ulusofona.lp2.empresaSalarios;

import java.util.ArrayList;

public class Main {



    //static void contratar(Empresa empresa, Funcionario func) -
    // esta função deve associar à Empresa passada como 1º argumento o Funcionário passado como 2º argumento.

    static void contratar(Empresa empresa, Funcionario func) {
        empresa.addFunc(func);
    }

    //static void associarTarefa(Empresa e, Funcionario f, Tarefa t, String mes) -
    // esta função deve associar um Funcionário a uma Tarefa. Para além disso, deve ficar registado que a
    // Tarefa irá ser executada no mês passado como último argumento.

    static void associarTarefa(Empresa e, Funcionario f, Tarefa t, String mes){
        t.setMes(mes);
        e.getFunc(f).addTarefa(t);
    }

    //static ArrayList<Funcionario> getFuncionarios(Empresa empresa) -
    // esta função deve devolver uma lista com todos os Funcionários da Empresa passada como argumento.

    static ArrayList<Funcionario> getFuncionarios(Empresa empresa){
        return empresa.getFuncionarios();
    }

    //static ArrayList<Tarefa> getTarefas(Empresa empresa) -
    // esta função deve devolver uma lista com todas as Tarefas que a Empresa passada como argumento conhece

    static ArrayList<Tarefa> getTarefas(Empresa empresa){
        return empresa.getAllTasks();
    }

    //static ArrayList<String> obterRelatorioSalarios(Empresa emp, String mes)
    // - esta função deve devolver o relatório de salários da Empresa para um determinado mês.

    static ArrayList<String> obterRelatorioSalarios(Empresa emp, String mes){
        return emp.obterRelatorioSalariosParaOMes(mes);
    }

    static ArrayList<String> obterRelatorioDetalhado(Empresa emp, String mes){
        return emp.obterRelatorioSalariosParaOMesDetalhados(mes);
    }

    //static Empresa obterUmaEmpresa() -
    // deve devolver uma Empresa com três Funcionários. Cada Funcionário deve ter uma Tarefa associada

    static Empresa obterUmaEmpresa(){
        Empresa emp = new Empresa("XPTO");

        ArrayList<Funcionario> funcs = new ArrayList<>();

        Funcionario pedro = new Funcionario("Pedro Lopes");
        pedro.addTarefa(new Tarefa("ler Um Livro"));
        emp.addFunc(pedro);

        Funcionario joao = new Funcionario("Joao Lopes");
        pedro.addTarefa(new Tarefa("limpar a casa de banho"));
        emp.addFunc(joao);

        Funcionario paulo = new Funcionario("Paulinho");
        pedro.addTarefa(new Tarefa("ver televisao"));
        emp.addFunc(pedro);

        return emp;
    }



}

