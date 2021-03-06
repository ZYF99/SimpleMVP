package com.zyf.factory.data.helper;


import com.zyf.common.factory.data.base.DataSource;
import com.zyf.factory.model.homepage.Author;
import com.zyf.factory.model.homepage.Dynamic;
import com.zyf.factory.model.homepage.RequestModel_getDynamicList;
import java.util.ArrayList;
import java.util.List;

/*
 * 关于动态（类似一条说说）的
 * 数据的操作
 * */
public class DynamicHelper {



    /**
     * @param model    传递一个fun1 model的接口
     * @param callback 成功与失败的接口回送
     */
    public static void getList(final RequestModel_getDynamicList model, final DataSource.Callback<List<Dynamic>> callback) {
        //调用Retrofit对我们的网络请求接口做代理
        //RemoteService service = NetWork.remote();


        //模拟网络获取了数据
        List<Dynamic> list = new ArrayList<>();
        List<String> imgList = new ArrayList<>();
        imgList.add("https://youimg1.c-ctrip.com/target/10020s000000hxqgv3498_R_671_10000_Q90.jpg?proc=autoorient");
        imgList.add("https://youimg1.c-ctrip.com/target/100t0s000000hqv09EB5D_R_1024_10000_Q90.jpg?proc=autoorient");
        imgList.add("https://youimg1.c-ctrip.com/target/100q0s000000hs3uu9A7D_R_671_10000_Q90.jpg?proc=autoorient");
        imgList.add("https://youimg1.c-ctrip.com/target/100j0s000000hqg6u8C5E_R_1024_10000_Q90.jpg?proc=autoorient");
        imgList.add("https://youimg1.c-ctrip.com/target/100h0s000000hs4ub12BD_R_671_10000_Q90.jpg?proc=autoorient");

        list.add(new Dynamic(new Author("ShuaiBi张", "http://img.52z.com/upload/news/image/20180213/20180213062641_35687.jpg"),
                "成都 | 在建设路网红小吃街吃出一条血路",
                "“吃在中国，味在四川”\n" +
                        "\n" +
                        "这句四方流传的名言\n" +
                        "\n" +
                        "道出了川菜“尚滋味”、“好辛香”的传统饮食特点\n" +
                        "\n" +
                        "众所周知\n" +
                        "\n" +
                        "四川美食天下无敌\n" +
                        "\n" +
                        "而成都的小吃更是天生带有王者属性！" +
                        "",
                imgList,
                2564,
                888));
        list.add(new Dynamic(new Author("ShuaiBi张", "http://img.52z.com/upload/news/image/20180213/20180213062641_35687.jpg"),
                "成都 | 在建设路网红小吃街吃出一条血路",
                "“吃在中国，味在四川”\n" +
                        "\n" +
                        "这句四方流传的名言\n" +
                        "\n" +
                        "道出了川菜“尚滋味”、“好辛香”的传统饮食特点\n" +
                        "\n" +
                        "众所周知\n" +
                        "\n" +
                        "四川美食天下无敌\n" +
                        "\n" +
                        "而成都的小吃更是天生带有王者属性！" +
                        "",
                imgList,
                2564,
                888));
        list.add(new Dynamic(new Author("ShuaiBi张", "http://img.52z.com/upload/news/image/20180213/20180213062641_35687.jpg"),
                "成都 | 在建设路网红小吃街吃出一条血路",
                "“吃在中国，味在四川”\n" +
                        "\n" +
                        "这句四方流传的名言\n" +
                        "\n" +
                        "道出了川菜“尚滋味”、“好辛香”的传统饮食特点\n" +
                        "\n" +
                        "众所周知\n" +
                        "\n" +
                        "四川美食天下无敌\n" +
                        "\n" +
                        "而成都的小吃更是天生带有王者属性！" +
                        "",
                imgList,
                2564,
                888));
        list.add(new Dynamic(new Author("ShuaiBi张", "http://img.52z.com/upload/news/image/20180213/20180213062641_35687.jpg"),
                "成都 | 在建设路网红小吃街吃出一条血路",
                "“吃在中国，味在四川”\n" +
                        "\n" +
                        "这句四方流传的名言\n" +
                        "\n" +
                        "道出了川菜“尚滋味”、“好辛香”的传统饮食特点\n" +
                        "\n" +
                        "众所周知\n" +
                        "\n" +
                        "四川美食天下无敌\n" +
                        "\n" +
                        "而成都的小吃更是天生带有王者属性！" +
                        "",
                imgList,
                2564,
                888));
        list.add(new Dynamic(new Author("ShuaiBi张", "http://img.52z.com/upload/news/image/20180213/20180213062641_35687.jpg"),
                "成都 | 在建设路网红小吃街吃出一条血路",
                "“吃在中国，味在四川”\n" +
                        "\n" +
                        "这句四方流传的名言\n" +
                        "\n" +
                        "道出了川菜“尚滋味”、“好辛香”的传统饮食特点\n" +
                        "\n" +
                        "众所周知\n" +
                        "\n" +
                        "四川美食天下无敌\n" +
                        "\n" +
                        "而成都的小吃更是天生带有王者属性！" +
                        "",
                imgList,
                2564,
                888));
        list.add(new Dynamic(new Author("ShuaiBi张", "http://img.52z.com/upload/news/image/20180213/20180213062641_35687.jpg"),
                "成都 | 在建设路网红小吃街吃出一条血路",
                "“吃在中国，味在四川”\n" +
                        "\n" +
                        "这句四方流传的名言\n" +
                        "\n" +
                        "道出了川菜“尚滋味”、“好辛香”的传统饮食特点\n" +
                        "\n" +
                        "众所周知\n" +
                        "\n" +
                        "四川美食天下无敌\n" +
                        "\n" +
                        "而成都的小吃更是天生带有王者属性！" +
                        "",
                imgList,
                2564,
                888));
        list.add(new Dynamic(new Author("ShuaiBi张", "http://img.52z.com/upload/news/image/20180213/20180213062641_35687.jpg"),
                "成都 | 在建设路网红小吃街吃出一条血路",
                "“吃在中国，味在四川”\n" +
                        "\n" +
                        "这句四方流传的名言\n" +
                        "\n" +
                        "道出了川菜“尚滋味”、“好辛香”的传统饮食特点\n" +
                        "\n" +
                        "众所周知\n" +
                        "\n" +
                        "四川美食天下无敌\n" +
                        "\n" +
                        "而成都的小吃更是天生带有王者属性！" +
                        "",
                imgList,
                2564,
                888));


        callback.onDataLoaded(list);
        /*
        //得到一个Call
        Call<RspModel<List<Dynamic>>> call = service.getList(model);
        //异步的请求
        call.enqueue(new Callback<RspModel<List<Dynamic>>>() {
            @Override
            public void onResponse(Call<RspModel<List<Dynamic>>> call, Response<RspModel<List<Dynamic>>> response) {
                RspModel<List<Dynamic>>rspModel = response.body();
                if(rspModel.success()){
                    callback.onDataLoaded(rspModel.getResult());
                }else {
                    Factory.decodeRspCode(rspModel,callback);
                }
            }

            @Override
            public void onFailure(Call<RspModel<List<Dynamic>>> call, Throwable t) {
                callback.onDataNotAvaliable(R.string.data_network_error);
            }
        });

        */


    }


}
