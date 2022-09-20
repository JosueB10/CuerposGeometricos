package EjemplosFG;

public class Esfera2 {

	//Nombre de variables
	public static void main(String[] args) {
float h,r,R;
double areaZonaesferica,volumenEsferico,AreacasqueteEsferico,VolumenCasqueteEsferico;

//Datos de entrada
r=2;
h=4;
R=6;

//Procesamiento
areaZonaesferica=2*Math.PI*R*h;
volumenEsferico=(Math.PI *h*(Math.pow(h,2)+(3*Math.pow(R,2) + 3*Math.pow(r, 2))))/6;
AreacasqueteEsferico=2*Math.PI*R*h;
VolumenCasqueteEsferico=(Math.PI *Math.pow(h,2)*(3*R-h)/3 );

//Datos de salida

System.out.println("Datos de la esfera 2");
System.out.println("Zona esferica: ");
System.out.println("1.Area de la zona esferica: "+ String.format("%.2f",areaZonaesferica));
System.out.println("2.Volumen de la zona esferica: "+ String.format("%.2f",volumenEsferico));
System.out.println("Casquete esferico: ");
System.out.println("1.Area del casquete esferico: "+ String.format("%.2f",AreacasqueteEsferico));
System.out.println("2.Volumen del casquete esferico: "+ String.format("%.2f",VolumenCasqueteEsferico));
	}

}
