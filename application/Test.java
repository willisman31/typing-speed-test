package application;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
public class Test {

	private Wordlist wordlist;
	private User user;
	private int testLength;
	private int displaySize; // Max number of chars that appear on a single line
	
    public Test() {
        this.wordlist = new Wordlist();
        this.user = new User();
        this.testLength = 60;
    }
    
    public Test(User user) {
    	this.wordlist = new Wordlist();
    	this.user = user;
    	this.testLength = 60;
    }
    
    public Test(User user, Wordlist wordlist) {
    	this.user = user;
    	this.wordlist = wordlist;
    	this.testLength = 60;
    }
    
    public Test(User user, Wordlist wordlist, int testLength) {
    	this.user = user;
    	this.wordlist = wordlist;
    	this.testLength = testLength;
    }
    
    public Wordlist getWordlist() {
    	return this.wordlist;
    }
    
    public User getUser() {
    	return this.user;
    }
    
    public int getTestLength() {
    	return this.testLength;
    }
    
    public void setWordlist(Wordlist wordlist) {
    	this.wordlist = wordlist;
    }
    
    public void setUser(User user) {
    	this.user = user;
    }
    
    public void setTestLength(int testLength) {
    	this.testLength = testLength;
    }

    public void runTest() {
    	// TODO
    	Timer timer = new Timer();
    	timer.scheduleAtFixedRate(new TimerTask() {
    		@Override
    		public void run() {
    			// test
    		}
    	}, this.testLength*1000, this.testLength*1000);
    }
    
    public int getDisplaySize() {
    	return this.displaySize;
    }
    
    public void setDisplaySize(int displaySize) {
    	this.displaySize = displaySize;
    }
    
    public String[] displayedWords() {
    	// TODO
    	ArrayList<String> displayWordsLiveList = new ArrayList<String>();
    	int runningTotal = 0;
    	while (runningTotal < this.displaySize) {
    		
    	}
    	
    	return null;
    }
}
