package vip.coli.entity;

/**
 * @author coli
 * @date 2023/4/5
 */
public class Users {
    private int id;
    private String usernm;
    private String passwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernm() {
        return usernm;
    }

    public void setUsernm(String usernm) {
        this.usernm = usernm;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", usernm='" + usernm + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
