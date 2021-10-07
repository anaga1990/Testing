package stringex;

public class JoinAndReplaceFirstEx {
	public static void main(String[] args) {
		String string = String.join("--","java","is","cool","programming","language");
		System.out.println(string);
		String string2 = "10";  //10.255. 255.255.
		String string3 = "225";
		String string4 = "225";
		String string5 = "10";
		String ipAddress = String.join(".", string2, string3, string4, string5);
		System.out.println(ipAddress);
		
		int[] ip_parts = {10,220,250,122};
		
		String ip="";
		for (int i = 0; i < ip_parts.length; i++) {
			ip = ip+"."+ip_parts[i];
		}
		ip=ip.replaceFirst(".", "");
		System.out.println(ip);
	}
}
