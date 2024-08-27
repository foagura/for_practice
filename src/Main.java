import java.util.ArrayList;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        /*　拡張for文の記述　*/
        int[] scores = {1, 5, 10};

        for(int score : scores) {
            System.out.println(score);
        }

        ArrayList<Integer> scoreslist = new ArrayList<>();

        scoreslist.add(1);
        scoreslist.add(5);
        scoreslist.add(10);
        scoreslist.add(15);

        for(int score : scoreslist) {
            System.out.println(score);
        }

        /*　通常for文の記述　*/
        int[] numbers = {1, 5, 10, 15};

        for(int i = 0; i <= 3; i++) {
            System.out.println(numbers[i]);
        }
    }
}