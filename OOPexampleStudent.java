package oopexamplestudent;

public class OOPexampleStudent {

    public static void main(String[] args) {

        Student st1 = new Student(1, "Amit", 25, 90);
        System.out.println("Roll Number is " + st1.getRollno() + ". Name is " + st1.getName() + ". Age is " + st1.getAge()+ ". marks is " + st1.getmarks());

        Student st2 = new Student();
        st2.setRollno(2);
        st2.setName("Kishore");
        st2.setAge(35);
        st2.setmarks(87);
        System.out.println();
        System.out.println("Roll Number is " + st2.getRollno() + ". Name is " + st2.getName() + ". Age is " + st2.getAge()+ ". marks is " + st2.getmarks());
        //System.out.println("Number is " + st2.getRollno() + " Name is " + st2.getName() + " Age is " + st2.getAge());

        Student st3 = new Student(3,"achut",24,98);
        System.out.println();
        printValues(st3); // static method call without Object initialisation


        String[] words = {"4", "Hitesh", "30", "54"};

        Student st4 = new Student();
        st4.setRollno(Integer.parseInt(words[0]));
        st4.setName(words[1]);
        st4.setAge(Integer.parseInt(words[2]));
        st4.setmarks(Integer.parseInt(words[3]));

        System.out.println();
        printValues(st4);


        System.out.println();
        System.out.println("****Read Student details for file***************");
        String path = "F:\\IdeaProjects\\studentsfile.txt";
        Filerd fd = new Filerd();
        String contents = fd.readFromFile(path);  // read file contents / lines
        System.out.println("lines read from file - \n" + contents);

        Student st5 = new Student();
        String[] lines = contents.split("\n");
        String[] values;

        for (String s : lines) {
            values = s.split(",");
            st5.setRollno(Integer.parseInt(values[0]));
            st5.setName(values[1]);
            st5.setAge(Integer.parseInt(values[2]));
            st5.setmarks(Integer.parseInt(values[3]));
            System.out.println();
            printValues(st5);
        }


    }

    //public static void printValues(Student obj) // This will also work
    static void printValues(Student obj) {
        System.out.println("Inside printValues method : ");
        System.out.println("Roll Number is : " + obj.getRollno() + ". Name is : " + obj.getName() + ". Age is : " + obj.getAge()+ ". marks is : " + obj.getmarks());
    }

}

