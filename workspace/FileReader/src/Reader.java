
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream; 
public class Reader 
{ 
public static void main(String[] args)throws Exception 
{ 

String url= "/home/sneha-prakat/eclipse/abc.csv" ;

String content = "Hello World !!";



Stream.iterate(0, q -> q+1).limit(1000).parallel().forEach(q -> {
	try {
		Files.write(Paths.get(url), content.getBytes());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
});

Stream<String> line = Files.lines(Paths.get(url));


}
} 