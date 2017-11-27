package com.mkyong.web.controller;

import com.mkyong.web.services.DatabaseDTO;
import com.mkyong.web.services.Impl.DatabaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Main {
        DatabaseDTO databaseDTO=new DatabaseImpl();
        @Autowired
        public void getString(DatabaseDTO databaseDTO){
            databaseDTO.printstring();
        }


}
