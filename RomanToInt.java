class RomanToInt {
  public int romanToInt(String s) {
      HashMap<Character, Integer> romanAsInt = new HashMap<Character, Integer>();
      romanAsInt.put('I',1);
      romanAsInt.put('V',5);
      romanAsInt.put('X',10);
      romanAsInt.put('L',50);
      romanAsInt.put('C',100);
      romanAsInt.put('D',500);
      romanAsInt.put('M',1000);
      int num = romanAsInt.get(s.charAt(s.length()-1)), leng = s.length();
      for (int i = leng -2; i > -1; i--){
          if (romanAsInt.get(s.charAt(i)) < romanAsInt.get(s.charAt(i+1))){
              num = num - romanAsInt.get(s.charAt(i));   
          }
          else {
              num = num + romanAsInt.get(s.charAt(i));
          }
      }
      return num;
  }
} 