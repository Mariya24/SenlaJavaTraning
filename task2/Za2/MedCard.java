import java.util.HashSet;
import java.util.Set;

public  class MedCard{
	private String status;
	private int number;
	private Set<Diagnos> diagn = new HashSet<Diagnos>();
	public MedCard(int n){
		number = n;

	}
	public void setNumber(int newNumber){
		number = newNumber;
	}
	public int getNumber(){
		return number;
	}
	
	public void setDiagnos(Diagnos p){
			diagn.add(p);
		}
		
		public Set<Diagnos> getDiagnos(){
			return diagn;
		}
		
		public void deleteDiagnos(Diagnos p){
			diagn.remove(p);
		}
}