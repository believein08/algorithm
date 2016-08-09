/**
 * Created by zhangyu on 2016/7/22.
 */
function makeClosures(arr, fn) {
    return arr.map(function(item,index,array){
        return function(){
            return fn(item);
        }
    })

}
var arr = [1, 2, 3]; var square = function (x) { return x * x; };
var funcs = makeClosures(arr, square); funcs[1]();

(function(a,b){
    var result=0;
    console.info(typeof a);
    for (var i in arguments){
        console.info(typeof i)
        console.info(i);
        result+=parseInt(i);
    }
    console.info(result);
})(1,2,3)
function add(a,b){
    console.info(typeof a)
    console.info(typeof b)
    return a+b;
}
console.info(add(1,2));