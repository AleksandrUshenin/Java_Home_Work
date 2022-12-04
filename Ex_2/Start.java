package Ex_2;

/**
 * Start
 */
public class Start {

    public static void main(String[] args) {
        Exe1 exe1 = new Exe1();

        System.out.println("result = " + exe1.getNum());

        exe1.exe2(new int[]{ 1, 2 });

        try {
            exe1.exe4();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}