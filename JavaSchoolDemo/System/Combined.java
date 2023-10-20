package JavaSchoolDemo.System;

import java.util.*;


public class Combined {
    public static void main(String[] args) {
        int[] src = {0, 1, 2, 3, 4};
        int[] dst = new int[src.length];
        System.arraycopy(src, 0, dst, 0, src.length);
        System.out.println("src: " + Arrays.toString(src));
        System.out.println("dst: " + Arrays.toString(dst));

        int[] dst1 = Arrays.copyOf(src, src.length);
        System.out.println("src: " + Arrays.toString(src));
        System.out.println("dst1: " + Arrays.toString(dst1));

        System.out.println("currentTimeMillis: " + System.currentTimeMillis());

        System.out.println("nanoTime: " + System.nanoTime());
        long dt = System.nanoTime() - System.nanoTime();
        System.out.println("Time difference: " + dt);

        System.out.println("getenvironment: " + System.getenv("JAVA_HOME"));
        Map<String, String> env = System.getenv();
        for (Map.Entry<String, String> entry : env.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

        // Iterator it = env.entrySet().iterator();
        // while(it.hasNext()){
        // Map.Entry<String,String> entry = (Map.Entry)it.next();
        //     System.out.println(entry.getKey()+":"+entry.getValue());
        // }
        // Array output
        //System.out.println("\nARRAY OUTPUT");
        //Array.setDimension(int[] :init[:
        }

    

