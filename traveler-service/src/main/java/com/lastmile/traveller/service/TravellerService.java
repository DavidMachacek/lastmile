/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lastmile.traveller.service;

import com.lastmile.KafkaEventsService;
<<<<<<< HEAD
import com.lastmile.MatchService;
=======
import com.lastmile.traveller.utils.UuidGen;
>>>>>>> 5ad838ef0cf0abc81f220f46d8fafe4fa5c8ae3b
import com.lastmiles.TransferOffer;
import com.lastmiles.TransferRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author David
 */
@Service
public class TravellerService {

    
    private final KafkaEventsService kafkaEventsService;
    private final MatchService matchService;

    @Autowired
<<<<<<< HEAD
    public TravellerService(KafkaEventsService kafkaEventsService,
                            MatchService matchService) throws IOException {
        this.matchService = matchService;
=======
    public TravellerService(KafkaEventsService kafkaEventsService) throws Exception {
>>>>>>> 5ad838ef0cf0abc81f220f46d8fafe4fa5c8ae3b
        this.kafkaEventsService = kafkaEventsService;
    }
<<<<<<< HEAD
}
 

/*
    
    private static ConcurrentMap<String, TransferRequest> transferRequestMap = new ConcurrentHashMap();
    private static ConcurrentMap<String, TransferOffer> transferOfferMap = new ConcurrentHashMap();
=======

>>>>>>> 5ad838ef0cf0abc81f220f46d8fafe4fa5c8ae3b

    private TransferOffer to;
    private TransferRequest tr;
    
    public TransferRequest processRequest(TransferRequest tr) {
        addToMapRequest(tr.getRequestId(), tr);
        try {
            kafkaEventsService.produce(tr);
            return tr;
        } catch (IOException ex) {
            Logger.getLogger(TravellerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void addOffer(TransferOffer to) {
        addToMapOffer(to.getOfferId(), to);
    }

    private TransferRequest assignRequest(TransferOffer to) {

        for (Map.Entry<String, TransferRequest> entry : transferRequestMap.entrySet()) {
            if (entry.getKey().equals(to.getOfferId())) {
                return entry.getValue();
            }
        }
        return null;
    }
    

    public List<TransferOffer> getListOffer() {
        return convertToList(transferOfferMap);
    }


    private <T> List<T> convertToList(ConcurrentMap<String, T> map) {
        List<T> list = new ArrayList<>(map.values());
        return list;
    }

    // Get By ID
    private <T> T getByIdFromMap(ConcurrentMap<String, T> map, String key) {
        for (Map.Entry<String, T> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public TransferOffer getOfferById(String id) {
        to = getByIdFromMap(transferOfferMap, id);
        return to;
    }

    public TransferRequest getRequestById(String id) {
        tr = getByIdFromMap(transferRequestMap, id);
        return tr;
    }

    // Add to map
    private void addToMapRequest(String s, TransferRequest tr) {

        if (!transferRequestMap.containsKey(s))
            transferRequestMap.put(s, tr);
    }

    private void addToMapOffer(String s, TransferOffer to) {
        if (!transferOfferMap.containsKey(s)) {
            transferOfferMap.put(s, to);
        }
    }*/

