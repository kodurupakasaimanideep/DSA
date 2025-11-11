 public class Return{
    public static String fun(int n,String sup){
        String ans=" ";
        for(int i=0;i<n;i++){
            ans=ans+sup;
        }
        return ans;
    }
    public static void main(String[] args){
        String fam=fun(4,"java");
        System.out.println(fam);
    }
}