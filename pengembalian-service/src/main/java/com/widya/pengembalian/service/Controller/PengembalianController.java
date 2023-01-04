/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.widya.pengembalian.service.Controller;

import com.widya.pengembalian.service.Entity.Pengembalian;
import com.widya.pengembalian.service.Service.PengembalianService;
import com.widya.pengembalian.service.Vo.ResponseTemplateVo;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
@RequestMapping("/pengembalian")
public class PengembalianController {
    @Autowired
    private PengembalianService pengembalianService;
    
    @PostMapping("/")
    public Pengembalian savePengembalian(@RequestBody Pengembalian pengembalian) throws ParseException{
        return pengembalianService.savePengembalian(pengembalian);
    }
    
    @GetMapping("{id}")
    public ResponseTemplateVo getPengembalian(@PathVariable("id") Long pengembalianId){
     return pengembalianService.getPengembalian(pengembalianId);
    }
}

