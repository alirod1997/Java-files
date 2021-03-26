package application2;

import java.io.File;
import java.io.IOException;

public class File_Create {

	public static void main(String[] args) {
		//bloco try 
		try {
			//criamos um objeto usando a classe file para trabalhar com arquivos;
			//Passamos especificação do Diretório onde queremos criar o arquivo, passando o nome e a extensão.
			File myObj = new File("/home/alisson/eclipse-workspace/Java-files/src/Java-files.txt");
			
			//usamos o if-else para criar o arquivo caso não exista no diretorio ainda .
			if (myObj.createNewFile()) { //passamos o objeto criado e usamos o método da classe File do java para criação de arquivo.
				System.out.println("File Created: " + myObj.getName());
			} else {
				//caso o arquivo já exista essa mensagem será exibida.
				System.out.println("File  already exists !");
			}
			//tratamento de possiveis erros de entrada de arquivos .
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage()); //exibe o erro
		}
		
	}
}
