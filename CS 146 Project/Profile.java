
import java.awt.image.*;

/**
* A profile on a simple social network.
*/
public class Profile {

private BufferedImage profilePicture;
private Name profileName;
private String status;
private AList<Profile> friends;

/**
* DO NOT CHANGE
* Constructor for an instance of a profile.
*/
public Profile() {
/**
* DO NOT CHANGE
* Constructor for an instance of a profile.
*/
profilePicture = new BufferedImage(150, 150, BufferedImage.TYPE_INT_RGB);
profileName = new Name("", "");
status = "";
friends = new AList<>();
}

public BufferedImage getProfilePicture() {
return profilePicture;
}

public void setProfilePicture(BufferedImage newPicture) {
profilePicture = newPicture;
}

public Name getName() {
return profileName;
}

/**
* Sets the name associated with the profile
* to the given first and last name.
*/
public void setName(String first, String last) {
profileName = new Name(first, last);
}

/**
* Sets the name associated with the profile
* to the given name.
*/
public void setName(Name name) {
profileName = name;
}

/**
* Sets the current status of the profile
* to the given string.
*/
public void setStatus(String stat) {
status = stat;
}

/**
* Returns the status associated with the profile.
*/
public String getStatus() {
return status;
}

/**
* Returns a list of all the profile's friends
*/
public AList<Profile> getFriends() {
return friends;
}

/**
* Adds a friend to the profile's list of friends.
*/
public void addFriend(Profile p) {
friends.add(p);
}

/**
* Removes a friend from the profile's list of friends.
*/
public void removeFriend(Profile p) {
int len = friends.getLength();

//search through the list and remove at index if the profile at index matches
for(int i = 1; i <= len; i++)
{
Profile p2 = friends.getEntry(i);
if(p2.getName().equals(p.getName()))
{
friends.remove(i);
return;
}
}
}

public String toString() {
String str = "";
str += "Name: " + profileName.toString() + "\n";
str += "\t Status: " + status + "\n";
str += "\t Picture: " + profilePicture.toString() + "\n";
str += "\t # of friends: " + friends.getLength() +"\n";

int len = friends.getLength();
str += "Friends:" + "\n";
for(int i = 1; i <= len; i++)
str += friends.getEntry(i).getName() + "\n";
return str;
}

/**
* Displays the profile's information and friends.
*/
public void display() {
System.out.println(toString());
}
} // end Profile
