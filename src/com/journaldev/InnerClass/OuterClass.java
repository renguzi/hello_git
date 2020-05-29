package com.journaldev.InnerClass;

import java.io.File;
import java.io.FilenameFilter;
import java.io.OutputStream;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-10
 * @Description: com.journaldev.InnerClass
 * @Version:1.0
 */
public class OuterClass {
    private static String name = "OuterClass";
    private int i;
    protected int j;
    int k;
    public int l;

    public OuterClass(int i, int j, int k, int l) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }

    public int getI() {
        return this.i;
    }

    static class StaticNestedClass {
        private int a;
        protected int b;
        int c;
        public int d;

        public int getA() {
            return this.a;
        }

        public String getName() {
            return name;
        }
    }

    class InnerClass {
        private int w;
        protected int x;
        int y;
        public int z;

        public int getW() {
            return this.w;
        }

        public void setValues() {
            this.w = i;
            this.x = j;
            this.y = k;
            this.z = l;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "w=" + w +
                    ", x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }

        public String getName() {
            return name;
        }
    }

    public void print(String initial) {
        class Logger{
            String name;

            public Logger(String name) {
                this.name = name;
            }

            public void log(String string) {
                System.out.println(this.name + ": " + string);
            }
        }

        Logger logger = new Logger(initial);
        logger.log(name);
        logger.log(" " + this.i);
        logger.log(" " + this.j);
        logger.log(" " + this.k);
        logger.log(" " + this.l);
    }

    public String[] getFilesInDir(String dir, final String ext) {
        File file = new File(dir);
        String[] filesList=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(ext);
            }
        });
        return null;
    }
}
