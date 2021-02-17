import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

/**
 * @author linyu
 *
 */
public class PrintInternationalStuff {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Locales.
		//Malaysia locale.
		Locale mLocale = new Locale("ms","MY");
		//Germany locale.
		Locale gLocale = new Locale("de","DE");
		//United states locale.
		Locale uLocale = new Locale("en", "US");
		
		//Today's dates.
		DateFormat mDateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, mLocale);
		DateFormat gDateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, gLocale);
		DateFormat uDateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, uLocale);
		//Print dates.
		System.out.println("Today's date (Malaysia): " + mDateFormat.format(new Date()));
		System.out.println("Today's date (Germany): " + gDateFormat.format(new Date()));
		System.out.println("Today's date (United States): " + uDateFormat.format(new Date()) + "\n");
		
		//Days of week (& print).
		DateFormatSymbols mSymbols = new DateFormatSymbols(mLocale); 
		String[] mDayNames = mSymbols.getShortWeekdays();
		System.out.println(Arrays.toString(mDayNames));
		DateFormatSymbols gSymbols = new DateFormatSymbols(gLocale); 
		String[] gDayNames = gSymbols.getShortWeekdays();
		System.out.println(Arrays.toString(gDayNames));
		DateFormatSymbols uSymbols = new DateFormatSymbols(uLocale); 
		String[] uDayNames = uSymbols.getShortWeekdays();
		System.out.println(Arrays.toString(uDayNames));
		System.out.println("\n");
		
		//Currency symbols.
		Currency mCurrency = Currency.getInstance(mLocale);
		Currency gCurrency = Currency.getInstance(gLocale);
		Currency uCurrency = Currency.getInstance(uLocale);
		//Print currency.
		System.out.println("Cost of a litre-of-milk (Malaysia): 2.50" + mCurrency.getSymbol());
		System.out.println("Cost of a litre-of-milk (Germany): 2.50" + gCurrency.getSymbol());
		System.out.println("Cost of a litre-of-milk (Spain): 2.50" + uCurrency.getSymbol());
	 }
} 