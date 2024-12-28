import java.util.Scanner;

public class Separater {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        String s=ob.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                System.out.println();
            else if(!(s.charAt(i)<='z' && s.charAt(i)>='a') && !(s.charAt(i)<='9' && s.charAt(i)>='0'))
                System.out.println();
            System.out.print(s.charAt(i));
            if(!(s.charAt(i)<='Z' && s.charAt(i)>='A') && !(s.charAt(i)<='z' && s.charAt(i)>='a') && !(s.charAt(i)<='9' && s.charAt(i)>='0'))
                System.out.println();
        }


        //System.out.println(s);
    }
}
