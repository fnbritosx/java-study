package javamarathon.javacore.throwable.runtime_exception.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
       /* CHECKED E UNCHECKED
          example 1
          Object object = null;
          System.out.println(object.toString())*/;

        int[] nums = {1, 2};
        System.out.println(nums[2]);

    }
}
