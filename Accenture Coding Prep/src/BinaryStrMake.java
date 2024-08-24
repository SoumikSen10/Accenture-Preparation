import java.util.Scanner;

public class BinaryStrMake
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter binary string: ");
        String str = in.next();

        System.out.println("Result is: "+convert(str));
    }

    private static String convert(String str)
    {
        int n=str.length();
        if(str.length()==0)
            return "";
        String res="";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch=='0' && count==0)
                count=0;
            else if(ch=='0' && count>0)
            {
                res=res+(char)('A'+count-1)+" ";
                count=0;
            }
            else
                count++;
        }
        if(str.charAt(n-1)=='1')
            res+=(char)('A'+count-1);
        return res;
    }
}
