class Mainclass{
    public int romanToInt(String s) {
        int flag = 0;
        int num;
       for(int i=0;i<s.length();i++)
       {
           num=0;
          switch(s.charAt(i)){
              case 'I':num=1; break;
              case 'V':num=5; break;
              case 'X':num=10; break;
              case 'L':num=50; break;
              case 'C':num=100; break;
              case 'D':num=500; break;
              case 'M':num=1000; break;
              default : break;
          }
          if(i!=0)
          {
              if((s.charAt(i-1)=='I') && (s.charAt(i)=='V' || s.charAt(i)=='X'))
              {
                  num = num - 2 ;
              }
               if((s.charAt(i-1)=='X') && (s.charAt(i)=='L' || s.charAt(i)=='C'))
              {
                  num = num - 20 ;
              }
              else if((s.charAt(i-1)=='C') && (s.charAt(i)=='D' || s.charAt(i)=='M'))
              {
                  num = num - 200 ;
              }
          }
        //   System.out.println(num);
        flag = flag + num;
        
       } 
       return flag;
    }
  public static void main(String arge[]){
    int number = romanToInt("MCMXCIV");
    System.out.println(number);
  }
}
