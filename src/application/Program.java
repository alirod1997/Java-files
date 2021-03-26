package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//File 
		File file = new File("/home/alisson/eclipse-workspace/Java-files/src/Java-files.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("erro ! "+e.getMessage());
			System.out.println("você precisa ter um arquivo de mesmo nome ");
		}finally {
			sc.close();
		}
	}
}