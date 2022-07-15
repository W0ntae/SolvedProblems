import java.util.HashMap;

public class LetterCombination {
  public List<String> letterCombinations(String digits) {
    HashMap<Character,String> buttonLetter = new HashMap<Character,String>();
    List<String> result = new ArrayList<String>();
    buttonLetter.put('1',"");
    buttonLetter.put('2',"abc");
    buttonLetter.put('3',"def");
    buttonLetter.put('4',"ghi");
    buttonLetter.put('5',"jkl");
    buttonLetter.put('6',"mno");
    buttonLetter.put('7',"pqrs");
    buttonLetter.put('8',"tuv");
    buttonLetter.put('9',"wxyz");

    if (digits.length() == 0){
      return result;
    }

    result.add("");
    for (int x =0; x < digits.length();x++){
      String letters = buttonLetter.get(digits.charAt(x));
      result = combine(letters,result);
    }

    return result;
  }


  public List<String> combine(String num,List<String> l){
    List<String> result = new ArrayList<String>();
    for (int i =0; i < num.length();i ++){
      for (String let : l){
        result.add(let + num.charAt(i));
      }
    }

    return result;
  }
}