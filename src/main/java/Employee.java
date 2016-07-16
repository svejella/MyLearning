/**
 * Created with IntelliJ IDEA.
 * User: svejella
 * Date: 7/8/16
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {

    private String name;
    private String id;

    public Employee (String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
      return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Employee)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Employee e = (Employee) o;

        // Compare the data members and return accordingly
        return name.equalsIgnoreCase(e.name)
                && id.equalsIgnoreCase(e.id);
    }
}


