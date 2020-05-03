class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        boolean valid = false;
        
        //System.out.println(s);
        
        if (s.isEmpty()){
            return true;
        }
        else if(s.charAt(0) == ')'
               || s.charAt(0) == ']' 
               || s.charAt(0) == '}'){
            return false;
        }
        
        
        
        for (int i = 0; i < s.length(); i++){
            char current_char = s.charAt(i);
                
            if(current_char == '('
               || current_char == '[' 
               || current_char == '{'){
                stack.push(current_char);
                
            }
            else{
                if(stack.isEmpty() == true){
                    return false;
                }
                if(current_char == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }   
                else if (current_char == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
                else if (current_char == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
                
            }
            
        }// end of for loop
            
        
        if(stack.empty() == true){
            return true;
        }
        
        return false;
    
    }
}
