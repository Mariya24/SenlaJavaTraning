import java.util.HashSet;
import java.util.Set;

// наследуем класс Man
	public  class Doctor extends Man{
		private String special;
		private Department department;
		private Set<ReceiptOfPat> receipt = new HashSet<ReceiptOfPat>();
		// создаем и конструктор
		public  Doctor(String cName, String cSurname, String cSpecial){
			name = cName;
			surname = cSurname;
			special = cSpecial;
		}
		public void setSpecial(String newSpecial){				
				special = newSpecial;
		}
		public String getSpecial(){
				return special;
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
		
		public void setDepartment(Department d){
			department = d;
		}
		
		public Department getDepartment(){
			return department;
		}
		
		
	}
