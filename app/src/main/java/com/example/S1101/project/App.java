/*
 * This source file was generated by the Gradle 'init' task
 */
package com.example.S1101.project;

import Helper.Injector;

public class App {
    
    public static void main(String[] args) {
        HomePage homePage = Injector.createHomePage();
        homePage.setVisible(true);
    }
}
