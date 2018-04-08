package WordTest;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class input {
	public input(){
		
	}
      private String filepath="";//文件路径
	  private String result="";//读出的结果
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
	
	public boolean isContainChinese(String str) {//判断是否有中文字符
		 Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
		 Matcher m = p.matcher(str);
		 if (m.find()) {
		  return true;
		 }
		 return false;
		}
	
     public String openFileAndPull ()//处理输入的核心
      {
    	  if((this.filepath).length()==0)//判断输入是否为空，是则抛出异常
    		  throw new IllegalArgumentException("Please input the filename!");
    	  File file = new File(filepath);  
    	  if(!file.getName().endsWith(".txt"))//判断是否文件后缀为.txt，否则抛出异常
    		  throw new IllegalArgumentException("Error file format!");
    	  try{
    		  BufferedReader reader=null;
    		  StringBuilder strings=new StringBuilder();
  			  reader=new BufferedReader(new FileReader(file));
  			  String readline="";
  			while((readline=reader.readLine())!=null)//按行读取文件内容
  			{
  				strings.append(readline+"\n");//每行末尾添加一个换行符
  				readline=null;
    	    }
  			this.result=strings.toString();//将结果存入result
  			
  			if(isContainChinese(result))//调用方法判断result中是否有中文字符
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
