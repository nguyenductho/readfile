package readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadTextFileExample {
	
	public static void main(String[] args) throws IOException {

		int beginIndex, data = 0, retry = 0, mdpchoice, locations = 0, symState = 0, trans, mdpState, endIndex;
		String word, keyWord;
		
		System.out.println("data" + ";retry" + ";locations" + ";symbStates" + ";mdpState=" + ";mdpTrans=" + ";mdpChoices");
		
		//List<String> lines = Files.readAllLines(Paths.get("F:\\OneDrive\\IT Master Program\\Thesis\\maxlost_T150.log"));//.forEach(System.out::println);
		
		List<String> lines = Files.readAllLines(Paths.get("F:\\OneDrive\\IT Master Program\\Thesis\\pmax_lost_T150.log"));//.forEach(System.out::println);
		
		
		for (String line : lines) {
            //System.out.println(line);
        	
        	if (line.startsWith("Model constants:")) {
        		beginIndex = new String("Model constants: RETRY=").length(); 	
        		word = line.substring(beginIndex,beginIndex+1);
        		retry = Integer.parseInt(word);
        		
        		beginIndex = new String("Model constants: RETRY=0,DATA=").length();
        		word = line.substring(beginIndex,beginIndex+2);
        		
        		data = Integer.parseInt(word);
        		//System.out.println("data = " + data + "; retry = " + retry);
        	}
        	
        	if (line.startsWith("PTA: ")) {
        		keyWord = "clocks, ";
        		beginIndex = line.indexOf(keyWord) + new String(keyWord).length(); ;
        		endIndex = line.indexOf(" ", beginIndex);
        		word = line.substring(beginIndex,endIndex);
        		locations = Integer.parseInt(word);
        		
        		//System.out.println("data = " + data + "; retry = " + retry + "; locations = " + word);
        	}

        	if (line.startsWith("Graph: ")) {
        		beginIndex = new String("Graph: ").length(); 	
        		endIndex = line.indexOf(" ", beginIndex);
        		word = line.substring(beginIndex,endIndex);
        		symState = Integer.parseInt(word);
        		//System.out.println("data=" + data + "; retry=" + retry + "; locations=" + locations + "; symbStates=" + symState);
        	}

        	if (line.startsWith("Building MDP... ")) {
        		beginIndex = new String("Building MDP... ").length(); 	
        		endIndex = line.indexOf(" ", beginIndex);
        		word = line.substring(beginIndex,endIndex);
        		mdpState = Integer.parseInt(word);
        		
        		keyWord = "initial), ";
        		beginIndex = line.indexOf(keyWord) + new String(keyWord).length();;
        		endIndex = line.indexOf(" ", beginIndex);
        		word = line.substring(beginIndex,endIndex);
        		trans = Integer.parseInt(word);
        		
        		keyWord = "transitions, ";
        		beginIndex = line.indexOf(keyWord) + new String(keyWord).length();;
        		endIndex = line.indexOf(" ", beginIndex);
        		word = line.substring(beginIndex,endIndex);
        		mdpchoice = Integer.parseInt(word);
        		
        		//System.out.println("data=" + data + "; retry=" + retry + "; locations=" + locations + "; symbStates=" + symState + 
        		//		"; mdpState=" + mdpState + "; mdpTrans=" + trans + "; mdpChoices=" + mdpchoice);
        		
        		System.out.println(data + ";" + retry + ";" + locations + ";" + symState + ";" + mdpState + ";" + trans + ";" + mdpchoice);
        		System.out.println("thanks");
        	}
        	
        	
        }
    }
}
