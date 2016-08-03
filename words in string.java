import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WordCount {
public static void main(String[] args) throws IOException {
System.out.print("Please enter a string: ");
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String string = reader.readLine();
String[] words = string.split("\\s+"); // match one or more spaces
System.out.println("\""+string+"\""+" has "+words.length+" words");
System.out.println("The words are, ");
for(int i =0;i<words.length;i++) {
System.out.println(words[i]);
}
}
}
