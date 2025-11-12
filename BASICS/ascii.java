class ascii{
    public static void main(String[] args ){
        String s="hello";
        int ans=0;
        for(int i=0;i<4;i++){
            int a=i;
            int b=i+1;
            char first=s.charAt(a);
            char second=s.charAt(b);
            int ascii1=first;
            int ascii2=second;
            int temp=Math.abs(ascii1-ascii2);
            ans =ans+temp;
        }
        System.out.println(" The sum of the absolute difference b/w the Ascii values of adjacent charater:"+ans);
    }
}