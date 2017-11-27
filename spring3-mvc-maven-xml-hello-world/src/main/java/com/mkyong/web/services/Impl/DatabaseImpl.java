package com.mkyong.web.services.Impl;

import com.mkyong.web.services.DatabaseDTO;
import org.springframework.stereotype.Service;

@Service
public class DatabaseImpl implements DatabaseDTO {
    @Override
    public String printstring() {
        return "hello harsh";
    }
}
