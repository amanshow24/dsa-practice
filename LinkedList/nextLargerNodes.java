// 1019. Next Greater Node In Linked List
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // Intuition 
        // step 1 - reverse linked list
        // step 2 - see next greater element using stack & store in answer array
        // step 3 - reverse the answer array

        Stack <Integer> st = new Stack<>() ;
        ArrayList<Integer> answer = new ArrayList<>() ;

        ListNode prev = null ;
        ListNode fwd = null ;
        ListNode curr = head ;
 
        while(curr != null){
            fwd = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = fwd ;
        }  
        
        answer.add(0) ;
        st.push(prev.val) ;
        prev = prev.next ;

        while(prev != null){
            while(st.size() > 0 && prev.val >= st.peek()){
                st.pop() ;
            }

            if(st.size() == 0){
                answer.add(0) ;
            } else {
                answer.add(st.peek()) ;
            }
            st.push(prev.val) ;
            
            prev = prev.next ;
        }

        Collections.reverse(answer);

        int[] ans = new int[answer.size()] ;

        for(int i = 0 ; i < answer.size() ; i++){
            ans[i] = answer.get(i) ;
        }

        return ans ;
    }
}
