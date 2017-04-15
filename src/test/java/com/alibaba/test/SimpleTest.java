package com.alibaba.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by MSI on 2017/4/9.
 */
public class SimpleTest {
    @Test
    public void simpleTest() {
        //创建mock对象,参数可以是类也可以是接口
        List<String> list = mock(List.class);
        //设置方法预期返回值
        when(list.get(0)).thenReturn("helloWorld");
        when(list.get(1)).thenThrow(new RuntimeException("test Exception 1"));

        String result = list.get(1);

        //验证方法是否调用
        verify(list).get(0);
        Assert.assertEquals("helloWorld",result);
    }

    @Test
    public void argumentTest() {
        Map<Integer,String> map = mock(Map.class);
        when(map.put(anyInt(),anyString())).thenReturn("hello");

        String s = map.put(1, "hello");
        verify(map).put(eq(1),eq("hello"));
        Assert.assertEquals("hello1",s);
    }

    @Test
    public void getEmployee() {
        Employee employee = new Employee(1, new Person("张三", 18));
        Person person = employee.getPerson();
        person.setAge(22);
        person.setName("秀搞过的明细");


        Person employeePerson = employee.getPerson();
        employee.toString();
        Employee employee1 =employee;
        employee.getId();
    }
}
