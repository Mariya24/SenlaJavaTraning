import java.util.HashSet;
import java.util.Set;
public  class Department implements Unit{
	private String name;
	private Set<Doctor> doctors = new HashSet<Doctor>();
	public Department(String n){
		name = n;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void  addDoctor(Doctor newDoctor){
		doctors.add(newDoctor);
		// связываем сотрудника с этим отделом
		newDoctor.setDepartment(this); 
	}
	public Set<Doctor> getDoctor(){
		return doctors;
	}
	public void  removeDoctor(Doctor e){
		doctors.remove(e);
	}
	public int getPersonCount(){
		return getDoctor().size();
	}
}