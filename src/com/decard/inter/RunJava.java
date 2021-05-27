package com.decard.inter;

import com.decard.inter.impl.UserService1;
import com.decard.inter.impl.UserService2;
import com.decard.inter.impl.UserService3;
import com.decard.inter.pankuimpl.PanKuTest1;
import com.decard.inter.pankuimpl.PanKuTest2;
import com.decard.inter.pankuimpl.PanKuTest3;
import com.decard.inter.pankuimpl.PanKuTest4;

public class RunJava {

    private static UserInterface anInterface;

    public static void main(String[] args) {

        anInterface = new UserService1();
        anInterface.addUser();

        anInterface = new UserService2();
        anInterface.addUser();

        anInterface = new UserService3();
        anInterface.addUser();

        BeanFactory.getInstance(UserService1.class).addUser();
        BeanFactory.getInstance(UserService2.class).addUser();
        BeanFactory.getInstance(UserService3.class).addUser();


        IPankuApiService.BaseResponse base1 = BeanFactory.getInstance(PanKuTest1.class).pack(new IPankuApiService.ParaBean("method1"));

        IPankuApiService.BaseResponse base2 =  BeanFactory.getInstance(PanKuTest2.class).pack(new IPankuApiService.ParaBean("method2"));

        IPankuApiService.BaseResponse base3 =  BeanFactory.getInstance(PanKuTest3.class).pack(new IPankuApiService.ParaBean("method3"));

        IPankuApiService.BaseResponse base4 =  BeanFactory.getInstance(PanKuTest4.class).pack(new IPankuApiService.ParaBean("method4"));
        System.out.println("返回码   "+base1.code+"    "+base2.code+"   "+base3.code+"    "+base4.code);
    }
}
