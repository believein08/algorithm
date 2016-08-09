function removeWithoutCopy(arr, item) {
    return arr.filter(function(x){
        return x!=item;
    })
}
a=removeWithoutCopy([1, 2, 3, 4, 2], 2);
console.info(a[0]);