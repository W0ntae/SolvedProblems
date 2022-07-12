class StepsToZero {
  public int numberOfSteps(int num) {
      int steps = 0;
      for (int i = 1; num != 0; i++){
          boolean even = num % 2 == 0;
          steps++;
          if (even){
              num = num / 2;
          }
          else {
              num--;
          }
      }
      return (steps);
  }
}