

public class Name
{
private String first; // First name
private String last; // Last name

public Name()
{
first = "";
last = "";
}

public Name(String firstName, String lastName)
{
setName(firstName, lastName);
}

public void setName(String firstName, String lastName)
{
first = firstName;
last = lastName;
}

public String getName()
{
return first + " " + last;
}

public void setFirst(String firstName)
{
first = firstName;
}

public String getFirst()
{
return first;
}

public void setLast(String lastName)
{
last = lastName;
}

public String getLast()
{
return last;
}

public void giveLastNameTo(Name aName)
{
aName.setLast(last);
}

public String toString()
{
return getName();
}
}
