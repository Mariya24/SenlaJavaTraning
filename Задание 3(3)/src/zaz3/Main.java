package zaz3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Position pos1 = new Position("Team Leader");
        Position pos2 = new Position("Developer");
        Position pos3 = new Position("��������� ����������");
        Position pos4 = new Position("��������");

        Worker work1 = new Worker("������ ����",50000);
        work1.setPosition(pos1);
        Worker work2 = new Worker("������ ����",40000);
        work2.setPosition(pos2);
        Worker work3 = new Worker("������� ������",45000);
        work3.setPosition(pos3);
        Worker work4 = new Worker("�������� �����", 35000);
        work4.setPosition(pos4);

        Firm firm1 = new Firm("ITDev");
        firm1.addWorker(work1);
        firm1.addWorker(work2);
        firm1.addWorker(work3);
        firm1.addWorker(work4);

        firm1.setSum();

        System.out.println("� ����� �������� " + firm1.getWorkers().size() + " ���������(�): " + "\n" +
        firm1.getWorkers());

        System.out.println("����� �������� �������: " + firm1.getSum());

	}

}
