package TESTWC;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import wordtest.input;

import org.junit.After;
public class inputTest {
	private input input;
	@Before
	public void setUp() throws Exception {
	 input = new input();
	}
	@After
	public void tearDown() throws Exception {
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void openFileAndPullTest1()throws IllegalArgumentException {
		String file="";
		input=new input(file);
		input.openFileAndPull ();
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void openFileAndPullTest2()throws IllegalArgumentException {
		String file="tes";
		input=new input(file);
		input.openFileAndPull ();
		
		
	}
	
	@Test
	public void openFileAndPullTest3() {
		String file="tes.txt";
		input=new input(file);
		assertEquals("ERROROPEN DECLAERE WRONG","", input.openFileAndPull ());
		
	}
	
	@Test
	public void openFileAndPullTest4() {
		String file="d:/tes.txt";
		input=new input(file);
		assertEquals("ERROROPEN DECLAERE WRONG","", input.openFileAndPull ());
		
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void openFileAndPullTest5()throws IllegalArgumentException {
		String file="test1.bat";
		input=new input(file);
		input.openFileAndPull ();
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void openFileAndPullTest6()throws IllegalArgumentException {
		String file="test2.html";
		input=new input(file);
		input.openFileAndPull ();
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void openFileAndPullTest7()throws IllegalArgumentException {
		String file="test3.c";
		input=new input(file);
		input.openFileAndPull ();
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void openFileAndPullTest8()throws IllegalArgumentException {
		String file="test4.java";
		input=new input(file);
		input.openFileAndPull ();
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void openFileAndPullTest9()throws IllegalArgumentException {
		String file="test5.dll";
		input=new input(file);
		input.openFileAndPull ();
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void openFileAndPullTest10()throws IllegalArgumentException {
		String file="test6.project";
		input=new input(file);
		input.openFileAndPull ();
		
		
	}
	
	@Test
	public void getFilepathTest11() {
		String file="test1.bat";
		input=new input(file);
		assertEquals("getFilepath wrong","test1.bat", input.getFilepath());
		
		
	}
	
	@Test
	public void getFilepathTest12() {
		String file="test7.txt";
		input=new input(file);
		assertEquals("getFilepath wrong","test7.txt", input.getFilepath());
		
		
	}
	
	@Test
	public void getResultTest13() {
		String file="test7.txt";
		input=new input(file);
		input.openFileAndPull ();
		assertEquals("getResult wrong","hello"+"\n", input.getResult());
		
		
	}
	
	@Test
	public void isContainChineseTest14() {
		String content="hello ";
		assertEquals("chineseJudgement wrong",false, input.isContainChinese(content));
	}
		
	@Test
	public void isContainChineseTest15() {
		String content="hello 你好 ";
		assertEquals("chineseJudgement wrong",true, input.isContainChinese(content));	
		
	}
	
	@Test
	public void openFileAndPullTest16() {
		String file="test8.txt";
		input=new input(file);
		input.openFileAndPull ();
		String temp="hello hello let's let's";
		assertEquals("fileContentGet Wrong",temp+"\n", input.openFileAndPull());	
		
	}
	
	@Test
	public void openFileAndPullTest17() {
		String file="test9.txt";
		input=new input(file);
		input.openFileAndPull ();
		String temp="content-based\ncontent-based\nTABLE1-2\nTABLE1-2";
		assertEquals("fileContentGet Wrong",temp+"\n", input.openFileAndPull());	
		
	}
	
	@Test
	public void openFileAndPullTest18() {
		String file="test10.txt";
		input=new input(file);
		input.openFileAndPull ();
		String temp="night- night-\nTABLE1-2 TABLE1-2\n(see Box 3–2).8885d_c01_01";
		assertEquals("fileContentGet Wrong",temp+"\n", input.openFileAndPull());	
		
	}
	
	@Test
	public void openFileAndPullTest19() {
		String file="test11.txt";
		input=new input(file);
		input.openFileAndPull ();
		String temp="'I 'I' 'I\nLet's Let's\nsoftware 你好";
		assertEquals("fileContentGet Wrong",temp+"\n", input.openFileAndPull());	
		
	}
	
	@Test
	public void openFileAndPullTest20() {
		String file="test12.txt";
		input=new input(file);
		input.openFileAndPull ();
		String temp="hello，my name is Lili.\nI am from America, nice to meet you!\n你好，我叫李磊。";
		assertEquals("fileContentGet Wrong",temp+"\n", input.openFileAndPull());	
		
	}
	
	
	
	
	
	
}
