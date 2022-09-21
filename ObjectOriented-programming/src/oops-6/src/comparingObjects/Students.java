package comparingObjects;

public class Students {
    int roll_no;
    int marks;


    public  Students(int roll_no, int marks)
    {
        this.roll_no= roll_no;
        this.marks= marks;
    }

    @Override
    public String toString() {
        return marks +"";
    }

//    @Override
//    public int compareTo(Students o) {
//        System.out.println(" compare to method is running");
//        int diff = (int)(this.marks-o.marks);
////        if diff is 0 then both are equal;
////        if diff < 0 then o is bigger else o is smaller
//        return diff;
    }

