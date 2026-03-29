import java.util.Stack;
public class _02_opearations_stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        // pushing the element in the top of the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        // pop()
        int removedElement=stack.pop();
        System.out.println(removedElement);
        System.out.println(stack);

        // peek():it is used to see the top element in stack
        System.out.println(stack.peek());

        // isempty()
        System.out.println(stack.isEmpty());

        // size()
        System.out.println(stack.size());

        // add the element in between the stack
        stack.add(3,7);
        System.out.println(stack);

        // remove the element from the give index into the stack
        stack.remove(3);
        System.out.println(stack);  // element remove at index 3 from the stack

        // search
        int search=stack.search(3);  // return the index of element from stack.it is 1 based indexing system
        System.out.println(search);
    }
}
