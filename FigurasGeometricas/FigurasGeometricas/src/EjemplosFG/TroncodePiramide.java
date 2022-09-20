package EjemplosFG;

public class TroncodePiramide {

	
	public static void main (String [] args) {
		float r,R,H;
		double AreaLateral,Volumen,AreaTotal,G,AreaBMayor,AreaBMenor;
		
		r=3;
		R=5;
		H=5;
		
		
		AreaBMayor=Math.PI*Math.pow(R,2);
		AreaBMenor=Math.PI*Math.pow(r, 2);
		G=Math.sqrt((Math.pow(H, 2)+Math.pow(r, 2)));
		AreaLateral=Math.PI*G*(R+r);
		AreaTotal=AreaLateral+AreaBMayor+AreaBMenor;
		Volumen=(Math.PI*H*(Math.pow(R, 2)+Math.pow(r, 2)+R*r)/3);
		
		
     System.out.println("Datos del tronco de piramide: ");
     System.out.println("Area Lateral:"+String.format("%.2f",AreaLateral));
     System.out.println("Area Total:"+String.format("%.2f",AreaTotal));
		System.out.println("Volumen"+String.format("%.2f",Volumen));
		System.out.println("Generatriz:"+String.format("%.2f",G));
		
		
		
		
	}
}
