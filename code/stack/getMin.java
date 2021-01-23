public class Main {
    static void check(Object a, Object b){
        if(a.equals(b)){
            System.out.println(String.format("%s == %s", a, b));
        } else {
            throw new AssertionError();
        }
    }
    public static void main(String[] args) {
        MyStack mStack = new MyStack();
        mStack.push(34);
        check(mStack.getMin(), 34);
        mStack.push(32);
        check(mStack.getMin(), 32);
        mStack.push(31);
        check(mStack.getMin(), 31);
        mStack.push(34);
        check(mStack.getMin(), 31);
        check(mStack.pop(), 34);
        check(mStack.getMin(), 31);
        check(mStack.pop(), 31);
        check(mStack.getMin(), 32);
        mStack.push(100);
        mStack.push(1);
        check(mStack.getMin(), 1);
        check(mStack.pop(), 1);
        check(mStack.getMin(), 32);
    }
}
class MyStack {
    public MyStack() {
        this.stack = new Stack<>();
    }

    Stack<Integer> stack;
    private Integer minElem;
    public Integer getMin(){
        if(stack.isEmpty()){
            return -1;
        } else{
            return minElem;
        }
    }
    public Integer peek(){
        if(stack.isEmpty()){
            return -1;
        }
        Integer t = stack.peek();
        if(t < this.minElem){
            return minElem;
        } else{
            return t;
        }
    }
    public Integer pop(){
        if(stack.isEmpty()){
            return -1;
        }
        Integer t = stack.pop();
        if(t < minElem){
            Integer temp = minElem;
            minElem = 2 * minElem - t;
            return temp;
        } else {
            return t;
        }
    }
    public void push(Integer x){
        if(stack.isEmpty()){
            minElem = x;
            stack.push(x);
            System.out.println(String.format("\n\tInserting %s Done", x));
            return;
        }
        // otherwise
        if(x < minElem){
            stack.push(2 * x - minElem);
            minElem = x;
        } else {
            stack.push(x);
        }
        System.out.println(String.format("\n\t-> Inserting %s Done", x));
    }
}


