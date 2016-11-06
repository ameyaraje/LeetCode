/*
    The logic is to use the previous row elements to construct the current row 
*/ 

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
    
        if (numRows <= 0)
            return finalList;
            
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        finalList.add(prev);
        
        for (int i = 2; i <= numRows; i++) {
            List<Integer> rowList = new ArrayList<Integer>();
            
            rowList.add(1);
            for (int j = 0; j < prev.size()-1; j++) {
                rowList.add(prev.get(j) + prev.get(j+1));
            }
            rowList.add(1);
            finalList.add(rowList);
            prev = rowList;
        }
        return finalList;
    }
}