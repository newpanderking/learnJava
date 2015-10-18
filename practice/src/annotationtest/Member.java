/**
 * Open Free.
 * Code for Open Community, free to use!
 */
package annotationtest;

/**
 * @author admin
 * @version $Id Member.java, v 0.1 2015-10-11 下午3:24 admin Exp $$
 */
@DBTable(name = "merber")
public class Member {
    @SQLString(30)
    String     firstName;
    @SQLString(50)
    String     lastName;
    @SQLInteger
    Integer    age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String     handle;

    static int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    @Override
    public String toString() {
        return "Member{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
               + ", age=" + age + ", handle='" + handle + '\'' + '}';
    }

}
