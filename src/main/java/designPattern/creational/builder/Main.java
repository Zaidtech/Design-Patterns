package designPattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user = User.UserBuilder.builder()
                .setAddress("Add")
                .setGender("Male")
                .setPhone("1388888888")
                .setEmail("email@email.com")
                .setUsername("username")
                .setAge(12)
                .setName("name")
                .build();

        System.out.printf("User"+ user);

    }
}
