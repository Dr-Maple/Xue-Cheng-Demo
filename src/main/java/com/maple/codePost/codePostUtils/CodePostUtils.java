package com.maple.codePost.codePostUtils;


import com.aspose.words.Document;
import com.aspose.words.FindReplaceOptions;

import java.util.Scanner;

public class CodePostUtils {



    //判断有多少个审计报告
    public void codePostStart() throws Exception {
        System.out.println("Please enter a request name: \n");
        Scanner sc = new Scanner(System.in);
        String[] allMsg = new String[99];
        int i = 0;
        while(sc.hasNext()) {
            String msg = sc.nextLine();
                if(msg=="")
                    break;
                String[] a = msg.split("-");
                msg = "";
                if(a.length>0)
                    for (int j = 0; j < a.length; j++) {
                        msg+=a[j];
                    }
                else{
                    msg = a[0];
                }
            System.out.println("\n");
            System.out.println((i+1)+"."+msg);
            allMsg[i++] = msg;
        }
        while(i--!=0){
            codePostVO(allMsg[i]+"@代码审计报告");
        }
    }

    //启动代码审计报告生成
    public  void codePostVO(String msg) throws Exception {
        // 加载文档
        Document doc = new Document("C:\\Users\\13022\\Desktop\\AsiaInfoHome\\快速搭建\\codepost.docx");

        // 使用查找和替换进行更新
        // 使用 Replace 方法指定搜索字符串和替换字符串。
        doc.getRange().replace("9-23", "9-25", new FindReplaceOptions());
        doc.getRange().replace("30", "31", new FindReplaceOptions());
        doc.getRange().replace("5213", "6666", new FindReplaceOptions());


        // 保存文档
        doc.save("C:\\Users\\13022\\Desktop\\codePost\\"+msg+".pdf");
        String addres = "C:\\Users\\13022\\Desktop\\codePost";
        System.out.println("\nHas already been generated："+msg+"\n\nLocated at the address："+addres);

    }
}
