package com.rumi.service;

import java.util.List;

public interface CommonService<T> {

    void createTable();

    void save(T t);

    void edit(T t);

    void delete(int id);

    T get(int id);

    List<T> getList();

    T getByName(String name);

    List<T> getListByTeacher(int id);

    List<T> getByStudentId(int id);

    List<T> getByTeacherId(int id);

    T getTeacherByTeacherId(int id);

    List<T> getListByMonthAndYear(int month, int year);

    T getStudentByIdAndTeacher(String student_name, int teacher_id);

    T getUserByUsernameAndPassword(String username, String password);

//    List<T> getListByName(String name);
//
//    List<T> getListById(int id);
}
