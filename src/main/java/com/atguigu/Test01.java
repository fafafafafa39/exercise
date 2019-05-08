package com.atguigu;


import com.atguigu.bean.Man;
import com.atguigu.bean.Person;
import org.apache.commons.lang.StringUtils;


/**
 * @author shkstart
 * @create 2019-04-21 19:57
 */
public class Test01 {

    public static void main(String[] args) {

        Person person = new Person("xz",25,new Man("111"));

        person.getMan().setHobby(null);

        if(StringUtils.isBlank(person.getMan().getHobby())){
            System.out.println("22222");
        }

        if(person.getMan()==null){
            System.out.println("123");
        }

        /*boolean blank = StringUtils.isBlank(person.getMan().getHobby());
        System.out.println(blank);
*/

    }
}
