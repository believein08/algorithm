function sum(arr) {
	var sum=arr.reduce(function(pre,cur){
        return pre+cur;
    });
    return sum
}