public class Sum {
	public static String Summ(String[] arr){
		String sum;
        Integer s = 0;
        for (int i = 0; i < arr.length; i++){
            s = s + Integer.parseInt(arr[i]);
        }
        sum = s.toString();
        return sum;
	}
}

