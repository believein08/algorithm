/**
 * Created by zhangyu on 2016/7/22.
 */

function insert(arr, item, index) {
    console.info(arr.slice(0).splice(index,1));

    return arr.slice(0).splice(index,0,item);
}
console.info(insert([1, 2, 3, 4], 'z', 2))