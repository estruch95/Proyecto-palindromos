
public class EsCapicua implements Runnable{
	//Atributos de la clase
	private String palabras[];

	public EsCapicua(String palabras[]) {
		// TODO Auto-generated constructor stub
		//Constructor y declaración de atributos de la clase
		this.palabras = palabras;
	}

	//Método RUN del thread
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int a=0; a<palabras.length; a++){
			espalindromo(palabras[a]);
		}	
	}
	
	//Método encargado de comprobar si la palabra recibida por parámetro es palíndromo
	public void espalindromo(String cadena){
	    boolean valor=true;
	    int i,ind;    
	    String cadena2="";
	    	
	    	//QUITAMOS LOS ESPACIOS
		    for (int x=0; x<cadena.length(); x++) {
		        if (cadena.charAt(x) != ' ')
		            cadena2 += cadena.charAt(x);
		    }
		    //VOLVEMOS A ASIGNAR LAS VARIABLES
		    cadena=cadena2;    
		    ind=cadena.length();
		    
		    //REALIZAMOS LA COMPARACIÓN DE CADENAS
		    for (i= 0 ;i < (cadena.length()); i++){        
		       if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
		           //SI ALGUNA LETRA NO CORRESPONDE NO ES UN PALÍNDROMO
		           //SALE DEL BUCLE CON VALOR FALSO
		            valor=false;
		            break;
		       }
		       else{
		    	   valor = true;
		       }
		       ind--;
		    }
		    
		    if(valor == false){
		    	System.out.println(cadena+": No es un palíndromo");
		    }
		    else{
		    	System.out.println(cadena+": Es un palíndromo");
		    }
	}
}
