/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;

/**
 *
 * @author MoHammeD
 */
public class ViewManager {

    public static LoginPage loginPage;
    public static Converting convertingPage;

    private ViewManager() {
    }

    public static void loginPage() throws IOException {
        if (loginPage == null) {
            loginPage = new LoginPage();
            loginPage.show();
        } else {
            loginPage.show();
        }

    }

    public static void closeloginPage() {
        if (loginPage != null) {
            loginPage.close();
        }
    }

    public static void openConvertingPage() throws IOException {
        if (convertingPage == null) {
            convertingPage = new Converting();
            convertingPage.show();
        } else {
            convertingPage.show();
        }

    }

    public static void closeConvertingPage() {
        if (convertingPage != null) {
            convertingPage.close();
        }
    }

}
