package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
public class RecordsController {
	
	public boolean createUserRecord(User user) {
		try {
			if (userRecordExists(user)) {
				return false;
			} else {
				String userRecordFileName = ".//" + user.toString() + ".txt";
				File userRecord = new File(userRecordFileName);
				userRecord.createNewFile();
				userRecord.setWritable(true);
				FileWriter writer = new FileWriter(userRecord);
				writer.write(user.toString() + "/n");
				writer.close();
			}
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("Error Creating User Record; user may already exist");
			return false;
		} catch (IOException i) {
			System.out.println("Error Creating User Record; new user record file creation failed");
			return false;
		}
	}
	
	public boolean userRecordExists(User user) throws FileNotFoundException {
		String fileSearch = ".//" + user.toString() + ".txt";
		File userRecord = new File(fileSearch);
		Scanner checkFile = new Scanner(userRecord);
		boolean temp = checkFile.nextLine().equals(user.toString());
		checkFile.close();
		return temp;
	}
	
	public boolean createNewScore(User user, Score score) {
		try {
			String userRecordFileName = ".//" + user.toString() + ".txt";
			File userRecord = new File(userRecordFileName);
			FileWriter writer = new FileWriter(userRecord);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(score.toString());
			bw.close();
			return true;
		} catch (IOException i) {
			System.out.println("Error creating new user score; score could not be added to user record");
			return false;
		}
	}
	
	public Score[] getScores(User user) {
		try {
			String userRecordFileName = ".//" + user.toString() + ".txt";
			File userRecord = new File(userRecordFileName);
			Scanner fileReader = new Scanner(userRecord);
			ArrayList<Score> scoresList = new ArrayList<Score>();
			String rawInput = fileReader.nextLine();
			while(fileReader.hasNextLine()) {
				rawInput = fileReader.nextLine();
				String[] splitInput = rawInput.split("***");
				Score score = new Score(LocalDate.parse(splitInput[0]), Integer.valueOf(splitInput[1]));
				scoresList.add(score);
			}
			fileReader.close();
		} catch (IOException i) {
			System.out.println("Error retrieving user scores; no scores may exist");
			return null;
		}
		return null;
	}
}
