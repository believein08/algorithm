/**
 * Created by zhangyu on 2016/7/22.
 */
function duplicates(arr) {
    var arr1=[];
    arr.sort();
    var count=0;
    arr.reduce(function(prev,cur,index,array){
        if(prev==cur&arr1[arr1.length-1]!=cur){
            arr1.push(cur);
        }
        return cur;
    })
    return arr1;
}
console.info(duplicates([1, 2, 4, 4, 3, 3, 1, 5, 3]).sort())
