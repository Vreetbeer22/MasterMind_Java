package opdrachten;

public class ExceptionEx1 {

    public static void main(String args[]) {

        int[] vals = {3, 2, 6, 1};
        
        int total = 0;

        for (int i = 0; i < vals.length; i++) {
            total += vals[i];
        }
         System.out.println(total);
    }

}
