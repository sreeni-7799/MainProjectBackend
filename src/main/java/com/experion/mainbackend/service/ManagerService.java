package com.experion.mainbackend.service;

import com.experion.mainbackend.dao.ManagerRepo;
import com.experion.mainbackend.entity.Manager;
import com.experion.mainbackend.helper.Helper;
import com.experion.mainbackend.dao.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepo managerRepo;

    public void save(MultipartFile file) {

        try {
            List<Manager> products = Helper.convertExcelToListOfManager(file.getInputStream());
            this.managerRepo.saveAll(products);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Manager> getAllManagers() {
        return this.managerRepo.findAll();
    }


}
