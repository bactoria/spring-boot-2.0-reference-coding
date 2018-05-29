package me.bactoria.project.day03;

import me.bactoria.project.day03.configuration.ServiceConfig;
import me.bactoria.project.day03.user.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Day03Controller.class)
public class ExampleTest {

    @Autowired
    UserService userService;

    @Autowired
    ServiceConfig serviceConfig;

    @Test
    public void temp() {
        Assert.assertNotNull(userService);
        Assert.assertNotNull(serviceConfig);
    }
}
