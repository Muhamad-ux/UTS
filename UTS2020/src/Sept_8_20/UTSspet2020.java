package Sept_8_20;

public class UTSspet2020 {
	
	public static void main (String[] args) {
		String huruf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ-";
		
		char fn [] = {huruf.charAt(5),huruf.charAt(0),huruf.charAt(17),huruf.charAt(7),huruf.charAt(0),huruf.charAt(13),huruf.charAt(26)};
		char pa [] = {huruf.charAt(15),huruf.charAt(4),huruf.charAt(17),huruf.charAt(12),huruf.charAt(0),huruf.charAt(13),huruf.charAt(0)};
		String fn = new String(fn);
		String pa = new String(pa);
		
		System.out.println(fn+pa);
	}
}
