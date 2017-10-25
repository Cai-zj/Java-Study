package Chapter1.demo;

/**
 * @author caizhuojie
 * @company Guangzhou
 * @ClassName: User
 * @Description: 实体类
 * @date 2017/10/25
 * @Copyright (c) 2017, czj8515@gmail.com All Rights Reserved.
 */

@Table("tb_user")
public class User {

    @Column("id")
    private long id;
    @Column("userName")
    private String userName;
    @Column("nikeName")
    private String nikeName;
    @Column("age")
    private int age;
    @Column("city")
    private String city;
    @Column("email")
    private String email ;
    @Column("address")
    private String address;

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {

        return userName;
    }

    public String getNikeName() {
        return nikeName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public long getId() {

        return id;
    }
}
