import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ReceiptOfPat{
	private int number;
	private Date dateReceipt;
	private Set<Diagnos> diagn = new HashSet<Diagnos>();
	public ReceiptOfPat(int n){
		number = n;
	
	}
	public void setNumber(int newNumber){
		number = newNumber;
	}
	public int getNumber(){
		return number;
	}
	public void setDateReceipt(Date newDateReceipt){
		dateReceipt = newDateReceipt;
	}
	public Date getDateReceipt(){
		return dateReceipt;
	}
	public void setDiagnos(Diagnos newDiagnos){
		diagn.add(newDiagnos);
	}
	public Set<Diagnos> getDiagnos(){
		return diagn;
	}
		
	public void  deleteDiagnos(Diagnos r){
		diagn.remove(r);
	}
}
