import java.io.File;
import java.io.File.*;
public class FindFile {
	public static String searchForFile(File dir, String target) {
		String result = "";
		
		if(!dir.isDirectory())
			return "Path is not a directory";
		
		for(File folderItem : dir.listFiles()) {
			if(folderItem.isDirectory()) {
				result = searchForFile(folderItem,target);
				if (!result.equals("")) 
					return result;
			}else {
				if(folderItem.getName().equals(target))
					return folderItem.getAbsolutePath();
			}
		}
		return "";	
	}
	
}
