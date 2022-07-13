public class Parenthese {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length();i++){
      char character = s.charAt(i);
      if (character == '(' || character == '[' || character == '{'){
        stack.push(character);
      }
      else if (stack.empty()){
        return false;
      }
      else if (character == ')' && stack.pop() != '('){
        return false;
      }
      else if (character == ']' && stack.pop() != '['){
        return false;
      }
      else if (character == '}' && stack.pop() != '{'){
        return false;
      }
    }
    return stack.empty();
  }
}
