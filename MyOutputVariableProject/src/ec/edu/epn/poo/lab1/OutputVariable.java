
import java.text.*;
import java.util.Locale;
public class OutputVariable {

	public OutputVariable() {
		// TODO Auto-generated constructor stub
		 long numero = 123098;
		    double pi = Math.PI;
		    
	    System.out.printf("%d %n", numero);
	    System.out.printf("%8d %n", numero);
	    System.out.printf("%f %n", numero);

	    Locale.setDefault(Locale.US); // Use the US format to print out numbers

	    DecimalFormat formato1 = new DecimalFormat("###,###.##");
	    String valorFormateado1 = formato1.format(numero);

	    System.out.printf("%s%n", valorFormateado1);

	}

}
