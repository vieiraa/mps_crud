package infra;

import java.util.Stack;

public class UserCareTaker {
    Stack<UserMemento> stack;
    
    public UserCareTaker() {
        stack = new Stack<>();
    }
    
    public void save(UserMemento user) {
        stack.push(user.save());
    }
    
    public void revert(UserMemento user) {
        if (stack.empty())
            return;
        
        user.revert(stack.pop());
    }
}
