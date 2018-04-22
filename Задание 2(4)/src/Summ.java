public class Summ {
	 public static Integer sumNum(Integer m){
	        Integer sum = 0;
	        String str;
	        str = m.toString();
	        sum = Character.getNumericValue(str.charAt(0))+Character.getNumericValue(str.charAt(1))+Character.getNumericValue(str.charAt(2));
	        return sum;
	 }
}

