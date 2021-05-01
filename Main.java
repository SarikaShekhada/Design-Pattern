import java.util.List;
 

public class Main {
	//Main Function
    public static void main(String[] args) throws Exception {
        //Instantiate WordGenerator Class
        WordGenerator wg = new WordGenerator();
 
        //VK lines text filename
        String vkFilename = "vk_no.txt";
 
        //Gather VK Lines from text file
        List<String> vkLines = wg.getLines(vkFilename);
 
        //Create word document according to VK lines
        wg.createWord(vkLines);
    }
}