package com.interview.exercise.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/08
 */
public class ReflexClass {

    public static void main( String[] args ){

        try {
            Class<?> clazz = Class.forName("com.interview.exercise.reflex.TargetClass");
//            Constructor<?>[] constructors = clazz.getConstructors();

            Constructor<?> constructor = clazz.getConstructor();
            TargetClass instance = (TargetClass)constructor.newInstance();


            Method setName = clazz.getMethod("setName", String.class);
            setName.invoke(instance,"小明");

            Method getName = clazz.getMethod("getName");
            String invoke = (String)getName.invoke(instance);
            System.out.println(invoke);


            Field name = clazz.getDeclaredField("name");
            System.out.println(name.getName());

            Field[] fields = clazz.getFields();
            System.out.println(fields[0].getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}