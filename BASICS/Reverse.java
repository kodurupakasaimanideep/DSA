public class Reverse {
    public static void main(String[] args) {
        String s1 = "manideep";
        String s2 = "peedinam";
        String s3= "java";

        String ans1 = "";
        String ans2 = "";
        String ans3 =" ";

        for (int i = s1.length() - 1; i >= 0; i--) {
            ans1 = ans1 + s1.charAt(i);
        }

        for (int i = s2.length() - 1; i >= 0; i--) {
            ans2 = ans2 + s2.charAt(i);
        }
        for(int i=s3.length()-1;i>=0;i--){
            ans3=ans3+ s3.charAt(i);
        }

        System.out.println("Reverse of manideep is: "+ans1);
        System.out.println("Reverse of peedinam is: "+ans2);
        System.out.println("Reverse of java is: "+ans3);
    }
}
