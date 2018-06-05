package me.bactoria.project.day04;

import me.bactoria.project.day04.user.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Day04Controller.class)
public class ExampleTest {

    @Autowired
    UserService userService;

    @Test
    public void di() {
        Assert.assertNotNull(userService);
    }

    @Test
    public void 오토와이어_테스트() {
        Assert.assertNotNull(userService);
        Assert.assertNotNull(userService.getUserRepository());
        Assert.assertNotNull(userService.getARepository());
    }

}
