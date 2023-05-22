import java.util.*;

class Solution {
    private class FrequencyPair {
        int element;
        int frequency;
        
        public FrequencyPair(int element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<FrequencyPair> pq = new PriorityQueue<>((a, b) -> b.frequency - a.frequency);
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            FrequencyPair pair = new FrequencyPair(element, frequency);
            pq.offer(pair);
        }
        
        int[] ans = new int[k];
        
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().element;
        }
        
        return ans;
    }
}