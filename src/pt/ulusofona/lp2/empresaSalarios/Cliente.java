package pt.ulusofona.lp2.empresaSalarios;

import java.util.ArrayList;

public class Cliente {

    protected String name;
    protected String phoneNumbe;
    protected String NIF;

    private ArrayList<Tarefa> encomendedTasks = new ArrayList<>();


    public ArrayList<Tarefa> getEncomendedTasks() {
        return encomendedTasks;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumbe() {
        return phoneNumbe;
    }

    public String getNIF() {
        return NIF;
    }

}
