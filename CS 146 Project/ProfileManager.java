

/**
* A profile manager on a simple social network.
*/

public class ProfileManager {

private final AList<Profile> allProfiles;

/**
* DO NOT CHANGE
* Constructor for an instance of a profile manager.
*/
public ProfileManager() {
/**
* DO NOT CHANGE
*/
allProfiles = new AList<>();
}

/**
* Adds a profile onto the social network.
*/
public void addProfile(Profile p) {
allProfiles.add(p);
}

/**
* Removes a profile from the social network.
*/
public void removeProfile(Profile p) {
int len = allProfiles.getLength();

//search through the list and remove at index if the profile at index matches
for(int i = 1; i <= len; i++)
{
Profile p2 = allProfiles.getEntry(i);
if(p2.getName().equals(p.getName()))
{
allProfiles.remove(i);
return;
}
}
}

/**
* Created a friendship between two profiles on the social network.
*/
public void createFriendship(Profile a, Profile b) {
a.addFriend(b);
b.addFriend(a);
}

/**
* Ends a friendship between two profiles on the social network.
*/
public void endFriendship(Profile a, Profile b) {
a.removeFriend(b);
b.removeFriend(a);
}

/**
* Displays each profile's information and friends.
*/
public void display() {
int len = allProfiles.getLength();
String str = "";
for(int i = 1; i <= len; i++)
{
Profile p = allProfiles.getEntry(i);
str += p.toString();
}
System.out.println(str);
}
}