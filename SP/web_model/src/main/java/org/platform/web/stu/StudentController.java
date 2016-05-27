package org.platform.web.stu;

import org.platform.myAnnotation.AESAnnotion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuzhongshuai on 16/5/27.
 */
@Controller
@RequestMapping(value = "studentController")
public class StudentController {




    @AESAnnotion()
    @RequestMapping(value="getStuNameById")
    public String getStuNameById(){



        return "hellow ase/////";
    }


}
