/**
 * Created by zhangyu on 2016/8/10.
 */
var towSum=function(nums,target){
    var i,
        map=new Array();

    for(i=0;i<nums.length;i++){
        var want=target-nums[i];
        if(map.hasOwnProperty(want)){
            return new Array(map[want],i);
        }
        map[nums[i]]=i;
    }
}
console.info(towSum([1,2,3],3));