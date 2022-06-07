class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> listToReturn = new ArrayList<List<Integer>>();
       List<Integer> first,second = null;  
       
       for(int i=0;i<numRows;i++){
           first = new ArrayList<Integer>();
           for(int j=0;j<=i;j++){
               if(j==0 || j==i){
                   first.add(1);
               }else{
                   first.add(second.get(j-1)+second.get(j));
               }
           }
           second = first;
           listToReturn.add(first);
        }
        
        return listToReturn;
    }
}