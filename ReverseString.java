public class ReverseString {
 private String find(String value) {
 String reverse = "";
 
 for(int i=value.length(); i>0; i--)
 reverse=reverse+(value.charAt(i-1));
 
 return reverse;
 }
 public static void main(String[] args) {
 System.out.println(new ReverseString().find("SANCHITA")); }
}

