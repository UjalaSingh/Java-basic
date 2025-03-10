package AccessModifier;

public class School {

    private  School()
    {
    }

    public  static School s;

    public  static School print()
    {
          if(s==null)
          {
              s=new School();
              System.out.println("inside school");
          }
          return s;
    }

}
