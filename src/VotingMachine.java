import java.util.List;
import java.util.ArrayList;
public class VotingMachine {
    private ArrayList<Candidate> candidates;
    //constructor
    public VotingMachine(ArrayList<Candidate> candidates) {
        this.candidates = new ArrayList<>();
    }
    //getters and setters
    public ArrayList<Candidate> getCandidate() {
        return candidates;
    }

    public void setCandidate(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
    }
    //    defining  methods
    public void addCandidate(String name){
        Candidates.add(candidates);
    }
    public static void main(String[]args){

    }
}
