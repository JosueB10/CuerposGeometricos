package EjemplosFG;

	public class octaedro {

		public static void main(String[] args) {
			double a,A,V;
			
			a=2;
			A=2*Math.pow(a, 2)*Math.sqrt(3);
			V=Math.sqrt(2)/3*Math.pow(a, 3);
			
			System.out.println("datos del octaedro:");
	        System.out.println("area menor:"+String.format("%.2f",a));
	        System.out.println("Area mayor"+String.format("%.2f",A));
	        System.out.println("volumen:"+String.format("%.2f",V));
	        
		}

	}

