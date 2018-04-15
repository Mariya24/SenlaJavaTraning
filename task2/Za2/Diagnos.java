public class Diagnos{
	private String name, state, recom;
	public Diagnos(String n, String rec){
		name = n;
		recom = rec;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	
	public void setRecom(String newRecom){
		recom = newRecom;
	}
	public String getRecom(){
		return recom;
	}
}