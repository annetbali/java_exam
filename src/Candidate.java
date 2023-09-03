//defining a candidate class with attributes name, votes
public class Candidate {
    private String name;
    private int votes;
    //initializing the attributes in a constructor
    public Candidate(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }
    //    getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}