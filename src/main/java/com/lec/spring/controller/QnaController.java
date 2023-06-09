package com.lec.spring.controller;

import com.lec.spring.domain.Qna;
import com.lec.spring.domain.QnaValidator;
import com.lec.spring.service.QnaService;
import com.lec.spring.util.U;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.naming.Binding;
import java.util.List;
import java.util.Map;

// Controller layer
//  request 처리 ~ response
@Controller
@RequestMapping("/qna")
public class QnaController {

    @Autowired
    public void setQnaService(QnaService qnaService) {
        this.qnaService = qnaService;
    }

    private QnaService qnaService;

    public QnaController(){
        System.out.println("QnaController() 생성");
    }

    @GetMapping("/write")
    public void write(){}

    @PostMapping("/write")
    public String writeOk(
            @Valid Qna qna
            , BindingResult result
            , Model model
            , RedirectAttributes redirectAttributes
    ){

        if(result.hasErrors()){
            redirectAttributes.addFlashAttribute("subject", qna.getSubject());
            redirectAttributes.addFlashAttribute("content", qna.getContent());

            List<FieldError> errorList = result.getFieldErrors();
            for(FieldError err : errorList){
                redirectAttributes.addFlashAttribute("error", err.getCode());
                break;
            }
            return "redirect:/qna/write";
        }

        model.addAttribute("result", qnaService.write(qna));
        model.addAttribute("dto", qna);
        return "qna/writeOk";
    }

    @GetMapping("/detail")
    public void detail(long id, Model model){
        model.addAttribute("list", qnaService.detail(id));
        model.addAttribute("conPath", U.getRequest().getContextPath());
    }

    // 페이징 사용
    @GetMapping("/list")
    public void list(Integer page, Model model){
        model.addAttribute("adminL", qnaService.listAdmin());
        qnaService.list(page, model);
    }

    @GetMapping("/update")
    public void update(long id, Model model){
        model.addAttribute("list", qnaService.selectById(id));
    }

    @PostMapping("/update")
    public String updateOk(
            @Valid Qna qna
            , BindingResult result
            , Model model
            , RedirectAttributes redirectAttributes
    ){

        if(result.hasErrors()){
            Long n1 = qna.getId();
            redirectAttributes.addFlashAttribute("subject", qna.getSubject());
            redirectAttributes.addFlashAttribute("content", qna.getContent());

            List<FieldError> errorList = result.getFieldErrors();
            for(FieldError err : errorList){
                redirectAttributes.addFlashAttribute("error", err.getCode());
                break;
            }
            return "redirect:/qna/update?id="+n1;

        }
        model.addAttribute("result", qnaService.update(qna));
        model.addAttribute("dto", qna);
        return "qna/updateOk";
    }

    @PostMapping("/delete")
    public String deleteOk(long id, Model model){
        model.addAttribute("result", qnaService.deleteById(id));
        return "qna/deleteOk";
    }

    @GetMapping("/myqna")
    public void list(Long userId, Model model){
        model.addAttribute("myqna", qnaService.myqnaList(userId));


    }

    // 이 컨트롤러 클래스의 handler 에서 폼 데이터를 바인딩 할때 검증하는 Validator 객체 지정
    @InitBinder
    public void initBinder(WebDataBinder binder){
        System.out.println("initBinder() 호출");
        binder.setValidator(new QnaValidator());
    }

    // 페이징
    // pageRows 변경시 동작
    @PostMapping("/pageRows")
    public String pageRows(Integer page, Integer pageRows){
        U.getSession().setAttribute("pageRows", pageRows);
        return "redirect:/qna/list?page=" + page;
    }

}










