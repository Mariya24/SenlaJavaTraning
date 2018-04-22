public class Generator {
	private  static int min;
    private static int max;
    public static int Random(){
        min = 100;
        max = 999;
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
	}
