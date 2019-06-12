package com.example.demo;

import com.liuyi.dao.CustomerDao;
import com.liuyi.entity.Customer;
import com.startup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = startup.class)
public class DemoApplicationTests {


    @Autowired
    CustomerDao customerDao;

    @Test
    public void test()
    {
        System.out.println("test success!");
    }

    @Test
    public void gg()
    {
        List<Customer> list=customerDao.findAll();
        System.out.println(list);
    }


}
