package stringex;

public class StringVsStringBuilderVsStringBufferEx {
	
	public static String StringSpeedTest()    {  
        String input = "Java";  
        for (int i=0; i<100000; i++){  
        	input = input + "-Test";  
        }  
        return input;  
    } 
	
	public static StringBuffer StringBufferSpeedTest()    {  
        StringBuffer input = new StringBuffer("java");  
        for (int i=0; i<100000; i++){  
        	input.append("-Test");
        }  
        return input;  
    }
	
	public static StringBuilder StringBuilderSpeedTest()    {  
        StringBuilder input = new StringBuilder("java");  
        for (int i=0; i<100000; i++){  
        	input.append("-Test");
        }  
        return input;  
    } 
	public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        StringSpeedTest();
        System.out.println("String speed test "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();  
        StringBufferSpeedTest();  
        System.out.println("StringBuffer speed test : "+(System.currentTimeMillis()-startTime)+"ms"); 
        startTime = System.currentTimeMillis();  
        StringBuilderSpeedTest();  
        System.out.println("StringBuilder speed test : "+(System.currentTimeMillis()-startTime)+"ms"); 
    } 
}
