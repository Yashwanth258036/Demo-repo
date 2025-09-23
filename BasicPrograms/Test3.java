package BasicPrograms;

public class Test3
 {
    public static void main(String[] args) {
        int []marks={10,20,30,40,50};
        int totalmarks=0;
        int avgmarks=0;
        for(int i=0;i<marks.length;i++)
        {
            totalmarks=marks[i]+totalmarks;

        }
        System.out.println("Total marks: "+totalmarks);
        System.out.println("Average Marks: "+totalmarks/marks.length);

    }
    
}
