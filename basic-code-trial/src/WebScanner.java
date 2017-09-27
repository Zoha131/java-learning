import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WebScanner {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try{
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            Scanner  webInput = new Scanner(url.openStream());
            while (webInput.hasNext())
            {
                System.out.println(webInput.nextLine());
            }
        }
        catch (MalformedURLException e){
            System.out.println(e.toString());
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
