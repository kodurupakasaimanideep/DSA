public class Or{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,12,13,4,10,8,15,30 };
        int count=0;
        for(int i=0;i<arr.length;i++){
        int size= arr[i];
        if(size%3==0||size%2==0){
            count++;
        }
    }
    System.out.println("The numbers which divided by 2 and 3  ="+count);
}
}