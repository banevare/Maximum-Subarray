var maxSubArray = function(nums) {
    var size = nums.length;
    var maxSum = null;
    var tempSum = 0;
    for(var i = 0; i < size; i++){
        if(nums[i] > 0){                                                   
            var m = 0, t = 0;
            for (var j = i; j < size; j++){
                t += nums[j];
                if(t > m) m = t;
                else if(t < 0) t = 0;
            }
            return m;
        }                                                                 
        tempSum = nums[i];
        if (maxSum == null || tempSum > maxSum ) maxSum = tempSum;
    }
    return maxSum;
};