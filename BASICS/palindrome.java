public class palindrome{
    public static void main(String[] args){
        String s="level";
        String ans="";
        for(int i =s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }

        if(ans.equals(s)){
            System.out.println("Yes it is palindrome");
        }else{
            System.out.println("No it is not palindrome");
        }
    }
}