class MaxSubArray {
    public int maxSubArray(int[] nums) {
        final int size = nums.length;
        Integer maxSum = null;
        int tempSum = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] > 0){                                                    // array with neg/pos values
                int m = 0, t = 0;
                for (int j = i; j < size; j++){
                    t += nums[j];
                    if(t > m) m = t;
                    else if(t < 0) t = 0;
                }
                return m;
            }                                                                   // array full of neg values
            tempSum = nums[i];
            if (maxSum == null || tempSum > maxSum ) maxSum = tempSum;
        }
        return maxSum;
    }
    public void test1(){                                                       
        int[] nums = {1};
        int a = maxSubArray(nums);
        assert(a == 1);
    }
    public void test2(){                                                       
        int[] nums = {5,4,-1,7,8};
        int a = maxSubArray(nums);
        assert(a == 23);
    } 
    public void test3(){                                                       
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int a = maxSubArray(nums);
        assert(a == 6);
    }
    public void test4(){                                                       
        int[] nums = {-1, -1, -1, 1, 1, 1, -2, -2, -2};       
        int a = maxSubArray(nums);
        assert(a == 3);
    } 
    public void test5(){                                                       
        int[] nums = {-1};
        int a = maxSubArray(nums);
        assert(a == -1);
    }
    public void test6(){                                                       
        int[] nums = {-2,-1};
        int a = maxSubArray(nums);
        assert(a == -1);
    }
    public static void main(String args[]){
        MaxSubArray l = new MaxSubArray();
        l.test1();
        l.test2();
        l.test3();
        l.test4();
        l.test5();
        l.test6();
    } 
}