package ATP29.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseController<T> {
    private ArrayList<T>dados;

    Scanner scanner = new Scanner(System.in);

    public BaseController() {
        this.dados = new ArrayList<>();
    }

    //crud
    public void create(T obj){
        this.dados.add(obj);

    }

    public ArrayList<T> read(){
        return this.dados;

    }

    public void update(T obj){
        if(contains(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj){
        this.dados.remove(obj);

    }

    public boolean contains(T obj){
        return this.dados.contains(obj);
    }

}
