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

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		//Open a URL connection to ESPN's playoff bracket page.
		URL espnBracket = new URL("http://espn.go.com/nba/bracket");
		//Create a buffered reader which will read the web page's HTML source code.
		BufferedReader in = new BufferedReader(new InputStreamReader(espnBracket.openStream()));
		
		//Create a string to hold each line of the HTML code that is read in.
		String inputLine;
		//int start = 0;
		//int end = 0;
		while ((inputLine = in.readLine()) != null)
			//System.out.println(inputLine.substring(inputLine.lastIndexOf("<dl>"), inputLine.indexOf("</dl>")));
			//start = inputLine.indexOf("<dl>");
			//end = inputLine.indexOf("</dl>");
			//System.out.println(start);
			System.out.println(inputLine);
			
	}

}
