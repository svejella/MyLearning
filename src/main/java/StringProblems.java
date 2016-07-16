/**
 * Created with IntelliJ IDEA.
 * User: svejella
 * Date: 7/5/16
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringProblems {

    public static String reverseString (String str){

        int leng = str.length();
        char[] chr = str.toCharArray();

        for (int i=0; i<leng/2; i++){
            char temp = chr[i];
            chr[i] = chr[leng -1 -i];
            chr[leng-1-i] = temp;
        }

        return String.valueOf(chr);
    }

    public static void main (String [] args){
         String newStr =  reverseWords("WHO AM I");
         System.out.println(newStr);

    }
    public static String reverseWords (String str) {

        str = " ".concat(str);
        StringBuffer str2 = new StringBuffer();
        char[] chr1 =   reverseString(str).toCharArray();
        for (int i=0,j=0; i<chr1.length; i++)
        {
            if (chr1[i] == ' ')
            {
                String str3 = String.valueOf(chr1,j,i-j);
                i++;
                j = i;
                String str4 = reverseString(str3);
                str2 = str2.append(str4).append(' ');
            }



        }
        str2 = str2.deleteCharAt(str2.length()-1);
        return str2.toString();
    }
}
