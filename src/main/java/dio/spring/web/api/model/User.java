package dio.spring.web.api.model;

public class User {

    private Integer id;
    private String login;
    private String password;

    public User(Integer id, String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
