package com.gupao.study.patterns.template.callback;

public class Test {

    public static void main(String[] args) {

        HummerTemplate template = new HummerTemplate();

        //new 接口-->>回调产生模版方法模式
        template.run(new HummerCallBack() {
            @Override
            public void start() {
                System.out.println("汽车发动......");
            }

            @Override
            public void stop() {
                System.out.println("汽车停止......");
            }

            @Override
            public void alarm() {
                System.out.println("汽车鸣笛......");
            }

            @Override
            public void engineBoom() {
                System.out.println("汽车轰鸣......");
            }

            @Override
            public boolean isAlarm() {
                //让汽车鸣笛
                return true;
            }
        });
    }
}
