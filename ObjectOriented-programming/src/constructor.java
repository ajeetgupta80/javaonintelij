public class constructor {
    public static void main(String[] args) {

//        this keyword is replacing with name of the reference variable...............................

//        by default constructor which has no argument
//        Student ajeet = new Student();
//        System.out.println(ajeet.health);
//        System.out.println(ajeet.networth);
//        System.out.println(ajeet.time);
//
//        ajeet.changename("abhay patel");
//        System.out.println(ajeet.name);
//        ajeet.greeting();

        System.out.println("-----------------");
//        calliing parametrized constructor
        Student ajeet = new Student("ajeet gupta", 80,80,50);
        System.out.println(ajeet.health);
        System.out.println(ajeet.networth);
        System.out.println(ajeet.time);
        System.out.println(ajeet.name);

    }

    static class Student
    {
        int networth;
        int time ;
        int health;
        String name;


        void greeting()
        {
            System.out.println("hi my networth is "+ networth);
        }


//        1st way
//        void changename(String name)
//        {
//            this.name = name;
//        }


//        2nd way
//        void changename(String naam)
//        {
//            name = naam;
//        }


//        now this will be the default constructor as it does not has the argument
//        Student()
//        {
//            this.health=50;
//            this.networth=0;
//            this.time=7;
//            this.name="arpit";
//        }



//        constructor with argument
//        Student(String naam, int net, int taime, int helth)
//        {
//            name = naam;
//            networth = net;
//            time = taime;
//            health = helth;
//
//        }


//        constructor with same name argument "this" keyword is used to create
Student(String name,int networth, int time, int health)
{
    this.name = name;
    this.networth = networth;
    this.health = health;
    this.time = time;

}


// calling constructor inside constructor

    }
}
