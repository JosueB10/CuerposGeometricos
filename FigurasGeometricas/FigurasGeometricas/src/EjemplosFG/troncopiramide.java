package tareas;

public class troncopiramide {

	public static void main(String[] args) {
	   float r,R,H;
	   double Arealateral,v,Areatotal,G,Areabmayor,Areabmenor;
	   
	   r=6;
	   R=8;
	   H=3;
	   
	   Areabmayor=Math.PI*Math.pow(R, 2);
	   Areabmenor=Math.PI*Math.pow(r, 2);
	   G=Math.sqrt((Math.pow(H, 2)+(Math.pow(r, 2))));
	   v=(Math.PI*H*(Math.pow(R, 2)+Math.pow(r, 2)+R*r)/3);
	   Arealateral=Math.PI*G*(R+r);
	   Areatotal=Arealateral+Areabmayor+Areabmenor;
	   
	   System.out.println("datos del tronco de la piramide");
	   System.out.println("Area lateral:"+String.format("%.2f",Arealateral));
	   System.out.println("Area Total:"+String.format("%.2f",Areatotal));
	   System.out.println("Volumen:"+String.format("%.2f",v));
	   

	}

}
