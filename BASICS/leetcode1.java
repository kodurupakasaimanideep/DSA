public class leetcode{
    public static void main(String[] args){
        String operations[]={"++x","x++","x++"};
        
        int ans=0;
        for(int i=0;i<operations.length;i++){
            String temp=operations[i];
            if(temp.equals("x++") || temp.equals("++x")){
                ans=ans+1;
            }else{
                ans=ans-1;
            }
        }
        System.out.println(ans);
    }
}