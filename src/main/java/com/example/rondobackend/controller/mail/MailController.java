package com.example.rondobackend.controller.mail;


import com.example.rondobackend.model.mail.Mail;
import com.example.rondobackend.service.mail.MailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("mail")
public class MailController {
    private MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping
    public ResponseEntity<String> sendMail(@RequestBody Mail mail){
        if (mailService.validateEmail(mail.getSendFromMail()) == true) {

            mailService.sendMail(
                    mail.getSendFromMail(),
                    mail.getSubject(),
                    mail.getMessage(),
                    mail.getName());
            return ResponseEntity.ok("mail sendt");
        } else {
            return ResponseEntity.badRequest().body("email ikke valid");
        }

    }

}