package application1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// FileReader e BufferedReader (try with resource)
		// variavel passando como valor o caminho do arquivo criado dentro do diretorio
		// em questão
		String path = "/home/alisson/eclipse-workspace/Java-files/src/Java-files.txt";
		// instanciando 2 objetos de leitura de arquivo e passando valores nulos
		// inicialmente .

		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// variavel para a leitura das linhas do arquivo.
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error ! :" + e.getMessage());
		}
	}
}
