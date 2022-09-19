package EjemplosFG;



public class Piramide {

	public static void main(String[] args) {
		double Pbase,n,l,h,AP,Alateral;
		double Atotal,volumen,ap,p,Abase;
		
		p=22.0;
		h=5.2;
		n=3;
		l=6.2;
		Pbase=(n*l);
		ap=3.40;
		AP=(h*h)+(ap*ap);
		double APen = Math.sqrt(AP); 
		Alateral=(Pbase*APen);
		Abase=(p*ap)/2;
		Atotal=Alateral+Abase;
		volumen=(Abase*h)/3;
		
		System.out.println("datos de la piramide:");
        System.out.println("numero de lados:"+String.format("%.2f",n));
        System.out.println("longitud de los lados:"+String.format("%.2f",l));
        System.out.println("altura:"+String.format("%.2f",h));
        System.out.println("Area lateral:"+String.format("%.2f",Alateral));
        System.out.println("Area total:"+String.format("%.2f",Atotal));
        System.out.println("volumen:"+String.format("%.2f",volumen));

	}

}
