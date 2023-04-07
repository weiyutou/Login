package vip.coli.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import vip.coli.dao.UsersDao;
import vip.coli.entity.Users;
import java.awt.*;

/**
 * @author coli
 * @date 2023/4/5
 */
public class UsersDaoImpl implements UsersDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean flag2(String usernm, String passwd) throws AWTException {
        Robot robot = new Robot();
        boolean flag = true;
        try {
            String sql = "select*from users where usernm=? and passwd=?";
            Users users = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Users>(Users.class), usernm, passwd);
            if (users != null) {
                robot.delay(200);
                System.out.println("loading...");
                robot.delay(500);
                System.out.println("登录成功！");
                robot.delay(200);
                System.out.println("欢迎"+users.getUsernm()+"登录本系统");
                System.out.println(" ");
                System.out.println(" ");
                robot.delay(200);
                System.out.println("——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————");
            }
            flag = false;
        } catch (Exception e){robot.delay(200);System.out.println("登录失败！请检查账号密码是否正确！");}
        return flag;
    }
}
