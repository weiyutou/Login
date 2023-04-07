package vip.coli.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.coli.dao.UsersDao;
import java.awt.*;
import java.util.Scanner;

/**
 * @author coli
 * @date 2023/4/5
 */
public class Login {
    public static void main(String[] args) throws AWTException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersDao dao = app.getBean("usersDao", UsersDao.class);
        Robot robot = new Robot();
        boolean flag = true;
        System.out.println("******欢迎来到房产管理系统******");
        while (flag) {
            robot.delay(200);
            Scanner scanner = new Scanner(System.in);
            System.out.printf("请输入用户名：");
            String username = scanner.nextLine();
            robot.delay(200);
            System.out.printf("请输入密码：");
            String password = scanner.nextLine();
            Object object = dao.flag2(username,password);
            flag = (boolean) object;
        }
    }
}
