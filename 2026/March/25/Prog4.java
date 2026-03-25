class Prog4{
        public static void main(String[] args){
                int x = 10;

                if(x>10 && ++x){
                        System.out.println(x);
                }
                else
                        System.out.println("else");
        }
}

/*
 * Prog4.java:6: error: bad operand types for binary operator '&&'
                if(x>10 && ++x){
                        ^
  first type:  boolean
  second type: int
1 error
*/
