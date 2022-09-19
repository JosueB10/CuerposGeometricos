package EjemplosFG;

public class Prisma {

	public static void main(String[] args) {
		//Nombre de variables
		float areaLateral;
		float Pbase, h , n , l;
		double AnguloCentral,apotema,Abase,areaTotal,volumen;
		
		
		//Datos de entrada
		h=20;
		n=5;
		l=8.5f;
		Pbase= n*l;
		areaLateral= Pbase*h;
		
		
		//procesamiento
		AnguloCentral= (360/n)*(Math.PI/180);
		apotema= l/(2*Math.tan(AnguloCentral/2));
		Abase= (Pbase*apotema)/2;
		areaTotal= areaLateral + 2*Abase;
		volumen = Abase*h;
		
		//Datos de salidas (Resultados)
		System.out.println("1.Datos del prisma");
		System.out.println("2.Cantidad de lados:"+n);
		System.out.println("3.Longitud  de lados:"+l);
		System.out.println("4.Altura:"+h);
		System.out.println("5.Perimetro de la base:"+Pbase);
		System.out.println("6.Area de la base:"+String.format("%.2f",Abase));
		System.out.println("7.apotema:"+String.format("%.2f",apotema));
		System.out.println("8.Area lateral:"+areaLateral);
		System.out.println("9.Area total:"+String.format("%.2f",areaTotal));
		System.out.println("10.Volumen:"+String.format("%.2f",volumen));
		
	}
	
	
	
}	