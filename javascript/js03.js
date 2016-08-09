function removeWithoutCopy(arr, item) {
    for(var i=arr.length;i>-1;i--){
        if(arr[i]==item){
            arr.splice(i,1);

        }
    }
    return arr;
}