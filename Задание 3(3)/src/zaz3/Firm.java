package zaz3;
import java.util.ArrayList;


public class Firm {
    private  double sum;
    private String name;
    private ArrayList<Worker> workers = new ArrayList<Worker>();

    public Firm(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    //Общая сумма
    public void setSum() {
        sum = 0;
        for (int i = 0; i < workers.size(); i++) {
        sum = sum + workers.get(i).getZar();
        }        
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void addWorker(Worker newWorker) {
        workers.add(newWorker);
    }

    public void removeWorker(Worker e){
        workers.remove(e);
}
}
