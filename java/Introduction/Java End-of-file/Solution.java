import java.util.*;
import java.io.*;

public class JavaEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> line = new ArrayList<>();
		int i =0;
		
		while(sc.hasNextLine()) {
			i++;
			line.add(i+" "+ sc.nextLine());
		}
		
		for(String element : line){
            System.out.println(element);
        }
		
	}

}
