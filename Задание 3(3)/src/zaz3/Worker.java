package zaz3;

public class Worker {
    private String name;
    private double zar;
    private Position posit;

    public Worker(String name, int zar){
        this.name = name;
        this.zar = zar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getZar() {
        return zar;
    }

    public void setZar(double cost) {
        this.zar = cost;
    }

    public Position getPosition(Position posit1) {
        return posit;
    }

    public void setPosition(Position posit) {
        this.posit = posit;
    }

    @Override
    public String toString() {
        return ("Имя сотрудника: " + name + "\n" +
        "Должность: " + posit + "\n"+
        "Оклад: " + zar + "\n"); 
    }
}
