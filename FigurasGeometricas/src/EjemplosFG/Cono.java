package EjemplosFG;

public class Cono {
	
	public static void main(String[] args) {
		//Nombre de variables
		float r,h;
		double g,areaLateral,areaTotal,volumen;
		
		//Datos de entrada
	r=2;
	h=8;
	
	
	//Procesamiento
	g=Math.sqrt((Math.pow(h,2)+(Math.pow(r,2))));
	areaLateral=Math.PI*r*g;
	areaTotal=Math.PI*r*g+(Math.PI*Math.pow(r,2));
	volumen=(Math.PI*Math.pow(r,2)*h)/3;
	
	
	System.out.println("Datos del cono");
	System.out.println("1.Area lateral: "+String.format("%.2f",areaLateral));
	System.out.println("2.Area Total: "+String.format("%.2f",areaTotal));
	System.out.println("3.Volumen: "+String.format("%.2f",volumen));
	System.out.println("4.Generatriz: "+String.format("%.2f",g));
	
		
	}
	
	
	
	
	

}
