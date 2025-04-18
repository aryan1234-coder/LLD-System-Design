import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User u1 = new User("u1", "Aryan");
        User u2 = new User("u2", "Raj");
        User u3 = new User("u3", "Megha");
        User u4 = new User("u4", "Alok");

        ExpenseManager manager = new ExpenseManager();
        manager.addUser(u1);
        manager.addUser(u2);
        manager.addUser(u3);
        manager.addUser(u4);

        // Equal split among Raj, Megha, Alok (Aryan paid)
        manager.addExpense(
                u1, 1200,
                Arrays.asList(u2, u3, u4),
                null,
                "Food",
                new EqualsSplitStrategy()
        );

        // Exact amount split (Aryan paid 1000 for Raj-400, Megha-300, Alok-300)
        manager.addExpense(
                u1, 1000,
                Arrays.asList(u2, u3, u4),
                Arrays.asList(400.0, 300.0, 300.0),
                "Hotel",
                new UnequalSplitStrategy()
        );

        // Percentage split (Megha paid 2000; Aryan-50%, Raj-30%, Alok-20%)
        manager.addExpense(
                u3, 2000,
                Arrays.asList(u1, u2, u4),
                Arrays.asList(50.0, 30.0, 20.0),
                "Roaming",
                new PercentageSplitStrategy()
        );

        manager.showBalances();

    }
}