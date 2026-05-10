class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
         hash={}
         for i,n in enumerate(nums):
            m=target-n
            if m in hash:
                return [hash[m],i]
            hash[n]=i
               