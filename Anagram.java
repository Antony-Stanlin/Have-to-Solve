import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String s="How can you listen when you life remain silent file ?";
        Anagram an=new Anagram();
        String str1[]=an.split(s);
        String str[] =an.sort(str1);
        //System.out.println(Arrays.toString(str1));
        //System.out.println(Arrays.toString(str));
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    System.out.println(str1[i]+","+str1[j]);
                    break;
                }
            }
        }       
    }
    String[] split(String s){
        List<String> str=new ArrayList<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            if(temp.length()>0 && !(s.charAt(i)<='Z' && s.charAt(i)>='A') && !(s.charAt(i)<='z' && s.charAt(i)>='a') )
            {
                str.add(temp.toLowerCase());
                temp="";
                continue;
            }
            temp+=s.charAt(i);

        }
        String a[]=new String[str.size()];
        int i=0;
        for(String j:str)
            a[i++]=j;
        return a;
    }
    String[] sort(String[] s){
        String s1[]=new String[s.length];
        for(int i=0;i<s.length;i++){
            String str="";
            char temp[]=s[i].toCharArray();
            Arrays.sort(temp);
            for(char c:temp)
                str+=c;
            s1[i]=str;

        }
        return s1;
    }
}
