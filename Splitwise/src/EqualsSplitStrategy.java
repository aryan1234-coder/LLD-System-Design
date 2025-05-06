//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
//
public class EqualsSplitStrategy implements SplitStrategy {

    @Override
    public List<Split> calculateSplits(User paidBy, double amount, List<User> participants, List<Double> shares) {
        List<Split> splits = new ArrayList<>();
        double shareAmount=amount/participants.size();
        for(User participant: participants){
            splits.add(new Split(participant,shareAmount));
        }
        return splits;
    }
}




