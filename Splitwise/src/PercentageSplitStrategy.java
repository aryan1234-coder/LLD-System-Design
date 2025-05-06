import java.util.ArrayList;
import java.util.List;

public class PercentageSplitStrategy implements SplitStrategy {

    @Override
    public List<Split> calculateSplits(User paidBy, double amount, List<User> participants, List<Double> shares) {
        List<Split> splits = new ArrayList<Split>();
            for(int i = 0; i < participants.size(); i++){
                double partTimeAmount=(shares.get(i)*amount)/100.0;
                splits.add(new Split(participants.get(i),partTimeAmount));
            }

            return splits;

    }
}
