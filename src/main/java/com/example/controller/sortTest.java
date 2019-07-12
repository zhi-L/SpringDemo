package learn;

import java.util.*;

/**
 * @program: learn-java
 * @description:
 * @author: Rodger Luo
 * @create: 2019-03-11 13:46
 **/
public class sortTest {


    public static void main(String [] args){
        String jsapi_ticket="kgt8ON7yVITDhtdwci0qef4Fd1u2d2iWwTE-nt2tSR7Me3FmWAhtxJa3QQCiMdLper4cUrqpDxkDJ6ljLgc7PA";
        int timestamp=1460637652;
        String nonceStr="C1WNnEpCwq4wa158";
        String url="http://qq.test.com/test/index.html";



//字典序排序
        HashMap<String,String> map=new HashMap<String,String>();

        map.put("jsapi_ticket", jsapi_ticket);
        map.put("timestamp", timestamp+"");
        map.put("nonceStr", nonceStr);
        map.put("url", url);

        Collection<String> keyset= map.keySet();

        List list=new ArrayList<String>(keyset);

        Collections.sort(list);
//这种打印出的字符串顺序和微信官网提供的字典序顺序是一致的
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"="+map.get(list.get(i)));
        }

//微信官网写的按照字典序排序后的字符串
        String sign="jsapi_ticket="+jsapi_ticket+"&noncestr="+nonceStr+"×tamp="+timestamp+"&url="+url;


//
////System.out.println(DigestUtils.shaHex("jsapi_ticket=sM4AOVdWfPE4DxkXGEs8VMCPGGVi4C3VM0P37wVUCFvkVAy_90u5h9nbSlYy3-Sl-HhTdfl2fzFy1AOcHKP7qg&noncestr=Wm3WZYTPz0wzccnW×tamp=1414587457&url=http://mp.weixin.qq.com?params=value"));
////微信返回的加密串
//        String signature=DigestUtils.shaHex(sign);//sha1加密
//        System.out.println(signature);


    }

}
