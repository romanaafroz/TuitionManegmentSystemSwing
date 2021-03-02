package com.rumi.test;

import com.rumi.connection.DbConnection;
import com.rumi.service.CommonServiceAdapter;
import com.rumi.serviceImpl.ClassesServiceImpl;
import com.rumi.serviceImpl.FeesServiceImpl;
import com.rumi.serviceImpl.PaymentServiceImpl;
import com.rumi.serviceImpl.StudentServiceImpl;
import com.rumi.serviceImpl.TeacherServiceImpl;
import com.rumi.serviceImpl.UserServiceImpl;
import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        Connection conn = DbConnection.getInstance();
//        CommonServiceAdapter teacherService = new TeacherServiceImpl();
//        CommonServiceAdapter studentService = new StudentServiceImpl();
//        CommonServiceAdapter feeService = new FeesServiceImpl();
//        CommonServiceAdapter paymentService = new PaymentServiceImpl();
//       CommonServiceAdapter userService = new UserServiceImpl();
//        CommonServiceAdapter classService = new ClassesServiceImpl();

//        teacherService.createTable();
//        studentService.createTable();
//          feeService.createTable();
//        paymentService.createTable();
//        userService.createTable();
//          classService.createTable();
    }
}
