import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        if(array.length==0||array==null){
            return 0;
        }
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>array.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}