import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseManager {

    HashMap<User, Map<User,Double>> balanceSheet=new HashMap<>();

    public void addUser(User user){
        balanceSheet.put(user,new HashMap<>());
    }

    public void addExpense(User paidBy, double amount, List<User> participants,List<Double> shares,String description,SplitStrategy strategy){

        List<Split> splits=strategy.calculateSplits(paidBy,amount,participants,shares);

        for(Split split:splits){
            User participant=split.user;
            double splitAmount=split.amount;

            if(participant.equals(paidBy)){
                continue;
            }
            balanceSheet.get(participant).put(paidBy,balanceSheet.get(participant).getOrDefault(paidBy,0.0)+splitAmount);
            balanceSheet.get(paidBy).put(participant,balanceSheet.get(paidBy).getOrDefault(participant,0.0)-splitAmount);


        }
        System.out.println(description + " of ₹" + amount + " paid by " + paidBy.name);
    }

    public void showBalances() {
        System.out.println("\nFinal Balances:");
        for (User u1 : balanceSheet.keySet()) {
            for (User u2 : balanceSheet.get(u1).keySet()) {
                double amount = balanceSheet.get(u1).get(u2);
                if (amount > 0) {
                    System.out.println(u1.name + " owes " + u2.name + ": ₹" + amount);
                }
            }
        }
    }

}
