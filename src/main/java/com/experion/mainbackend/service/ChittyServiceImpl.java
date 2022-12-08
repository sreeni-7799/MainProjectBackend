package com.experion.mainbackend.service;

import com.experion.mainbackend.dao.ChitRepository;
import com.experion.mainbackend.dto.ChittyPost;
import com.experion.mainbackend.dto.ChittyPostResponse;
import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.entity.Manager;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ChittyServiceImpl implements ChittyService{

    private ChitRepository chitRepository;

    public ChittyServiceImpl(ChitRepository chitRepository){this.chitRepository=chitRepository;}


    @Override
    public ChittyPostResponse saveChitty(ChittyPost chittyPost) {
        Chitty chitty=new Chitty();
        chitty.setChitNumber(chittyPost.getChitNumber());
        chitty.setInstallment(chittyPost.getInstallment());
        chitty.setDuration(chittyPost.getDuration());
        chitty.setManager(chittyPost.getManager());
        chitty.setNumberOfChittal(chittyPost.getNumberOfChittal());
        chitty.setCategory(chittyPost.getCategory());
        chitty.setTotalAmount(chittyPost.getTotalAmount());
        chitty.setLaunchDate(chittyPost.getLaunchDate());
        chitty.setStartDate(chittyPost.getStartDate());

        Manager manager=chittyPost.getManager();
        chitRepository.save(chitty);
        return null;
    }
}
