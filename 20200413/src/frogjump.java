public class frogjump {
    //青蛙一次跳一个或两个，有几种跳法
    public int JumpFloor(int target) {
        if(target == 1) {
            return 1;
        }
        else if(target == 2) {
            return 2;
        }else {
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }
}
