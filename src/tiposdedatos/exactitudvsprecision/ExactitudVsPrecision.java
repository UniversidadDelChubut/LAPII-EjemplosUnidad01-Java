package tiposdedatos.exactitudvsprecision;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExactitudVsPrecision {

	// -- Ver artículos --
	//          https://www.linkedin.com/pulse/precision-vs-accuracy-hargun-singh/
	//          https://english.stackexchange.com/questions/30498/are-accuracy-and-precision-interchangeable-nouns
	//          https://en.wikipedia.org/wiki/Accuracy_and_precision
	//          https://es.wikipedia.org/wiki/Precisi%C3%B3n_y_exactitud
	
	public static void main(String[] args) {
		
		double x = 0.1 + 0.1 + 0.1 - 0.3;
		System.out.println(x);
	
		BigDecimal bd = new BigDecimal(0.1).setScale(1, RoundingMode.DOWN);
		bd = bd.add(new BigDecimal(0.1).setScale(1, RoundingMode.DOWN));
		bd = bd.add(new BigDecimal(0.1).setScale(1, RoundingMode.DOWN));
		bd = bd.subtract(new BigDecimal(0.3).setScale(1, RoundingMode.DOWN));
		System.out.println(bd.doubleValue());
		
	}
}
