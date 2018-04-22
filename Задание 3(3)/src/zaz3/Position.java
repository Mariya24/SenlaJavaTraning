package zaz3;
import java.util.HashSet;
import java.util.Set;

public class Position {
	private String name;
	private Set<Worker> work = new HashSet<Worker>();
    public Position(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWorker(Worker newWorker){
		work.add(newWorker);
	}
	public Set<Worker> getWorker(){
		return work;
	}
	
	public void  deleteWorker(Worker w){
		work.remove(w);
	}

    @Override
    public String toString() {
        return name;
}
}
