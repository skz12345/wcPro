package WordTest;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 

public class input {
	public input(){
		
	}
      private String filepath="";//�ļ�·��
	  private String result="";//�����Ľ��
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
	
	public boolean isContainChinese(String str) {//�ж��Ƿ��������ַ�
		 Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
		 Matcher m = p.matcher(str);
		 if (m.find()) {
		  return true;
		 }
		 return false;
		}
	
     public String openFileAndPull ()//��������ĺ���
      {
    	  if((this.filepath).length()==0)//�ж������Ƿ�Ϊ�գ������׳��쳣
    		  throw new IllegalArgumentException("Please input the filename!");
    	  File file = new File(filepath);  
    	  if(!file.getName().endsWith(".txt"))//�ж��Ƿ��ļ���׺Ϊ.txt�������׳��쳣
    		  throw new IllegalArgumentException("Error file format!");
    	  try{
    		  BufferedReader reader=null;
    		  StringBuilder strings=new StringBuilder();
  			  reader=new BufferedReader(new FileReader(file));
  			  String readline="";
  			while((readline=reader.readLine())!=null)//���ж�ȡ�ļ�����
  			{
  				strings.append(readline+"\n");//ÿ��ĩβ���һ�����з�
  				readline=null;
    	    }
  			this.result=strings.toString();//���������result
  			
  			if(isContainChinese(result))//���÷����ж�result���Ƿ��������ַ�
  			{
  				System.out.println("���ı����������ַ���");
  			}
  			reader.close();
      }
    	
    	  catch (Exception e) {
  			
    		  System.out.println("Error path name!");
    	  }
    	  return result;
      }
   
      
	
}
