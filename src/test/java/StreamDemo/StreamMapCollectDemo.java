package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamMapCollectDemo {

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(1,"Ram","Passwrod_Ram","ram@gmail.com"));

        users.add(new User(2,"Raj","Passwrod_Raj","raj@gmail.com"));

        users.add(new User(3,"vysyaraju","Passwrod_vv","vv@gmail.com"));

        users.add(new User(4,"tony","Passwrod_ytony","tony@gmail.com"));


        List<UserDTO> usersDTO = new ArrayList<UserDTO>();


        UserDTO dto=null;

         for(User user:users){
             usersDTO.add(new UserDTO(user.getId(),user.getName(),user.getEmail()));
        }

         for(UserDTO dto1:usersDTO){
             System.out.println(dto1);

         }


//map is method of stream ita not like a Map interface




        users.stream().map((User userMap) -> new UserDTO(userMap.getId(),userMap.getName(),userMap.getEmail()))
                .forEach((usersDTO1) -> {
            System.out.println(usersDTO1);
        });




         users.stream().map(new Function<User, UserDTO>() {
             @Override
             public UserDTO apply(User user ) {
                 return new UserDTO(user.getId(),user.getName(),user.getEmail());
             }
         });


    }
}



class UserDTO{
    private int id;
    private String name;

    private String email;

    @Override
    public String toString() {
        return "USerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public UserDTO(int id, String name, String email) {
        this.id = id;
        this.name = name;

        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}


class User{
    private int id;
    private String name;
    private String password;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}