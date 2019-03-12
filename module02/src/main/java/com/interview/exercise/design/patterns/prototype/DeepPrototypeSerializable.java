package com.interview.exercise.design.patterns.prototype;

import java.io.*;
import java.util.Date;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/11
 */
public class DeepPrototypeSerializable  implements Cloneable, Serializable {

    /**
     * nama
     */
    private String name;

    /**
     * age
     */
    private int age;

    /**
     * birthday
     */
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 深克隆：
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public DeepPrototypeSerializable clone() throws CloneNotSupportedException {


        DeepPrototypeSerializable clone = null;
        try {
            /**
             * 使用字节数组输出输入流，来完成对象的序列化和反序列化
             */
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutput output = new ObjectOutputStream(byteArrayOutputStream);
            output.writeObject(this);
            output.flush();
            output.close();

            ByteArrayInputStream fileInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream input = new ObjectInputStream(fileInputStream);
            clone = (DeepPrototypeSerializable)input.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clone;
    }
}