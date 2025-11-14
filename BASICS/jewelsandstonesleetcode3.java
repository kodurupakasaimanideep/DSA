// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class jewelsandstonesleetcode {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            boolean found=false;
            for(int j=0;j<jewels.length();j++){
                char sin=jewels.charAt(j);
                if(ch==sin){
                    found = true;
                    break;
                }
        }
        if(found == true){
            ans=ans+1;
        }
    }
    System.out.println(ans);
}
}