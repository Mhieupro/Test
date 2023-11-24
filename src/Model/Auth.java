/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Auth {

    public static User us = null;

    public static void clear() {
        Auth.us = null;

    }

    public static boolean isLogin() {
        return Auth.us != null;
    }

    public static boolean isManager() {
        return Auth.isLogin() && us.getVaiTro() == 1;
    }
}
