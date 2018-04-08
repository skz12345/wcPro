//author：Mason
package wordtest;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 


public class input {
	public input(){
		
	}
      private String filepath="";//the path of file
	  private String result="";//the result of input
	public String getFilepath() {
		return filepath;
	}

	public String getResult() {
		return result;
	}

	public input(String filepath)
      {
    	  this.filepath=filepath;
      }
	
	public boolean isContainChinese(String str) {//judgement of Chinese character
		 Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
		 Matcher m = p.matcher(str);
		 if (m.find()) {
		  return true;
		 }
		 return false;
		}
	
     public String openFileAndPull ()//core part
      {
    	  if((this.filepath).length()==0)//judgement of null and then throw exceptions
    	  { throw new IllegalArgumentException("Please input the filename!");}
    	  File file = new File(filepath);  
    	  if(!file.getName().endsWith(".txt"))//judgement of “.txt” and then throw exceptions
    		  {throw new IllegalArgumentException("Error file format!");}
    	  try{
    		  BufferedReader reader=null;
    		  StringBuilder strings=new StringBuilder();
  			  reader=new BufferedReader(new FileReader(file));
  			  String readline="";
  			while((readline=reader.readLine())!=null)//read the file line by line 
  			{
  				strings.append(readline+"\n");//add a \n at the end of each line read out 
  				readline=null;
    	    }
  			this.result=strings.toString();//result assignment
  			
  			if(isContainChinese(result))//judgement of Chinese charactor
  			{
  				System.out.println("（文本中有中文字符）");
  			}
  			reader.close();
      }
    	
    	  catch (Exception e) {
  			
    		  System.out.println("Error path name!");
    	  }
    	  return result;
      }
   
      
	
}
