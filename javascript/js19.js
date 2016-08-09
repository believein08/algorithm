/**
 * Created by zhangyu on 2016/7/22.
 */
function count(start, end) {
    var intervalId = null;

    function log() {
        console.log(start++)
        if (start == end + 1) {
            clearInterval(intervalId);
        }
    }

    console.log(start++)
    intervalId = setInterval(log, 100);

    return {
        cancel: function () {

            clearInterval(intervalId);
        }


    }
}
count(1,10);
