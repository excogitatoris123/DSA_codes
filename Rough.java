import java.net.SocketPermission;
import java.util.*;



class Rough
{

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//Here writing all available string methods.

//1)equals equalsIgnoreCase 
// String a="njsknfsnfsfnsl";
// String b="njsknfsnfsfnsl";
// System.out.println(a.equals(b)); // true

//2)split("") split("\\s+")
// String a="skjfb             skjbfsfs fbsjkf             bsbfsbvsjhbsui   ";
// String[] b=a.split("\\s+");
// int c=b.length;
// System.out.println(c);
// for(String d:b)
// {
//     System.out.println(d);
// }
//3)substring(start) , substring(start,end)

//4)toUpperCase , toLowerCase.
// String a="sfjkbsfkbskfsk";
// System.out.println(a.toLowerCase());
// System.out.println(a.toUpperCase());

//5) contains -> valueOf  --String
double d=Double.NEGATIVE_INFINITY;
String a="jssjbfsfbskjvskjv sjkv s";
char b='v';

System.out.println(a.contains(String.valueOf(b)));







}
}