package logica;


public class Parcial {
	
	public String raices(double a, double b, double c) throws Exception {
		
		if (a == 0) {
			throw new Exception("no es una ecuación de segundo orden si a es 0");
		}
		if(Math.pow(b,2)  -4*a*c < 0) {
			throw new Exception("No tiene solución dentro de los numeros reales");
		}
		double termino1 = (-b + Math.sqrt(Math.pow(b,2)  -4*a*c))/(2*a);
		double termino2 = (-b - Math.sqrt(Math.pow(b,2)  -4*a*c))/(2*a);
		
		return "X="+termino1 + ", X=" + termino2;
	}
	
	

}
