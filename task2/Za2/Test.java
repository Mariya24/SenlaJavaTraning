import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test{		
	public  static  void main(String[] args){
		// Patient
		Patient pat1 = new Patient("Ivan", "Sidorov", 1234123123, 123123123);
		//sysEngineer.setPosition("Ingener");
		// второй Patient
		Patient pat2 = new Patient("Fedor", "Dub", 1212123123, 124124124);
		// MedCard
		MedCard card1 = new MedCard(123456);
		pat1.setMedCard(card1);
		
		
		Diagnos diagn1 = new Diagnos("Flu", "Antipyretic drugs");
        Diagnos diagn2 = new Diagnos("Angina", "Inhalations");
        Diagnos diagn3 = new Diagnos("Myopia", "Hypotensive preparation");
		
		

        Doctor doc1 = new Doctor("Ann", "Teylor", "Therapist");
        Doctor doc2 = new Doctor("Petr", "Petrov", "Oculist");

		
		// Department
		Department therapyDep = new Department("Therapy");
		Department ophthalmologyDep = new Department("Ophthalmology");
		therapyDep.addDoctor(doc1);
		ophthalmologyDep.addDoctor(doc2);
		
		// Diagnos		
	//	pat1.setDiagnos(diagn1);
		card1.setDiagnos(diagn1);
		card1.setDiagnos(diagn2);
		
		// ReceiptOfPat
		ReceiptOfPat receipt101 = new ReceiptOfPat(101);
		try {
			receipt101.setDateReceipt(new SimpleDateFormat("yyyy-MM-dd").parse("2018-04-12"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ReceiptOfPat receipt321 = new ReceiptOfPat(321);
		try {
			receipt321.setDateReceipt(new SimpleDateFormat("yyyy-MM-dd").parse("2018-04-12"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pat1.setReceiptOfPat(receipt101);
		pat1.setReceiptOfPat(receipt321);
		doc1.setReceiptOfPat(receipt101);
		doc1.setReceiptOfPat(receipt321);
		receipt101.setDiagnos(diagn1);
		receipt321.setDiagnos(diagn2);
	

		System.out.println("Patient " + pat1.getName() +" "+ pat1.getSurname() +
                "\n" + "policy number " + pat1.getPolis() +
                "\n" + "passport number " + pat1.getPassdata()+ 
				"\n"+ "was on receptions: ");
        Iterator iter = pat1.getReceiptOfPat().iterator();
        while (iter.hasNext()){
            System.out.println(((ReceiptOfPat) iter.next()).getNumber() + ",");
        }
		
        System.out.println("Card number: " + pat1.getMedCard().getNumber() + 
				"\n"+"doctor in charge: "+ doc1.getName()+" "+doc1.getSurname());

        System.out.println("Diagnostic: ");
        Iterator iter1 = card1.getDiagnos().iterator();
        while (iter1.hasNext()){
        System.out.println(((Diagnos) iter1.next()).getName()+",");
}	
		
		// Menu
		Menu menu = new Menu();
		Patient patients[] = new Patient[10];
		patients[0]= pat1;
		patients[1] = pat2;
		menu.showPatients(patients);
	}
}
