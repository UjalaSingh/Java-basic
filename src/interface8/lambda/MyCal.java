package interface8.lambda;

public class MyCal {
    public static void main(String[] args) {

       // employee e=new SoftwareEng();  //instead of this we can use lambda expression

        employee e=() ->"vipul singh";
        System.out.println(e.getName());
    }
}

