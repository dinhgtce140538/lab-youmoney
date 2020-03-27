/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourmoney;

/**
 *
 * @author Admin
 */
public class Entity {

    static String Name, dob, gender;
    static String Address, Email;
    static String Phone;
    static String Code;
    static String money;
    static String username;

    Entity(String Name, String dob, String gender, String Address, String Email, String Phone, String Code, String money,String username) {
        Entity.gender = gender;
        Entity.Name = Name;
        Entity.Address = Address;
        Entity.dob = dob;
        Entity.Email = Email;
        Entity.Phone = Phone;
        Entity.Code = Code;
        Entity.money = money;
        Entity.username=username;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Entity.gender = gender;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Entity.username = username;
    }

    Entity() {
        
    }

    public static String getName() {
        return Name;
    }

    public void setName(String Name) {
        Entity.Name = Name;
    }

    public static  String getDob() {
        return dob;
    }

    public static void setDob(String dob) {
        Entity.dob = dob;
    }

    public static String getAddress() {
        return Address;
    }

    public static void setAddress(String Address) {
        Entity.Address = Address;
    }

    public static  String getEmail() {
        return Email;
    }

    public static void setEmail(String Email) {
        Entity.Email = Email;
    }

    public static  String getPhone() {
        return Phone;
    }

    public static void setPhone(String Phone) {
        Entity.Phone = Phone;
    }

    public static  String getCode() {
        return Code;
    }

    public static void setCode(String Code) {
        Entity.Code = Code;
    }

    public static  String getMoney() {
        return money;
    }

    public static void setMoney(String money) {
        Entity.money = money;
    }

}
