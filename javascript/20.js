/**
 * Created by zhangyu on 2016/7/22.
 */
function fizzBuzz(num) {
        if (num == null && typeof num == "number")
            return false
        s = ""
        if (num % 3 == 0) {
            s += "fizz"
        }
        if (num % 5 == 0) {
            s += "Buzz"
        }
        if (s == "")
            return num
        return s;
    }

console.info(fizzBuzz("adfsf"))

