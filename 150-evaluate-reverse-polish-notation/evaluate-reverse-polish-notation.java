class Solution {
    public int evalRPN(String[] tokens) {
        int reverseValue = 0;
        String operators = "+-*/";
        Stack<String> res = new Stack<String>();
        
        for(String t : tokens){
            if(!operators.contains(t)){
                res.push(t);
            }else{
                int a = Integer.valueOf(res.pop());
                int b = Integer.valueOf(res.pop());
                int index = operators.indexOf(t);
                switch(index){
                    case 0 : res.push(String.valueOf(a+b));
                            break;
                    case 1 : res.push(String.valueOf(b-a));
                            break;
                    case 2 : res.push(String.valueOf(a*b));
                            break;
                    case 3 : res.push(String.valueOf(b/a));
                            break;
                }
            }
        }
        reverseValue = Integer.valueOf(res.pop());
        return reverseValue;
    }
}