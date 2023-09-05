package com.sinsa.recoll.Controller;

import com.sinsa.recoll.Service.RecollService;
import com.sinsa.recoll.VO.RecollVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class RecollController {
    @Autowired
    RecollService recollService;
    @GetMapping("/")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mav = new ModelAndView("/index");
        return mav;
    }

    //조회
    @GetMapping("/recoll-list")
    public ModelAndView studentList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<RecollVO> lists = recollService.selectAllRecoll();
        ModelAndView mav = new ModelAndView("/recoll/list");
        mav.addObject("list",lists);
        return mav;
    }

    //삽입
    @GetMapping("/recoll-insert")
    public ModelAndView getstudentInsert(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mav = new ModelAndView("/recoll/insert");
        return mav;
    }

    @PostMapping("/recoll-insert")
    public ModelAndView poststudentInsert(@ModelAttribute("RecollVO")RecollVO recollVO, HttpServletResponse response) throws Exception {
        recollService.insertRecoll(recollVO);
        ModelAndView mav = new ModelAndView("redirect:/recoll-list");
        return mav;
    }

    //수정
    @GetMapping("/recoll-update")
    public ModelAndView getstudentUpdate(@RequestParam("sno") int sno, HttpServletResponse response) throws Exception {
        RecollVO list = recollService.selectUpdate(sno);
        ModelAndView mav = new ModelAndView("/recoll/update");
        mav.addObject("data",list);
        return mav;
    }

    @PostMapping("/recoll-update")
    public ModelAndView poststudentUpdate(@ModelAttribute("RecollVO")RecollVO recollVO, HttpServletResponse response) throws Exception {
        recollService.updateRecoll(recollVO);
        ModelAndView mav = new ModelAndView("redirect:/recoll-list");
        return mav;
    }

    @GetMapping("/recoll-delete")
    public ModelAndView studentDelete(@RequestParam("sno") int sno, HttpServletResponse response) throws Exception {
        recollService.deleteRecoll(sno);
        ModelAndView mav = new ModelAndView("redirect:recoll-list");
        return mav;
    }

}
