package com.kodilla.stream.forum;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {
    private final String userName;
    private final String realName;
    private final String location;
    private final HashSet<ForumUser> friends = new HashSet<>();

    public ForumUser(String userName, String realName, String location) {
        this.userName = userName;
        this.realName = realName;
        this.location = location;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public HashSet<ForumUser> getFriends() {
        return friends;
    }

    public void addFriend(ForumUser user){
        friends.add(user);
    }

    public boolean removeFriend (ForumUser user){
        return friends.remove(user);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return userName.hashCode();
    }

    public Set<String> getLocationsOfFriends(){
        return friends.stream().map(friend->friend.location).collect(Collectors.toSet());
    }

    public Set<String> getLocationsOfFriendsOfFriends(){
        return friends.stream().flatMap(user ->user.getFriends().stream()).
                filter(user ->user!=this).map(ForumUser::getLocation).collect(Collectors.toSet());
    }
}
