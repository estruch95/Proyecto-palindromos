import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creación de un threadPool de 3 threads
		ThreadPoolExecutor threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

		//ARRAY DE 25 PALABRAS
		String palabras[] = new String[]{"ADA", "Jose", "melon", "Adrian", "David", "sal", "Toni", "Jorge", "Luís",
		"Magaña", "Araujo", "manzana", "ciruelo", "casa", "hola", "DAM", "developer",
		"preguntas", "contestaciones", "sandía", "ALA", "Gandia", "motocicleta", "Manolo", "SOMOS"};
		//Creación del thread
		EsCapicua threadCapicua = new EsCapicua(palabras);
		//Ejecución del thredPool
		threadPool.execute(threadCapicua);
	}
}
