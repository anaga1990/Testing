package stringex;

import java.util.Formatter;
import java.util.Locale;

public class FormatEx3 {
	public static void main(String[] args) {

	      // create a new formatter
	      StringBuffer buffer = new StringBuffer();
	      Formatter formatter = new Formatter(buffer, Locale.FRANCE);

	      // format a new string
	      String name = "Testing";
	      formatter.format(Locale.FRANCE,"My company's name is %s !", name);

	      // print the formatted string with specified locale
	      System.out.println("" + formatter + " " + formatter.locale());
	   }
}
