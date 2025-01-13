package Mediator;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Component;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.TextField;


public class LandingPageDialog implements Mediator {

    private Button loginButton;
    private Button regButton;
    private Choice selection;
    private TextComponent usernameInput;
    private TextComponent passwordInput;
    private TextComponent repeatedPasswdInput;
    private TextField hintText;

    @Override
    public void handleEvent(Component component, String event) {
        if (component.equals(loginButton)) {
            String username = usernameInput.getText();
            String password = passwordInput.getText();
            // 校验数据...
            // 做业务处理...
        } else if (component.equals(regButton)) {
            //获取usernameInput、passwordInput、repeatedPswdInput数据...
            // 校验数据...
            // 做业务处理...
        } else if (component.equals(selection)) {
            String selectedItem = selection.getSelectedItem();
            if (selectedItem.equals("login")) {
                usernameInput.show();
                passwordInput.show();
                repeatedPasswdInput.hide();
                hintText.hide(); //...省略其他代码
            } else if (selectedItem.equals("register")) {
                // ....
            }
        }
    }

    public void setLoginButton(Button loginButton) {}

    public void setRegButton(Button regButton) {}

    public void setUsernameInput(TextComponent usernameInput) {
    }

    public void setPasswordInput(TextComponent passwordInput) {
    }

    public void setRepeatedPswdInput(TextComponent repeatedPswdInput) {
    }

    public void setHintText(TextField hintText) {
    }

    public void setSelection(Choice selection) {
    }
}


