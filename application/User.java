package application;
public class User {

    private int topWPM;
    private String name;
    
    public User() {
        this.topWPM = 0;
        this.name = "User";
    }
    
    public User(String name) {
    	this.topWPM = 0;
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
}