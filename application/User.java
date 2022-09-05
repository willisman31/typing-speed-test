package application;
public class User {

    private int topWPM;
    private String name;
    private Score[] scores;
    
    public User() {
        this.topWPM = 0;
        this.scores = null;
        this.name = "User";
    }
    
    public User(String name) {
    	this.topWPM = 0;
    	this.scores = null;
    	this.name = name;
    }

    public int getTopWPM() {
        return this.topWPM;
    }

    public void setTopWPM(int newWPM) {
        this.topWPM = newWPM;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setScores(Score[] scores) {
    	this.scores = scores;
    }
    
    public Score[] getScores() {
    	return this.scores;
    }
    
    public void addScore(Score score) {
    	Score[] updatedScores = new Score[this.scores.length + 1];
    	for (int i = 0; i < this.scores.length; i++) {
    		updatedScores[i] = this.scores[i];
    	}
    	updatedScores[updatedScores.length - 1] = score;
    	this.scores = updatedScores;
    }
    
    public String toString() {
    	return this.getName();
    }
}
