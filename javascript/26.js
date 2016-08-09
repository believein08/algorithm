/**
 * Created by zhangyu on 2016/7/22.
 */
function useArguments() {
    var result=0;
    for(var i=0;i<arguments.length;i++){
        result+=arguments[i];
    }
    return result;
}
console.info(useArguments(1, 2, 3, 4));