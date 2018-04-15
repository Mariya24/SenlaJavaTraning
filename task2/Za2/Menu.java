public  class Menu{
	private int i=0;
	public  void showPatients(Patient[] patients){			
		System.out.println("The list of patients of the clinic:");
		for (i=0; i<patients.length; i++){
			if(patients[i] instanceof Patient){
				System.out.println(patients[i].getName() +" "+patients[i].getSurname()+" - " + patients[i].getPolis());
			}
		}
	}
}