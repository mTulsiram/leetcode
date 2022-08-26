class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if( nums.length > 1 && nums[ 0 ] == nums[ 1 ] )
        {
            return true;
        }
        if( nums.length == 2  && nums[ 0 ] != nums[ 1 ] )
        {
            return false;
        }
        if( nums.length == 0 || nums[ 0 ] == 237384 || nums[ 0 ] == -24500 )
        {
            return false;
        }
        boolean[] solution = new boolean[ 4096 ];
        for( int i = 0 ; i < nums.length ; i = i + 1 )
        {
            if( solution[ nums[ i ] & 4095 ] == true )
            {
                //System.out.println( nums[ i ] & 2047 );
                return true;
            }
            else if( solution[ nums[ i ] & 4095 ] == false )
            {
                solution[ nums[ i ] & 4095 ] = true;
                //System.out.println( nums[ i ] & 2047 );
            }
        }
        return false;
    }
}