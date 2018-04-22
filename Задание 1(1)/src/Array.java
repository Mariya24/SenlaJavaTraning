import java.util.Scanner;

public class Array {
	private String[] w; 
    private Scanner sc;

    public Array(Scanner sc){
        this.sc = sc;
    }

    public String[] getWord() {
        return w;
    }

    public void addWord() {
        for (int i = 0; i < w.length; i++){
            w[i] = sc.nextLine();
        }
    }

    public void setWord(String[] w) {
        this.w = w;
    }

    public Scanner getIn() {
        return sc;
    }

    public void setIn(Scanner sc) {
        this.sc = sc;
}
}
