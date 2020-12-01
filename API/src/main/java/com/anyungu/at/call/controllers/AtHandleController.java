package com.anyungu.at.call.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.anyungu.at.call.models.AtHandleRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AtHandleController {

    @PostMapping(value = "/at/handle", produces = MediaType.APPLICATION_XML_VALUE)
    public void requestFromAt(HttpServletRequest request) {

        BufferedReader br;
        try {
            br = request.getReader();

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            System.out.println(sb.toString());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @GetMapping(value = "/path")
    public String getMethodName() {
        return "new SomeData()";
    }

}
