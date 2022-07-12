class RichestCustomer {
  public int maximumWealth(int[][] accounts) {
      int maxWealth = 0;
      for (int i = 0;i < accounts.length;i++){
          for (int j = 0,total = 0; j < accounts[i].length;j++){
              total += accounts[i][j];
              if (total > maxWealth){
                  maxWealth = total;
              }
          }
      }
      return maxWealth;
  }
}