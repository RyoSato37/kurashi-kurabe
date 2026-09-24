package com.example.kurashikurabe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  // G-1 トップページ／検索・比較画面
  @GetMapping("/")
  public String index() {
    return "index";
  }
}