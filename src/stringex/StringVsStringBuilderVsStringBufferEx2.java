package stringex;

public class StringVsStringBuilderVsStringBufferEx2 {
	
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
        long startTime = (System.currentTimeMillis()/1000)%60;  
        StringSpeedTest();
        long sec=((System.currentTimeMillis()/1000)%60)-startTime;
        System.out.println("String speed "+sec);
        startTime = (System.currentTimeMillis()/1000)%60;  
        StringBufferSpeedTest();  
        sec=((System.currentTimeMillis()/1000)%60)-startTime;
        System.out.println("StringBuffer speed "+sec);
        startTime = (System.currentTimeMillis()/1000)%60;  
        StringBuilderSpeedTest();  
        sec=((System.currentTimeMillis()/1000)%60)-startTime;
        System.out.println("StringBuilder speed "+sec);
    } 
}
