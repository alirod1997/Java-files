package application4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {
		// FileWriter & BufferedWriter: para escrever em um arquivo .
		//podemos instanciar um vetor do tipo String e passarmos os valores pré-setados;
		
		String[] lines = new String[] {"Bom dia","Boa tarde","Boa noite"}; 
		
		//agora criamos um arquivo em um diretorio para podermos gravar estes dados dentro dele ;
		String path ="/home/alisson/eclipse-workspace/Java-files/src/escrita.txt";
		System.out.println("funcionou !!!");
		//bloco try with resources : instanciamos os recursos dentro do try, neste caso BufferedWriter recebendo FileWriter:
		//passamos o caminho como parâmetro, no caso "path"
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //se eu adicionar o parametro true, cada vez que for executado vai criar novas linhas dentro do mesmo arquivo
			//laço para gravar no arquivo: para cada linha contida no vetor lines, vai gravar no arquivo.
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); //pra quebrar a linha após cada palavra contida no arquivo.
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
