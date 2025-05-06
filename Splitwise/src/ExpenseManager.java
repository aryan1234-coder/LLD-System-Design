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
    
    public void settleUp() {
        Map<User, Double> netBalance = new HashMap<>();

        // Step 1: Calculate net balances for each user
        for (User u1 : balanceSheet.keySet()) {
            for (User u2 : balanceSheet.get(u1).keySet()) {
                double amount = balanceSheet.get(u1).get(u2);
                netBalance.put(u1, netBalance.getOrDefault(u1, 0.0) - amount);
                netBalance.put(u2, netBalance.getOrDefault(u2, 0.0) + amount);
            }
        }

        // Step 2: Separate debtors and creditors
        List<Split> debtors = new ArrayList<>();
        List<Split> creditors = new ArrayList<>();

        for (Map.Entry<User, Double> entry : netBalance.entrySet()) {
            if (entry.getValue() < -0.01) {
                debtors.add(new Split(entry.getKey(), entry.getValue()));
            } else if (entry.getValue() > 0.01) {
                creditors.add(new Split(entry.getKey(), entry.getValue()));
            }
        }

        int i = 0, j = 0;

        // Step 3: Greedy Settlement
        System.out.println("\nSettlement Transactions:");
        while (i < debtors.size() && j < creditors.size()) {
            Split debtor = debtors.get(i);
            Split creditor = creditors.get(j);

            double minAmount = Math.min(-debtor.amount, creditor.amount);

            System.out.println(debtor.user.name + " pays " + creditor.user.name + " ₹" + minAmount);

            debtor.amount += minAmount;
            creditor.amount -= minAmount;

            if (Math.abs(debtor.amount) < 0.01) i++;
            if (Math.abs(creditor.amount) < 0.01) j++;
        }
    }

    // Helper class to hold user and their net balance
    
   


}
