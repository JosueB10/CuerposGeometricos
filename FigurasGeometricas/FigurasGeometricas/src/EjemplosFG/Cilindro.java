package EjemplosFG;

public class Cilindro {

	public static void main(String[] args) {
		//Nombre de variables
		float h,r;
		double areaLateral,areaTotal,volumen;
		
		//Datos de entrada
		h=8;
		r=5;
		
		//procesamiento
		areaLateral= 2*Math.PI*r*h;
		areaTotal= 2*Math.PI*r*(h+r);
		volumen= Math.PI*Math.pow(r,2)*h;
		
		//Datos de salidas (Resultados)
		System.out.println("Datos del cilindro");
		System.out.println("1.Area lateral:"+String.format("%.2f",areaLateral));
		System.out.println("2.Area total:"+String.format("%.2f",areaTotal));
		System.out.println("3.Volumen:"+String.format("%.2f",volumen));
	}

}