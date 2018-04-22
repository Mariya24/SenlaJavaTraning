public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
        int value = Generator.Random();
        System.out.println(value);
        sum = Summ.sumNum(value);
        System.out.println("Сумма цифр: ");
        System.out.println(sum);
}
}
