package EjemplosFG;

public class Dodecaedro {
	public static void main(String[] args) {
		float aris;
		double A,V;
		
		
	
		aris=5;
		A=3*Math.pow(aris, 2)*Math.sqrt(25+10*Math.sqrt(5));
		V=((1*(15+7*Math.sqrt(5))*Math.pow(aris, 3)/4));
		
		System.out.println("Datos del dodecaedro:");
		System.out.println("Area:"+String.format("%.2f",A));
		System.out.println("Volumen: "+String.format("%.2f",V));
		
		

	}

}
