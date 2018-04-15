import java.util.HashSet;
import java.util.Set;

// наследуем класс Man
	public  class Patient extends Man{
		private int passdata, polis;
		private MedCard mCard;
		private Set<ReceiptOfPat> receipt = new HashSet<ReceiptOfPat>();
		//private Department department;
		//private Set<PastPosition> pastPosition = new HashSet<PastPosition>();
		// создаем и конструктор
		public  Patient(String cName, String cSurname, int cPassdata, int cPolis){
			name = cName;
			surname = cSurname;
			passdata = cPassdata;
			polis = cPolis;
		}
		public void setPassdata(int newPassdata){				
				passdata = newPassdata;
		}
		public int getPassdata(){
				return passdata;
		}
		public void setPolis(int newPolis){
				polis = newPolis;
		}
		public int getPolis(){
				return polis;
		}
		public void setMedCard(MedCard c){
			mCard = c;
		}
		public MedCard getMedCard(){
			return mCard;
		}
		public void setReceiptOfPat(ReceiptOfPat newReceipt){
			receipt.add(newReceipt);
		}
		public Set<ReceiptOfPat> getReceiptOfPat(){
			return receipt;
		}
		
		public void  deleteReceiptOfPat(ReceiptOfPat r){
			receipt.remove(r);
		}
	/*	
		public void setDepartment(Department d){
			department = d;
		}
		
		public Department getDepartment(){
			return department;
		}
		
		public void setPastPosition(PastPosition p){
			pastPosition.add(p);
		}
		
		public Set<PastPosition>  getPastPosition(){
			return pastPosition;
		}
		
		public void deletePastPosition(PastPosition p){
			pastPosition.remove(p);
		}
	*/
	}
