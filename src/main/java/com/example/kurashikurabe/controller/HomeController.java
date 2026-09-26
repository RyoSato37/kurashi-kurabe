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

  // G-3 会員登録画面（モック。工程4で認証用Controllerへ移す）
  @GetMapping("/register")
  public String register() {
    return "register";
  }

  // G-4 ログイン画面（モック。工程4で認証用Controllerへ移す）
  @GetMapping("/login")
  public String login() {
    return "login";
  }
}