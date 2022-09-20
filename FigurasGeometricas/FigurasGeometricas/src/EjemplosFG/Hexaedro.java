package EjemplosFG;
public class Hexaedro {

	public static void main(String[] args) {
		double am,AM,D,V;
		
		am=2.25;
		AM=6*Math.pow(am, 2);
		V=Math.pow(am, 3);
		D=am*Math.sqrt(3);
		
		System.out.println("datos del hexaedro:");
	    System.out.println("area menor:"+String.format("%.2f",am));
	    System.out.println("Area mayor:"+String.format("%.2f",AM));
	    System.out.println("Volumen:"+String.format("%.2f",V));
	    System.out.println("D:"+String.format("%.2f",D));
		

	}

}
