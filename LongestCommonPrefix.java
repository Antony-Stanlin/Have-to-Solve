import java.util.Scanner;

public class LongestCommonPrefix {
    String[] inpuStrings(){
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the no of String: ");
        int n=ob.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=ob.nextLine();
        }
        ob.close();
        return s;
    }

    public static void main(String[] args) {
        String s[]={"dtechie delight", "dtech", "dtechie", "dtechnology", "dtechnical"};
        String max=s[0];
        int i,j;
        for(i=1;i<s.length;i++){
            for(j=0;j<s[i].length()&&j<max.length();j++){
                if(s[i].charAt(j)!=max.charAt(j)){
                    break;
                }
            }
            max=max.substring(0, j);
        }
        System.out.println(max);
    }

}