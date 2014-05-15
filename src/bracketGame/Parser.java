package bracketGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Parser.java
 * 
 * @author Miles
 * @version 5/12/14
 */
public class Parser {

	
	public static void main(String[] args) throws Exception {
		
		//Open a URL connection to ESPN's playoff bracket page.
		URL espnBracket = new URL("http://espn.go.com/nba/bracket");
		//Create a buffered reader which will read the web page's HTML source code.
		BufferedReader in = new BufferedReader(new InputStreamReader(espnBracket.openStream()));
		
		
		//Create a string to hold each line of the HTML code that is read in.
		String inputLine;
		while ((inputLine = in.readLine()) != null) { //While there is still a line of the HTML page to be read,
			if (inputLine.indexOf("<dl>") > -1) { //If inputLine contains the string "<dl>",
			System.out.println(inputLine.substring(inputLine.indexOf("<dl>"), inputLine.lastIndexOf("</dl>"))+"\n");
			//System.out.println(inputLine);
			}//---end if
		}//---end while
			
	}

}
