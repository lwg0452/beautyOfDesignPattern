package Mediator;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Component;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UiControl {

    private static final String LOGIN_BTN_ID = "login_btn";
    private static final String REG_BTN_ID = "reg_btn";
    private static final String USERNAME_INPUT_ID = "username_input";
    private static final String PASSWORD_INPUT_ID = "pswd_input";
    private static final String REPEATED_PASSWORD_INPUT_ID = "repeated_pswd_input";
    private static final String HINT_TEXT_ID = "hint_text";
    private static final String SELECTION_ID = "selection";

    public static void main(String[] args) {
        Button loginButton = (Button) findViewById(LOGIN_BTN_ID);
        Button regButton = (Button) findViewById(REG_BTN_ID);
        TextComponent usernameInput = (TextComponent) findViewById(USERNAME_INPUT_ID);
        TextComponent passwordInput = (TextComponent) findViewById(PASSWORD_INPUT_ID);
        TextComponent repeatedPswdInput = (TextComponent) findViewById(REPEATED_PASSWORD_INPUT_ID);
        TextField hintText = (TextField) findViewById(HINT_TEXT_ID);
        Choice selection = (Choice) findViewById(SELECTION_ID);
        LandingPageDialog dialog = new LandingPageDialog();
        dialog.setLoginButton(loginButton);
        dialog.setRegButton(regButton);
        dialog.setUsernameInput(usernameInput);
        dialog.setPasswordInput(passwordInput);
        dialog.setRepeatedPswdInput(repeatedPswdInput);
        dialog.setHintText(hintText);
        dialog.setSelection(selection);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.handleEvent(loginButton, "click");
            }
        });
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.handleEvent(regButton, "click");
            }
        });
    }

    private static Component findViewById(String id) {
        return null;
    }
}
