import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     String[] ws = new String[4];
	     System.out.println("Добавить число: ");
	     Array arr = new Array(sc);
	     arr.setWord(ws);
	     arr.addWord();
	     System.out.println("Массив чисел: ");
	     for (int i = 0; i < arr.getWord().length; i++){
	          System.out.print(" "+ arr.getWord()[i]);
	     }
	     System.out.println("\n"+"Сумма чисел равна: " + Sum.Summ(ws));
	}
}


