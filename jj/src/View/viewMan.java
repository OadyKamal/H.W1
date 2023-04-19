/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author 01
 */
public class viewMan {

    public static LoginV login;
    public static SystemV systemP;

    public viewMan() {
    }

    public static void openLogin() throws IOException {
        if (login == null) {
            login = new LoginV();
            login.show();
        } else {
            login.show();
        }
    }

    public static void closeLogin() {
        if (login != null) {
            login.close();
        }
    }

    public static void openSystem() throws IOException {
        if (systemP == null) {
            systemP = new SystemV();
            systemP.show();

        } else {
            systemP.show();
        }
    }

    public static void closeSystem() {
        if (systemP != null) {
            systemP.close();
        }
    }

}
