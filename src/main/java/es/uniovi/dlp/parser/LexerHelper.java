package es.uniovi.dlp.parser;

import javax.print.DocFlavor.STRING;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexerHelper {

	private static final String TAB_PATTERN = "\\\\t";
	private static final String NEWLINE_PATTERN = "\\\\n";
	private static final String ASCII_PATTERN = "\\\\\\d{1,3}";

	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str) {

		try {
			var r = str.replace("'", "");
			if (r.matches(TAB_PATTERN)) {
				return '\t';
			} else if (r.matches(NEWLINE_PATTERN)) {
				return '\n';
			} else if (r.matches(ASCII_PATTERN)) {
				int num = Integer.parseInt(r.substring(1));
				return (char) num;
			} else {
				return r.charAt(0);
			}
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return ' ';
	}

	public static boolean lexemeToBool(String str) {
		try {
			return Boolean.parseBoolean(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return false;
	}

}
