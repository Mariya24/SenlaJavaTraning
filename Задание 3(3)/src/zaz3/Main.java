package zaz3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Position pos1 = new Position("Team Leader");
        Position pos2 = new Position("Developer");
        Position pos3 = new Position("Системный архитектор");
        Position pos4 = new Position("Аналитик");

        Worker work1 = new Worker("Иванов Иван",50000);
        work1.setPosition(pos1);
        Worker work2 = new Worker("Петров Петр",40000);
        work2.setPosition(pos2);
        Worker work3 = new Worker("Сидоров Сергей",45000);
        work3.setPosition(pos3);
        Worker work4 = new Worker("Селютина Ольга", 35000);
        work4.setPosition(pos4);

        Firm firm1 = new Firm("ITDev");
        firm1.addWorker(work1);
        firm1.addWorker(work2);
        firm1.addWorker(work3);
        firm1.addWorker(work4);

        firm1.setSum();

        System.out.println("В фирме работают " + firm1.getWorkers().size() + " сотрудник(а): " + "\n" +
        firm1.getWorkers());

        System.out.println("Общая месячная получка: " + firm1.getSum());

	}

}
