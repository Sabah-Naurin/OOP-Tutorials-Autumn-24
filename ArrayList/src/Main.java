import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        System.out.println(numArray);

        numArray.add(1);
        System.out.println(numArray);

        numArray.add(2);
        numArray.add(5);

        System.out.println(numArray);
        System.out.println(numArray.get(1));

        numArray.set(2, 4);
        System.out.println(numArray);


        Box<Integer> b = new Box<>();

        b.set(5);

        System.out.println(b.get());
    }
}