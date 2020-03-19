package com.lrj.lrjmanagement.service.impl;

import com.lrj.lrjmanagement.dao.ItemMapper;
import com.lrj.lrjmanagement.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lxh
 * @date 2020/3/19 10:05
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private ItemMapper itemMapper;
}
