package com.example.kurashikurabe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MunicipalityController {

  // G-2 自治体詳細画面
  // モック段階ではidを使わず工程6でDBから取得する
  @GetMapping("/municipalities/{id}")
  public String detail(@PathVariable Integer id) {
    return "municipality-detail";
  }
}