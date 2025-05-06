import java.util.ArrayList;
import java.util.List;

public class UnequalSplitStrategy implements SplitStrategy {

    @Override
    public List<Split> calculateSplits(User paidBy, double amount, List<User> participants, List<Double> shares) {
       List<Split> splits = new ArrayList<>();

      for(int i = 0; i < participants.size(); i++){

          splits.add(new Split(participants.get(i),shares.get(i)));

      }

      return splits;

    }
}
