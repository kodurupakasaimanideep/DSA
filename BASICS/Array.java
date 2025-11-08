// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Array {
    public static void main(String[] args) {
     int marks[]={23,55,63,93,80,70,88};

     System.out.println("The size of the marks:"+marks.length);

     System.out.println("fifth element is:"+marks[4]);

     int size=marks.length;
     System.out.println("The Given elements is:");
     for(int i=0;i<size;i++){
         System.out.println(marks[i]);
     }
     System.out.println("The marks after adiing grace marks:");
         for(int I=0;I<size;I++){
             int Add=marks[I]+=5;
             System.out.println(Add);
         
     }
      int total=0;
     for(int i=0;i<size;i++){
     total+=marks[i];
     }
    System.out.println("The Total marks:"+total);
    }
}