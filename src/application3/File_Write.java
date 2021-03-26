package application3;

import java.io.FileWriter; //importação da clase para escrita em arquivos.
import java.io.IOException;

public class File_Write {

	public static void main(String[] args) {
		try {
			//instanciamos um objeto usando a classe de escrita de arquivos importada do java.
											//passamos o arquivo dentro do diretorio desejado.
			FileWriter myWriter = new FileWriter("/home/alisson/eclipse-workspace/Java-files/src/Java-files.txt"); 
			//metodo write para escrita no arquivo passando como parametros o texto desejado.
			myWriter.write("i'm gonna be the best java programmer! one day ...");
			myWriter.write("\nday after day i'm gonna programming for the best results ...");
			myWriter.write("Write by Alisson ...");
			
			myWriter.close(); //após usarmos o metodo write, precisamos usar .close para fechar .			
			System.out.println("sucesso ao escrever no arquivo ! ");
		} 
		//tratamento de erros :
		catch (IOException e) {
			System.out.println("um erro ocorreu: "+e.getMessage());
			e.printStackTrace(); //mostrar o tipo do erro caso ocorra.
		}
		

	}

}
