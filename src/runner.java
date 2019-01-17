public class runner {
    public void main(String args[]){
        System.out.println(triangle(4));
    }


    public int triangle(int rows) {
        if(rows == 0){return 0;}
        return rows + triangle(rows-1);
    }

    public int fibonacci(int n) {
        if(n==0){return 0;}
        if(n==1){return 1;}
        return (fibonacci(n-2) + fibonacci(n-1));
    }

    public int countHi(String str) {
        if(str.length()<2){return 0;}
        if(str.substring(0,2).equals("hi")){return 1 + countHi(str.substring(2));}
        return countHi(str.substring(1));
    }

    public int sumDigits(int n) {
        if(n==0){return 0;}
        return (n%10 + sumDigits(n/10));
    }

    public String allStar(String str) {
        if(str.equals("")){return "";}
        if(str.length()==1){return str;}
        return str.substring(0,1) + "*" + allStar(str.substring(1));
    }

    public String endX(String str) {
        if(str.equals("")){return "";}
        if(str.substring(0,1).equals("x")) {return endX(str.substring(1)) + str.substring(0,1);}
        return str.substring(0,1) + endX(str.substring(1));
    }

    public int strCount(String str, String sub) {
        if(str.length()<sub.length()){return 0;}
        if(str.substring(0,sub.length()).equals(sub)){return 1 + strCount(str.substring(sub.length()), sub);}
        return  strCount(str.substring(1), sub);
    }

    public String pairStar(String str) {
        if(str.equals("")){return "";}
        if(str.length()==1){return str;}
        if(str.substring(0,1).equals(str.substring(1,2))){
            return str.substring(0,1) + "*" + pairStar(str.substring(1));
        }
        return str.substring(0,1) + pairStar(str.substring(1));
    }


}