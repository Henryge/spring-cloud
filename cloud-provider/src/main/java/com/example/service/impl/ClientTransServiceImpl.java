package com.example.service.impl;

import com.example.mapper.ClientTransPOMapper;
import com.example.model.ClientTransPO;
import com.example.service.ClientTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientTransServiceImpl implements ClientTransService {

    @Autowired
    ClientTransPOMapper clientTransPOMapper;

    @Override
    public ClientTransPO loadData(Long pk) {
        return clientTransPOMapper.selectByPK(pk);
    }
}
