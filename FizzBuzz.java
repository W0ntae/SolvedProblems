class FizzBuzz {
  public List<String> fizzBuzz(int n) {
      ArrayList<String> answer = new ArrayList<String>();
      for (int i = 1; i <= n; i++){
          boolean divisible5 = i % 5 == 0;
          boolean divisible3 = i % 3 == 0;
          if (divisible5 && divisible3){
              answer.add("FizzBuzz");
          }
          else if (divisible5){
              answer.add("Buzz");
          }
          else if (divisible3){
              answer.add("Fizz");
          }
          else {
              answer.add(String.valueOf(i));
          }
      }
      return answer;
  }
}