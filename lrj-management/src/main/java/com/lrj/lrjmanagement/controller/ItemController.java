package com.lrj.lrjmanagement.controller;

import com.lrj.lrjmanagement.service.ItemService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lxh
 * @date 2020/3/19 10:00
 */
@RestController
public class ItemController {
    @Resource
    private ItemService itemService;
}
