
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
public static void main(String[] args)
 {
		String filename ="input1.txt";
		List<String> list = new ArrayList<>();
		int[] numbers = new int[]{6,8,68,86,666,668,686,688,866,868,886,888,6666,6668,6686,6688,6866,6868,6886,6888,8666,8668,8686,8688,8866,8868,8886,8888};
		try(BufferedReader br = Files.newBufferedReader(Paths.get(filename))){
			list = br.lines().parallel().collect(Collectors.toList()); 
			int loopcount = Integer.parseInt(list.get(0));
			for(int i=0;i<loopcount;i++)
			{
				int x = Integer.parseInt(list.get(i + 1));
				boolean flag =false;
				for(int j= 0;j< numbers.length;j++)
				{
					if(numbers[j] % x == 0)
					{
						flag = true;
						System.out.println(numbers[j]);
						break;
					}
				}
				if(!flag)
					System.out.println(-1);
			}	
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

}

