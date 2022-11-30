package pt.ulusofona.lp2.empresaSalarios;

public class Tarefa {

    private String descricao;
    private boolean finished = false;
    private int time;
    private String mes;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public int getTime() {
        return time;
    }

    public String getMes() {
        return mes;
    }


    /* boolean terminarTarefa(int nrHoras) - recebe uma duração (em nr de horas) e dá a Tarefa
     como tendo sido concluída. Caso a Tarefa já tenha sido dada como concluída anteriormente, então este método
     não deve alterar o estado do objecto e deve apenas retornar false. Em caso contrário, Caso exista alteração de
      estado, a função deve devolver true.*/

    public String getDescricao() {
        return descricao;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    boolean terminarTarefa(int nrHoras){

        if(finished) return false;

        finished = true;
        time+= nrHoras;
        return finished;
    }

    public int getTaskPrice(){

        return 500 + (10 * getTime());
    }

}
